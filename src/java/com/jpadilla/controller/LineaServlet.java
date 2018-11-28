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
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jpadilla
 */
@WebServlet(name = "LineaServlet", urlPatterns = {"/linea"})
public class LineaServlet extends HttpServlet {

    public static MyLogger logs = (MyLogger) MyLogger.getLogger("LineaServlet");

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
        String action = "", id_linea_str, nombre, id_propietario_str, activo_str;
        int id_linea = -1, id_propietario = 0, activo = 0;
        Linea linea = null;
        DatabaseConf db = new DatabaseConf();
        db.setDatabaseConfSQL();
        LineaDao lineaDao = new LineaDao(db);

        if (request.getParameter("action") != null) {
            action = request.getParameter("action");
        }

        if (request.getParameter("id_linea") != null) {
            id_linea_str = request.getParameter("id_linea");
            id_linea = id_linea_str.equals("") ? 0 : Integer.parseInt(id_linea_str);
        }

        nombre = request.getParameter("nombre");

        if (request.getParameter("id_propietario") != null) {
            id_propietario_str = request.getParameter("id_propietario");
            id_propietario = id_propietario_str.equals("") ? 0 : Integer.parseInt(id_propietario_str);
        }
        if (request.getParameter("activo") != null) {
            activo_str = request.getParameter("activo");
            activo = activo_str.equals("") ? 0 : Integer.parseInt(activo_str);
        }

        logs.info("" + action + id_linea + nombre + id_propietario + activo);

        try {
            if (action.equalsIgnoreCase("Add")) {
                if (lineaDao.getLinea(id_linea) == null) {
                    linea = new Linea(id_linea, nombre, id_propietario, activo);
                    lineaDao.addLinea(linea);
                    request.setAttribute("mensaje", "SE HA REGISTRADO LINEA");
                } else {
                    request.setAttribute("mensaje", "LA LINEA EXISTE");
                }
            } else if (action.equalsIgnoreCase("Edit")) {
                lineaDao.editLinea(linea);
                request.setAttribute("objeto", linea);
                request.setAttribute("mensaje", "SE HA ACTUALIZADO LA LINEA");
            } else if (action.equalsIgnoreCase("Delete")) {
                lineaDao.deleteLinea(id_linea);
                request.setAttribute("mensaje", lineaDao.errors.getMsg_error());
                if (lineaDao.errors.getCod_error() != 10) {
                    request.setAttribute("id_linea", id_linea);
                    request.getRequestDispatcher("lineaedit").forward(request, response);
                }
            } else if (action.equalsIgnoreCase("Search")) {
                //input text de busqueda
                request.setAttribute("objeto", lineaDao.getLinea(id_linea));
                request.setAttribute("mensaje", "SE HA ACTUALIZADO LA LINEA");
            }

            request.getRequestDispatcher("listlinea").forward(request, response);

        } catch (Exception ex) {
            request.setAttribute("mensaje", "Oops! Algo salió mal");
            request.setAttribute("detalle", ex.getMessage());
            request.getRequestDispatcher("error").forward(request, response);
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
