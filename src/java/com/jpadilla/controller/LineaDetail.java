/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jpadilla.controller;

import com.jpadilla.dao.LineaDao;
import com.jpadilla.entity.DatabaseConf;
import com.jpadilla.entity.Linea;
import com.jpadilla.utils.MyLogger;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jpadilla
 */
@WebServlet(name = "LineaDetail", urlPatterns = {"/lineadetail"})
public class LineaDetail extends HttpServlet {

    public static MyLogger logs = (MyLogger) MyLogger.getLogger("LineaDetail");

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
        String id_linea_str;
        int id_linea;

        Linea linea;
        linea = new Linea();
        DatabaseConf db = new DatabaseConf();
        db.setDatabaseConfSQL();
        LineaDao lineaDao = new LineaDao(db);

        id_linea_str = request.getParameter("id");
        id_linea = id_linea_str.equals("") ? 0 : Integer.parseInt(id_linea_str);

        linea = lineaDao.getLinea(id_linea);
        
        List<Linea> ls = new LinkedList<>();
        ls.add(linea);
        request.setAttribute("objeto", ls);
        request.setAttribute("mensaje", "LA LINEA EXISTE");
        request.getRequestDispatcher("detaillinea.jsp").forward(request, response);
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
