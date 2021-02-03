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

/**
 *
 * @author Administrator
 */
public class regAsLawServ extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    String imgname = "";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        MultipartRequest mp = new MultipartRequest(request, getServletContext().getRealPath("/imagees/"),200 *2048 * 2048,new FileRenamePolicy() {

                    @Override
                    public File rename(File file) {
                       System.out.println(file.getName()); 
                        imgname=file.getName();
                        return file;
                    }
                });
            String fname = mp.getParameter("fname");
            String lname = mp.getParameter("lname");
            String speee = mp.getParameter("spe");
            String loc = mp.getParameter("location");
            String fees = mp.getParameter("fees");
            String address = mp.getParameter("address");
            String phone = mp.getParameter("phone");
            String email = mp.getParameter("mail");
            String password = mp.getParameter("pass");
           String msgLaw = "";
            DB db = new DB();
        boolean f3 = db.boolSelectByMailLaw(email);
        boolean f4 = db.boolSelectByMailAll(email);

        if (f3 == false || f4 == false) {
            boolean f1 = db.insertIntoLaw(fname, lname, speee, loc, fees, address, phone, email, password, imgname,0);
            boolean f2 = db.insertIntoAll(fname, lname, speee, loc, fees, address, phone, email, password, imgname,0);
            if (f1 == true && f2 == true) {

                msgLaw = "Regestier Complete Sucssfully.... going to login";
            } else {
                msgLaw = "Proplem in register ... try again..!";
            }
        } else {
            msgLaw = "Please try with another mail";
        }
            request.setAttribute("msgLaw", msgLaw);
            RequestDispatcher rd = request.getRequestDispatcher("regAsLaw.jsp");
             rd.forward(request, response);
        
       
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
