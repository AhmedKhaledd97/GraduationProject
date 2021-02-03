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
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Administrator
 */
public class editServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String imgName = "";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
             MultipartRequest mp = new MultipartRequest(request, getServletContext().getRealPath("/imagees/"), 200 * 2048 * 2048, new FileRenamePolicy() {

            @Override
            public File rename(File file) {
                System.out.println(file.getName());
                imgName = file.getName();
                return file;
            }
        });
            HttpSession ss = request.getSession(false);
            String fname = mp.getParameter("fname");
            String lname = mp.getParameter("lname");
            String feees = mp.getParameter("fees");
            String address = mp.getParameter("address");
            String phone = mp.getParameter("phone");
            String mail = (String)ss.getAttribute("email");
            String password = mp.getParameter("pass");
            
            DB db = new DB();
            boolean doc = db.boolSelectByMailDoc(mail);
            boolean eng = db.boolSelectByMailEng(mail);
            boolean law = db.boolSelectByMailLaw(mail);
            boolean teach = db.boolSelectByMailTeach(mail);
            boolean all = db.boolSelectByMailAll(mail);
            
            if(doc == true && all == true){
                db.doctorsUpdate(fname, lname, feees, address, phone, password,mail);
                db.Allupdate(fname, lname, feees, address, phone, password, mail);
                ss.invalidate();
                response.sendRedirect("login.jsp");
                
            }else if(eng == true && all == true){
                db.engUpdate(fname,lname,feees,address,phone,password,mail);
                db.Allupdate(fname, lname, feees, address, phone, password, mail);
                ss.invalidate();
                response.sendRedirect("login.jsp");
            }else if(law == true && all == true){
                
                db.lawUpdate(fname,lname,feees,address,phone,password,mail);
                db.Allupdate(fname,lname,feees,address,phone,password,mail);
                ss.invalidate();
                response.sendRedirect("login.jsp");
            }else if(teach == true && all == true){
                db.teachUpdate(fname, lname, feees, address, phone, password,mail);
                db.Allupdate(fname, lname, feees, address, phone, password, mail);
                ss.invalidate();
                response.sendRedirect("login.jsp");
            }else{
                response.sendRedirect("edit.jsp");
            }
            
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
