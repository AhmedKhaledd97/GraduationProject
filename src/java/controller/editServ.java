/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import DBClass.DB;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.FileRenamePolicy;
import java.io.File;
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
public class editServ extends HttpServlet {

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
            HttpSession ss = request.getSession(false);
         
            String fname = request.getParameter("fname");
            String lname = request.getParameter("lname");
            
            String price = request.getParameter("fees");
            String address = request.getParameter("address");
            String phone = request.getParameter("phone");
            String mail = (String)ss.getAttribute("email");
            String password = request.getParameter("pass");
            DB db = new DB();
            boolean doc = db.boolSelectByMailDoc(mail);
            boolean eng = db.boolSelectByMailEng(mail);
            boolean law = db.boolSelectByMailLaw( mail );
            boolean teach = db.boolSelectByMailTeach(mail);
            boolean all = db.boolSelectByMailAll(mail);
            if(all == true && doc == true){
                db.doctorsUpdate(fname, lname, price, address, phone, password,  mail);
                db.Allupdate(fname, lname, price, address, phone, password, mail);
                
                ss.invalidate();
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
             rd.forward(request, response);
             
             
             
            }else if (all == true && eng == true ){
                db.engUpdate(fname, lname, price, address, phone, password,  mail);
                db.Allupdate(fname, lname, price, address, phone, password, mail);
                
                ss.invalidate();
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
             rd.forward(request, response);
            }
            
            
            
            else if(all == true && law == true){
            
                db.lawUpdate(fname, lname, price, address, phone, password,mail);
                db.Allupdate(fname, lname, price, address, phone, password, mail);
                
                ss.invalidate();
               
            }
            
             else if(all == true && teach == true){
            
                db.teachUpdate(fname, lname, price, address, phone, password,  mail);
                db.Allupdate(fname, lname, price, address, phone, password,  mail);
                
                ss.invalidate();
                RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
             rd.forward(request, response);
            }else {
                 response.sendRedirect("edit.jsp");
             }
            try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + fname +lname+address+ "</h1>");
            out.println("</body>");
            out.println("</html>");
             
    }}

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
