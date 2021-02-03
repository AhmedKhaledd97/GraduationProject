/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import DBClass.DB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Administrator
 */
public class deleteServ extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        DB db = new DB();
        HttpSession ss= request.getSession(false);
        String mail = (String)ss.getAttribute("email");
        String password = request.getParameter("pass");
        String rePassword = request.getParameter("repass");
        boolean boolDoc = db.boolSelectByMailDoc(mail);
        boolean boolEng = db.boolSelectByMailEng(mail);
        boolean boolLaw = db.boolSelectByMailLaw(mail);
        boolean boolTeach = db.boolSelectByMailTeach(mail);
        boolean boolAll = db.boolSelectByMailAll(mail);
        if(password.equals(rePassword)){
           if(boolDoc == true && boolAll == true){
               db.deletDoctors(mail , password);
               db.deletAll(mail, password);
               response.sendRedirect("home.jsp");
           } else if (boolEng == true && boolAll == true){
               db.deletEng(mail, password);
               db.deletAll(mail, password);
               response.sendRedirect("home.jsp");
           } else if(boolLaw == true && boolAll == true){
               db.deletLawyer(mail, password);
               db.deletAll(mail, password);
               response.sendRedirect("home.jsp");
           }else if(boolTeach == true && boolAll == true){
               db.deletTeach(mail, password);
               db.deletAll(mail, password);
               response.sendRedirect("home.jsp");
           }
        } else {
            request.setAttribute("message", "Tow Password not similar");
            RequestDispatcher rd = request.getRequestDispatcher("delete.jsp");
            rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
