/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ittepic.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.edu.ittepic.EJBS.EJBOperaciones;

/**
 *
 * @author DELL
 */
@WebServlet(name = "ActualizaMuseo", urlPatterns = {"/ActualizaMuseo"})
public class ActualizaMuseo extends HttpServlet {

    @EJB private
        EJBOperaciones ejb;
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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ActualizaMuseo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ActualizaMuseo at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        //processRequest(request, response);
        response.setContentType("application/json;charset=UTF-8");
        //Obligar al cliente HTTP a no guardar el resultado de este servlet
        response.setHeader("Cache-Control","no-store");
        
        //Crea el objeto necesario para devolver respuesta
        PrintWriter p = response.getWriter();
        
        int id_museo = Integer.parseInt(request.getParameter("id_museo"));
        String nombre_museo = request.getParameter("nombre_museo");
        String ciudad_museo = request.getParameter("ciudad_museo");
        String direccion_museo = request.getParameter("direccion_museo");
        String descripcion_corta = request.getParameter("descripcion_corta");
        String descripcion_larga = request.getParameter("descripcion_larga");
        String cantidad_visitas = request.getParameter("cantidad_visitas");
        String fk_id_seccion = request.getParameter("fk_id_seccion");
        p.write(ejb.actualizaMuseo(id_museo, nombre_museo, ciudad_museo, direccion_museo, descripcion_corta, descripcion_larga, Integer.parseInt(cantidad_visitas),fk_id_seccion));
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
