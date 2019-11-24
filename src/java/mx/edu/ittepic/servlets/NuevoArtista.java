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
@WebServlet(name = "NuevoArtista", urlPatterns = {"/NuevoArtista"})
public class NuevoArtista extends HttpServlet {

    @EJB
    private EJBOperaciones ejb;
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
            out.println("<title>Servlet NuevoArtista</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NuevoArtista at " + request.getContextPath() + "</h1>");
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
        
        String nombre_artista = request.getParameter("nombre_artista");
        String biografia_corta = request.getParameter("biografia_corta");
        String biografia_larga = request.getParameter("biografia_larga");
        String valoracion = request.getParameter("valoracion");
        String visitas = request.getParameter("visitas");
        p.write(ejb.nuevoArtista(nombre_artista, biografia_corta, biografia_larga,Float.parseFloat(valoracion),Integer.parseInt(visitas)));
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
