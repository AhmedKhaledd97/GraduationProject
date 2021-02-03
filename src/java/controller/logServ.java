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
public class logServ extends HttpServlet {

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
        boolean doc, eng, law, teach, all;
        String mail = request.getParameter("mail");
        String pass = request.getParameter("password");
        String msg = "";
        DB db = new DB();
//        doc = db.doctorSearch(mail, pass);
//        eng = db.engSearch(mail, pass);
//        law = db.lawSerach(mail, pass);
//        teach = db.teacherSerach(mail, pass);
//        if(doc == true){
//         response.sendRedirect("home.jsp");
//        }
//        else if(eng == true ){
//         response.sendRedirect("home.jsp");
//        }
//        else if(law == true ){
//         response.sendRedirect("home.jsp");
//        }
//        else if(teach == true ){
//         response.sendRedirect("home.jsp");
//        }else if(doc == false && eng == false && law == false && teach == false){
//            request.setAttribute("msg", "E-mail or password incorrect");
//           RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
//        rd.forward(request, response);
//         
//        }

        all = db.AllSearch(mail, pass);
        if (all == true) {
            response.sendRedirect("profHome.jsp");
            HttpSession ss = request.getSession();
            ss.setAttribute("email", mail);
        } else {
            request.setAttribute("msg", "E-mail or password incorrect");
            RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
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
