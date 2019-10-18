<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html lang="en">

<head>
    <title>Nombre de la P�gina</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
    <link href="css/responsive.css" rel="stylesheet">
    <link href="style.css" rel="stylesheet">
    <!--<style type="text/css">
.navbar {
-webkit-border-radius: 0;
-moz-border-radius: 0;
border-radius: 0;
}
</style>-->
</head>

<body>

    <!-- Inicio del Navbar -->
    <header class="header_area clearfix" style="background-color:#232323">
        <div class="container-fluid h-100">
            <div class="row h-100">
                <!-- Menu Area Start -->
                <div class="col-12 h-100">
                    <div class="menu_area h-100">
                        <nav class="navbar h-100 navbar-expand-lg align-items-center">
                            <!-- Logo -->
                            <a class="nav-link" href="index.jsp">
                                <h1 style="color: #fff">Arte</h1>
                            </a>

                            <!-- Menu Area -->
                            <button class="navbar-toggler" type="button" data-toggle="collapse"
                                data-target="#mosh-navbar" aria-controls="mosh-navbar" aria-expanded="false"
                                aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>

                            <div class="collapse navbar-collapse justify-content-end" id="mosh-navbar">
                                <ul class="navbar-nav animated" id="nav">
                                    <li class="nav-item active"><a class="nav-link" href="index.jsp">Inicio</a></li>
                                    <li class="nav-item dropdown">
                                        <a class="nav-link dropdown-toggle" href="#" id="moshDropdownMuseos" role="button"
                                            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Museos</a>
                                        <div class="dropdown-menu" aria-labelledby="moshDropdown">
                                            <a class="dropdown-item" href="index.jsp">Por ciudad</a>
                                            <a class="dropdown-item" href="about.html">Por popularidad</a>
                                            <div class="dropdown-divider"></div>
                                            <a class="dropdown-item" href="elements.html">Todos</a>
                                            <div class="dropdown-divider"></div>
                                            <a class="dropdown-item" href="administrarMuseos.html">Administrar</a>
                                        </div>
                                    </li>
                                    <li class="nav-item dropdown">
                                        <a class="nav-link dropdown-toggle" href="#" id="moshDropdownPinturas" role="button"
                                            data-toggle="dropdown" aria-haspopup="true"
                                            aria-expanded="false">Pinturas</a>
                                        <div class="dropdown-menu" aria-labelledby="moshDropdown">
                                            <a class="dropdown-item" href="index.jsp">Más famosas</a>
                                                <a class="dropdown-item" href="about.html">Mejor valoradas</a>
                                                <div class="dropdown-divider"></div>
                                                <a class="dropdown-item" href="elements.html">Todas</a>
                                                <div class="dropdown-divider"></div>
                                            <a class="dropdown-item" href="administrarObras.html">Administrar</a>
                                        </div>
                                    </li>
                                    <li class="nav-item dropdown">
                                        <a class="nav-link dropdown-toggle" href="#" id="moshDropdownEsculturas" role="button"
                                            data-toggle="dropdown" aria-haspopup="true"
                                            aria-expanded="false">Escultras</a>
                                        <div class="dropdown-menu" aria-labelledby="moshDropdown">
                                            <a class="dropdown-item" href="index.jsp">Más famosas</a>
                                                <a class="dropdown-item" href="about.html">Mejor valoradas</a>
                                                <div class="dropdown-divider"></div>
                                                <a class="dropdown-item" href="elements.html">Todas</a>
                                                <div class="dropdown-divider"></div>
                                            <a class="dropdown-item" href="administrarObras.html">Administrar</a>
                                        </div>
                                    </li>
                                    <li class="nav-item dropdown">
                                        <a class="nav-link dropdown-toggle" href="#" id="moshDropdownArtistas" role="button"
                                            data-toggle="dropdown" aria-haspopup="true"
                                            aria-expanded="false">Artistas</a>
                                        <div class="dropdown-menu" aria-labelledby="moshDropdown">
                                            <a class="dropdown-item" href="index.jsp">Más famosos</a>
                                                <a class="dropdown-item" href="about.html">Mejor valorados</a>
                                                <div class="dropdown-divider"></div>
                                                <a class="dropdown-item" href="elements.html">Todos</a>
                                                <div class="dropdown-divider"></div>
                                            <a class="dropdown-item" href="administrarArtistas.html">Administrar</a>
                                        </div>
                                    </li>
                                    <li class="nav-item dropdown">
                                        <a class="nav-link dropdown-toggle" href="#" id="moshDropdownEsculturas" role="button"
                                            data-toggle="dropdown" aria-haspopup="true"
                                            aria-expanded="false">Escultras</a>
                                        <div class="dropdown-menu" aria-labelledby="moshDropdown">
                                            <a class="dropdown-item" href="index.jsp">M�s famosas</a>
                                                <a class="dropdown-item" href="about.html">Mejor valoradas</a>
                                                <div class="dropdown-divider"></div>
                                                <a class="dropdown-item" href="elements.html">Todas</a>
                                        </div>
                                    </li>
                                    <li class="nav-item dropdown">
                                        <a class="nav-link dropdown-toggle" href="#" id="moshDropdownArtistas" role="button"
                                            data-toggle="dropdown" aria-haspopup="true"
                                            aria-expanded="false">Artistas</a>
                                        <div class="dropdown-menu" aria-labelledby="moshDropdown">
                                            <a class="dropdown-item" href="index.jsp">M�s famosos</a>
                                                <a class="dropdown-item" href="about.html">Mejor valorados</a>
                                                <div class="dropdown-divider"></div>
                                                <a class="dropdown-item" href="elements.html">Todos</a>
                                        </div>
                                    </li>

                                    <!-- Search Form Area Start -->
                                    <div class="search-form-area animated">
                                        <form action="#" method="post">
                                            <input type="search" name="search" id="search"
                                                placeholder="Type keywords &amp; hit enter">
                                            <button type="submit" class="d-none"><img src="img/core-img/search-icon.png"
                                                    alt="Search"></button>
                                        </form>
                                    </div>
                                    <!-- Search btn -->
                                    <div class="search-button">
                                        <a href="#" id="search-btn"><img src="img/core-img/search-icon.png"
                                                alt="Search"></a>
                                    </div>
                                    <!-- Login/Register btn -->
                                    <div class="login-register-btn">
                                        <%
                                    if (request.getParameter("usuario")==null){
                                    %>
                                        <a href="registro.html" style="font-size: 15px; color: #fff">Registrarse</a>
                                        <a href="login.html" style="font-size: 15px; color: #fff">/ Iniciar sesi�n</a>
                                        <%
                                    }
                                    else{
                                    %>
                                        <a href="informacionUsuario.jsp"
                                            style="font-size: 15px; color: #fff"><%=request.getParameter("usuario")%></a>
                                        <a href="index.jsp" style="font-size: 15px; color: #fff">/ Cerrar sesi�n</a>
                                        <%
                                    }
                                    %>
                                    </div>
                            </div>
                            </ul>

                        </nav>
                    </div>
                </div>
            </div>
        </div>
    </header>
    <!-- Final del Navbar-->

    <br><br><br><br><br><br>

    <section class="mosh-subscribe-newsletter-area bg-overlay-white section_padding_100">

        <div class="row">
            <div class="col-12">
                <div class="subscribe-newsletter-content text-center" data-wow-delay="0.5s">
                    <h1><%=request.getParameter("usuario")%></h1>
                    <form>
                        <input type="text" placeholder="Aqu� ir� el nombre de usuario" name="usuario" required readonly>
                        <input type="text" placeholder="Aqu� ir� el Email del usuario" name="email" required readonly>
                        <input type="password" placeholder="Aqu� ir� la contrase�a del usuario" name="pass" required readonly>
                        <br>

                    </form>
                </div>
            </div>
        </div>
        <div class="container signin">
            <center>
                <button type="submit"
                    style="width: 150px;height: 70px;border: none;padding: 0 30px;font-size: 20px;color: #fff;background-color: red;">Eliminar
                    cuenta</button>
            </center>
        </div>
    </section>

    <!-- jQuery-2.2.4 js -->
    <script src="js/jquery-2.2.4.min.js"></script>
    <!-- Popper js -->
    <script src="js/popper.min.js"></script>
    <!-- Bootstrap js -->
    <script src="js/bootstrap.min.js"></script>
    <!-- All Plugins js -->
    <script src="js/plugins.js"></script>
    <!-- Active js -->
    <script src="js/active.js"></script>
</body>

</html>