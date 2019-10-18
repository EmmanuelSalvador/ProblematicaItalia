/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author DELL
 */
@WebServlet(name = "validacionLogin", urlPatterns = {"/validacionLogin"})
public class validacionLogin extends HttpServlet {

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
            out.println("<title>Servlet validacionLogin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet validacionLogin at " + request.getContextPath() + "</h1>");
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
        //processRequest(request, response);
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
        String url = null;
       
       /*String pUsuario = request.getParameter("usuario");
       String pPassword = request.getParameter("pass");*/
       
       
       PrintWriter out = response.getWriter();
       out.println("<!DOCTYPE html>\n" +
"<html lang=\"en\">\n" +
"<head>\n" +
"    <title>Nombre de la Página</title>\n" +
"    <meta charset=\"utf-8\">\n" +
"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n" +
"    <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n" +
"    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n" +
"    <link href=\"css/responsive.css\" rel=\"stylesheet\">\n" +
"    <script type=\"text/javascript\" src=\"recursos/funciones.js\"></script>\n" +
"    <link href=\"style.css\" rel=\"stylesheet\">\n" +
"    <!--<style type=\"text/css\">\n" +
".navbar {\n" +
"-webkit-border-radius: 0;\n" +
"-moz-border-radius: 0;\n" +
"border-radius: 0;\n" +
"}\n" +
"</style>-->\n" +
"</head>\n" +
"<body>\n" +
"\n" +
"    <!-- Inicio del Navbar -->\n" +
"    <header class=\"header_area clearfix\" style=\"background-color:#232323\">\n" +
"        <div class=\"container-fluid h-100\">\n" +
"            <div class=\"row h-100\">\n" +
"                <!-- Menu Area Start -->\n" +
"                <div class=\"col-12 h-100\">\n" +
"                    <div class=\"menu_area h-100\">\n" +
"                        <nav class=\"navbar h-100 navbar-expand-lg align-items-center\">\n" +
"                            <!-- Logo -->\n" +
"                            <a class=\"nav-link\" href=\"index.html\">\n" +
"                                <h1 style=\"color: #fff\">Arte</h1>\n" +
"                            </a>\n" +
"\n" +
"                            <!-- Menu Area -->\n" +
"                            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\n" +
"                                data-target=\"#mosh-navbar\" aria-controls=\"mosh-navbar\" aria-expanded=\"false\"\n" +
"                                aria-label=\"Toggle navigation\"><span class=\"navbar-toggler-icon\"></span></button>\n" +
"\n" +
"                            <div class=\"collapse navbar-collapse justify-content-end\" id=\"mosh-navbar\">\n" +
"                                <ul class=\"navbar-nav animated\" id=\"nav\">\n" +
"                                    <li class=\"nav-item\"><a class=\"nav-link\" href=\"index.html\">Inicio</a></li>\n" +
"                                    <li class=\"nav-item dropdown\">\n" +
"                                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"moshDropdownMuseos\" role=\"button\"\n" +
"                                            data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">Museos</a>\n" +
"                                        <div class=\"dropdown-menu\" aria-labelledby=\"moshDropdown\">\n" +
"                                            <a class=\"dropdown-item\" href=\"index.html\">Por ciudad</a>\n" +
"                                            <a class=\"dropdown-item\" href=\"about.html\">Por popularidad</a>\n" +
"                                            <div class=\"dropdown-divider\"></div>\n" +
"                                            <a class=\"dropdown-item\" href=\"elements.html\">Todos</a>\n" +
"                                        </div>\n" +
"                                    </li>\n" +
"                                    <li class=\"nav-item dropdown\">\n" +
"                                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"moshDropdownPinturas\" role=\"button\"\n" +
"                                            data-toggle=\"dropdown\" aria-haspopup=\"true\"\n" +
"                                            aria-expanded=\"false\">Pinturas</a>\n" +
"                                        <div class=\"dropdown-menu\" aria-labelledby=\"moshDropdown\">\n" +
"                                            <a class=\"dropdown-item\" href=\"index.html\">Más famosas</a>\n" +
"                                                <a class=\"dropdown-item\" href=\"about.html\">Mejor valoradas</a>\n" +
"                                                <div class=\"dropdown-divider\"></div>\n" +
"                                                <a class=\"dropdown-item\" href=\"elements.html\">Todas</a>\n" +
"                                        </div>\n" +
"                                    </li>\n" +
"                                    <li class=\"nav-item dropdown\">\n" +
"                                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"moshDropdownEsculturas\" role=\"button\"\n" +
"                                            data-toggle=\"dropdown\" aria-haspopup=\"true\"\n" +
"                                            aria-expanded=\"false\">Escultras</a>\n" +
"                                        <div class=\"dropdown-menu\" aria-labelledby=\"moshDropdown\">\n" +
"                                            <a class=\"dropdown-item\" href=\"index.html\">Más famosas</a>\n" +
"                                                <a class=\"dropdown-item\" href=\"about.html\">Mejor valoradas</a>\n" +
"                                                <div class=\"dropdown-divider\"></div>\n" +
"                                                <a class=\"dropdown-item\" href=\"elements.html\">Todas</a>\n" +
"                                        </div>\n" +
"                                    </li>\n" +
"                                    <li class=\"nav-item dropdown\">\n" +
"                                        <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"moshDropdownArtistas\" role=\"button\"\n" +
"                                            data-toggle=\"dropdown\" aria-haspopup=\"true\"\n" +
"                                            aria-expanded=\"false\">Artistas</a>\n" +
"                                        <div class=\"dropdown-menu\" aria-labelledby=\"moshDropdown\">\n" +
"                                            <a class=\"dropdown-item\" href=\"index.html\">Más famosos</a>\n" +
"                                                <a class=\"dropdown-item\" href=\"about.html\">Mejor valorados</a>\n" +
"                                                <div class=\"dropdown-divider\"></div>\n" +
"                                                <a class=\"dropdown-item\" href=\"elements.html\">Todos</a>\n" +
"                                        </div>\n" +
"                                    </li>\n" +
"                                </ul>\n" +
"                            </div>\n" +
"                        </nav>\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"        </div>\n" +
"    </header>\n" +
"    <!-- Final del Navbar-->\n");
       out.println("<br><br><br><br><br><br><br><br><br><br><br><br>");
           out.println(" <center><form action=\"index.jsp\" method=\"post\">\n" +
"        \n" +
"        <div class=\"container\">\n" +
"            <label><h3>Bienvenido "+request.getParameter("usuario")+"</h3></label>\n"
        + "<input type=\"hidden\" name=\"usuario\" value=\""+request.getParameter("usuario")+"\">" +
        
"            <br><button type=\"submit\" style=\"width: 150px;\n" +
"    height: 55px;\n" +
"    border: none;\n" +
"    padding: 0 10px;\n" +
"    font-size: 10px;\n" +
"    color: #fff;\n" +
"    background-color: #4a7aec; \">Subscribe</button><br><br>\n" +
"        </div>\n" +
"\n" +
"    </form></center>");
           out.println("<center>");
           response.setContentType("text/html;charset=UTF-8");
        
        
        try{
            //Obtener información de los headers
            String metodoHtto = request.getMethod();
            String ur = request.getRequestURI();
            out.println("<h1>MÉTODOS DE HTTP</h1>");
            out.println("Método HTTP."+metodoHtto);
            out.println("<br>");
            out.println("URI solicitado "+ur);
            out.println("<br>");
            out.println("<br>");
            Enumeration cabeceros = request.getHeaderNames();
            while(cabeceros.hasMoreElements()){
                String nombreCabecero =(String) cabeceros.nextElement();
                out.println("<b>" + nombreCabecero+ "</b>");
                out.println(request.getHeader(nombreCabecero));
                out.println("<br>");
            }
        } finally{
        }
        
        //Suponemos que el usuario esta visitando por primera vez nuestro sitio
        boolean nuevoUsuario = true;
        
        //Obtenemos todas las cookies
        Cookie[] cookies = request.getCookies();
        
        //Buscamos si ya existe una cookie creada con anterioridad
        //Llamada visitanteRecurrente
        
        if(cookies != null){
            for(Cookie c : cookies){
                if (c.getName().equals("visitanteRecurrente") && c.getValue().equals("si")){
                //En caso de que ya exista una cookie indicando que ya existe 
                //un usuario registrado con anterioridad ponemos la bandera en falso y salimos del ciclo
                nuevoUsuario = false;
                break;
                }
            }//fin for
        }//fin if
        
        String mensaje = null;
        
        if (nuevoUsuario){
            //En caso de ser un usuario nuevo creamos el objeto Cookie
            Cookie visitanteCookie = new Cookie("visitanteRecurrente", "si");
            
            //Agregamos la cookie en la respuesta
            response.addCookie(visitanteCookie);
            
            mensaje = "Gracias por visitar nuestro sitio";
            
        }else{
            mensaje = "Gracias por visitar NUEVAMENTE nuestro sitio";
        }
        
        //Escribimos la salida
        response.setContentType("text/html");
        
        //Omitir codigo HTML para simplificar el codigo
        out.println("Mensaje: " + mensaje);
        
        
        //Obtener información de los headers
        String mensaje2=null;
        String tipoNavegador = request.getHeader("User-Agent");
        System.out.println("El tipo de navegador es "+tipoNavegador);
            
        if(tipoNavegador!=null && tipoNavegador.contains("Trident")){
            mensaje2= "Estas navegando en Internet Exolorer";
        }
        if(tipoNavegador!=null && tipoNavegador.contains("Firefox")){
            mensaje2= "Estas navegando en Firefox";
        }
        if(tipoNavegador!=null && tipoNavegador.contains("Chrome")){
            mensaje2= "Estas navegando en Chrome";
        }
            out.println("<h1>"+mensaje2+"</h1>");
            out.println("<br>");
            
        response.setContentType("text/html");
        HttpSession sesion = request.getSession();
        String titulo = null;
        
        //Pedimos el atributo, y verificamos si existe
        Integer contadorVisitas = (Integer) sesion.getAttribute("contadorVisitas");
        
        //Si es igual a nulo, quiere decir que es la primera vez que accedemos al recurso
        if(contadorVisitas == null){
            contadorVisitas = new Integer(1);
            titulo = "bienvenido por primera vez....";
        }else{
            //si es distinto de nulo, incrementamos el contador
            titulo = "bienvenido Nuevamente";
            contadorVisitas +=1;
        }
        
        //En cualquier caso, agregamos el valor del contador a la sesion
        sesion.setAttribute("contadorVisitas", contadorVisitas);
        
        //Mostramos los valores en el cliente
        out.println("Hola, " + titulo);
        out.println("<br><br>");
        out.println("No. Accesos al recurso: " + contadorVisitas);
        out.println("<br><br>");
        out.println("ID de la sesi&oacute;n: " + sesion.getId());
        out.println("</center>"
                + "<!-- jQuery-2.2.4 js -->\n" +
"    <script src=\"js/jquery-2.2.4.min.js\"></script>\n" +
"    <!-- Popper js -->\n" +
"    <script src=\"js/popper.min.js\"></script>\n" +
"    <!-- Bootstrap js -->\n" +
"    <script src=\"js/bootstrap.min.js\"></script>\n" +
"    <!-- All Plugins js -->\n" +
"    <script src=\"js/plugins.js\"></script>\n" +
"    <!-- Active js -->\n" +
"    <script src=\"js/active.js\"></script>");
        
       out.println("</body>\n" +
"</html>");
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
