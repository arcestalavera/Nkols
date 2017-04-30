/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Bean.RespondentModel;
import Database.Database;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Arces
 */
public class Respondent extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
        PrintWriter out = response.getWriter();

        out.println("Respondent GET");
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
//        PrintWriter out = response.getWriter();
//        
//        out.println("Respondent POST");
        Database db = Database.getInstance();
        //store respondent data
        RespondentModel respondent = new RespondentModel();
        respondent.setRespondent_type_id(Integer.parseInt(request.getParameter("respondent_type_id")));
        respondent.setEnumerator_id(Integer.parseInt(request.getParameter("enumerator_id")));
        respondent.setLang_id(Integer.parseInt(request.getParameter("lang_id")));
        respondent.setProvince_id(Integer.parseInt(request.getParameter("province_id")));
        respondent.setBarangay_id(Integer.parseInt(request.getParameter("barangay_id")));
        respondent.setAge(Integer.parseInt(request.getParameter("age")));
        respondent.setCode(request.getParameter("code"));
        respondent.setGender(request.getParameter("gender"));
        respondent.setBirthdate(request.getParameter("birthdate"));
        respondent.setTimestart(request.getParameter("timestart"));
        respondent.setTimefinish(request.getParameter("timefinish"));
        
        //add respondent to db
        db.addRespondent(respondent);
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
