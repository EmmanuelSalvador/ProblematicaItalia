<%-- 
Document   : index
Created on : 14/09/2019, 05:37:06 PM
Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <title>Nombre de la Página</title>
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
                            <a class="nav-link" href="index.html">
                                <h1 style="color: #fff">Arte</h1>
                            </a>

                            <!-- Menu Area -->
                            <button class="navbar-toggler" type="button" data-toggle="collapse"
                                data-target="#mosh-navbar" aria-controls="mosh-navbar" aria-expanded="false"
                                aria-label="Toggle navigation"><span class="navbar-toggler-icon"></span></button>

                            <div class="collapse navbar-collapse justify-content-end" id="mosh-navbar">
                                <ul class="navbar-nav animated" id="nav">
                                    <li class="nav-item active"><a class="nav-link" href="index.html">Inicio</a></li>
                                    <li class="nav-item dropdown">
                                        <a class="nav-link dropdown-toggle" href="#" id="moshDropdownMuseos" role="button"
                                            data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">Museos</a>
                                        <div class="dropdown-menu" aria-labelledby="moshDropdown">
                                            <a class="dropdown-item" href="index.html">Por ciudad</a>
                                            <a class="dropdown-item" href="about.html">Por popularidad</a>
                                            <div class="dropdown-divider"></div>
                                            <a class="dropdown-item" href="elements.html">Todos</a>
                                        </div>
                                    </li>
                                    <li class="nav-item dropdown">
                                        <a class="nav-link dropdown-toggle" href="#" id="moshDropdownPinturas" role="button"
                                            data-toggle="dropdown" aria-haspopup="true"
                                            aria-expanded="false">Pinturas</a>
                                        <div class="dropdown-menu" aria-labelledby="moshDropdown">
                                            <a class="dropdown-item" href="index.html">Más famosas</a>
                                                <a class="dropdown-item" href="about.html">Mejor valoradas</a>
                                                <div class="dropdown-divider"></div>
                                                <a class="dropdown-item" href="elements.html">Todas</a>
                                        </div>
                                    </li>
                                    <li class="nav-item dropdown">
                                        <a class="nav-link dropdown-toggle" href="#" id="moshDropdownEsculturas" role="button"
                                            data-toggle="dropdown" aria-haspopup="true"
                                            aria-expanded="false">Escultras</a>
                                        <div class="dropdown-menu" aria-labelledby="moshDropdown">
                                            <a class="dropdown-item" href="index.html">Más famosas</a>
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
                                            <a class="dropdown-item" href="index.html">Más famosos</a>
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
                                        <a href="login.html" style="font-size: 15px; color: #fff">/ Iniciar sesión</a>
                                        <%
                                    }
                                    else{
                                    %>
                                        <a href="informacionUsuario.jsp"
                                            style="font-size: 15px; color: #fff"><%=request.getParameter("usuario")%></a>
                                        <a href="index.jsp" style="font-size: 15px; color: #fff">/ Cerrar sesión</a>
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

    <!-- Inicio de imagenes -->



    <!-- Fin de imágenes -->
    <br><br><br><br><br><br><br><br><br><br><br><br>
    <section class="mosh-service-area clearfix">
        <center>
            <h1>Bienvenido a ...</h3>
                <h4>... es una página que recopila una gran cantidad de información de los museos italianos, las obras
                    que albergan e información sobre los autores de dichas obras</h4>
                <br><br>
        </center>
        <div class="container">
            <center>
                <h2>Museos</h2>
            </center>
            <div class="row">
                <div class="col-12">
                    <div class="mosh-service-slides owl-carousel">
                        <!-- Single Service Area -->
                        <div class="single-service-area text-center">
                            <image src="./img/galleria-borghese.jpg"></image><br>
                                <h4>Galleria Borghese</h4>
                                <p>Ubicado en la Villa Borghese, en Roma, es uno de los museos más populares en donde se
                                    pueden encontrar obras de Rafael, Canova, Tiziano, Caravaggio entre otros</p>
                        </div>
                        <!-- Single Service Area -->
                        <div class="single-service-area text-center">
                            <image src="./img/Museo_Civico_Correr.jpg"></image><br>
                                <h4>Museo Cívico Correr</h4>
                                <p>Este museo se encuentra ubicado frente a la Basílica de San Marcos, en Venecia</p>
                        </div>
                        <!-- Single Service Area -->
                        <div class="single-service-area text-center">
                            <image src="./img/Galería Uffizi.jpg"></image><br>
                                <h4>Galería Uffizi</h4>
                                <p>Ubicada en Florencia, la Galería Uffizi es un destacado museo que alberga importantes
                                    obras pertenecientes a la etapa del Renacimiento como de Miguel Ángel, Da vinci
                                    entre otros.</p>
                        </div>
                        <!-- Single Service Area -->
                        <div class="single-service-area text-center">
                            <image src="./img/pinacoteca-brera-milano.jpeg"></image><br>
                                <h4>Pinacoteca de Brera</h4>
                                <p>Este es uno de los más importantes museos de Italia, se encuentra ubicado dentro del
                                    Palacio Brera en Milán y cuenta con una de las mejores colecciones de pinturas en
                                    todo Europa.</p>
                        </div>
                        <!-- Single Service Area -->
                        <div class="single-service-area text-center">
                            <image src="./img/Peggy_Guggenheim.jpg"></image><br>
                                <h4>Museo Peggy Guggenheim</h4>
                                <p>Este es un importante museo contemporáneo que inicialmente, en el siglo XVIII fue un
                                    palacio que albergó a notables y adinerados mecenas.</p>
                        </div>
                        <!-- Single Service Area -->
                        <div class="single-service-area text-center">
                            <image src="./img/Galería Nacional de Umbría.gif"></image><br>
                                <h4>Galería Nacional de Umbría</h4>
                                <p>La Galleria nazionale dell’Umbria es una importante pinacoteca que se encuentra en el
                                    tercer piso de del Palacio de los Priores de Perugia. Cuenta con una gran colección
                                    de obras como pinturas, esculturas, orfebrería y tejidos de varios artistas de
                                    Umbría, desde el siglo XIII al siglo XIX.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-- ***** Service Area End ***** -->

    <section class="mosh-service-area clearfix">
        <center>
        </center>
        <div class="container">
            <center>
                <h2>Esculturas</h2>
            </center>
            <div class="row">
                <div class="col-12">
                    <div class="mosh-service-slides owl-carousel">
                        <!-- Single Service Area -->
                        <div class="single-service-area text-center">
                            <image src="./img/piedad-del-vaticano-high.png"></image>
                                <h4>Piedad del Vaticano</h4>
                                <p>Esta escultura representa el momento en que María carga el cuerpo de su hijo muerto después de bajarlo de la cruz. En el rostro de la virgen se muestra una expresión cargada de dolor y resignación.</p>
                        </div>
                        <!-- Single Service Area -->
                        <div class="single-service-area text-center">
                            <image src="./img/el-extasis-de-santa-teresa-marmol-high.jpg"></image>
                                <h4>El éxtasis de Santa Teresa</h4>
                                <p>El éxtasis de Santa Teresa, una de las piezas más bellas del Barroco italiano, reconocida por el propio Bernini como una de las obras más hermosas creadas por sus manos. </p>
                        </div>
                        <!-- Single Service Area -->
                        <div class="single-service-area text-center">
                            <image src="./img/Laocoon-y-sus-hijos-high.jpg"></image>
                            <h4>Laocoonte y sus hijos</h4>
                            <p>Esta es una de las esculturas más poderosas e importantes en la Historia del arte. La pieza griega fue hallada en el siglo XVI y dio paso a una revolución en las esculturas del barroco.</p>
                        </div>
                        <!-- Single Service Area -->
                        <div class="single-service-area text-center">
                            <image src="./img/psique-reanimada-por-el-beso-del-amor-high.jpg"></image>
                            <h4>Psique Reanimada por el Beso del Amor</h4>
                            <p>eEs una escultura creada por el artista italiano Antonio Canova, considerado el mejor escultor neoclásico, la cual representa el momento exacto en que cupido rescata a su amada Psique.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section class="mosh-service-area clearfix">
        <center>
            <br>
        </center>
        <div class="container">
            <center>
                <h2>Pinturas</h2>
            </center>
            <div class="row">
                <div class="col-12">
                    <div class="mosh-service-slides owl-carousel">
                        <!-- Single Service Area -->
                        <div class="single-service-area text-center">
                            <image src="./img/Mona-Lisa-pintura-renacentista-de-Italia.jpg"></image>
                                <h4>La Gioconda</h4>
                                <p>El Retrato de Lisa Gherardini, esposa de Francesco del Giocondo,1​más conocido como La Gioconda (La Joconde en francés) o La Mona Lisa, es una obra pictórica del polímata renacentista italiano Leonardo da Vinci.</p>
                        </div>
                        <!-- Single Service Area -->
                        <div class="single-service-area text-center">
                            <image src="./img/Leonarda_da_vinci_last_supper.jpg"></image>
                                <h4>La última cena</h4>
                                <p>Otra de las obras maestras del gran Leonardo, envuelta, además, en todo tipo de leyendas. La pintó entre los años 1495 y 1497, por órdenes del duque Ludovico Sforza de Milán.</p>
                        </div>
                        <!-- Single Service Area -->
                        <div class="single-service-area text-center">
                            <image src="./img/sagrada-familia-miguel-angel.jpg"></image>
                            <h4>La Sagrada Familia</h4>
                            <p>También conocida como Tondo Doni, es una de las primeras obras de Miguel Ángel. Data del año 1503 y fue realizada en conmemoración de la boda entre Agnolo Doni y Maddalena Strozzi. Es el único panel de madera que ejecutó este artista. Se la puede admirar en la Galería Uffizi, de Florencia.</p>
                        </div>
                        <!-- Single Service Area -->
                        <div class="single-service-area text-center">
                            <image src="./img/Capilla-sixtina.jpg"></image>
                            <h4>La Capilla Sixtina</h4>
                            <p>De nuevo Miguel Ángel, y esta vez una de las obras de la pintura renacentista de Italia más grandiosas y famosas del mundo. Los frescos de la Capilla Sixtina fueron realizados por este artista entre 1508 y 1512. Se pueden admirar en el Vaticano.</p>
                        </div>
                        <!-- Single Service Area -->
                        <div class="single-service-area text-center">
                            <image src="./img/nacimiento-de-venus-renacimiento-italia.jpg"></image>
                            <h4>El nacimiento de Venus</h4>
                            <p>Esta pintura es una de las obras más importantes de Sandro Botticelli. Se cree que la musa inspiradora de la Venus fue Simonetta Cattaneo, elegida por la familia Médici para ese papel. El nacimiento de Venus se puede admirar en la Galería Uffizi, de Florencia.</p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <section class="mosh-service-area clearfix">
        <center>
            <br>
        </center>
        <div class="container">
            <center>
                <h2>Artistas</h2>
            </center>
            <div class="row">
                <div class="col-12">
                    <div class="mosh-service-slides owl-carousel">
                        <!-- Single Service Area -->
                        <div class="single-service-area text-center">
                            <image src="./img/miguel_angel.jpeg"></image>
                                <h4>Michelangelo Buonarroti</h4>
                                <p>Miguel Ángel Bounarroti fue un escultor, pintor y arquitecto italiano de los siglos XV y XVI. Nació en Caprese (provincia de Arezzo) en 1475.</p>
                        </div>
                        <!-- Single Service Area -->
                        <div class="single-service-area text-center">
                            <image src="./img/da_vinci_thumb.jpg"></image>
                                <h4>Leonardo da Vinci</h4>
                                <p>Leonardo da Vinci incursionó en campos tan variados como la aerodinámica, la hidráulica, la anatomía, la botánica, la pintura, la escultura y la arquitectura, entre otros.</p>
                        </div>
                        <!-- Single Service Area -->
                        <div class="single-service-area text-center">
                            <image src="./img/Gianlorenzo_Bernini_-_Self-Portrait_-_WGA01973.jpg"></image>
                            <h4>Gian Lorenzo Bernini</h4>
                            <p>Pintor, escultor y arquitecto. La larga vida de Bernini fue una casi continua sucesión de éxitos, en el transcurso de la cual el napolitano llegó a imponer una auténtica dictadura artística en la Roma de buena parte del si­glo XVII</p>
                        </div>
                        <!-- Single Service Area -->
                        <div class="single-service-area text-center">
                            <image src="./img/portrait-of-michelangelo-merisi-da-caravaggio-17th-century-found-in-the-collection-of-national-museum-of-western-art-tokyo-pho.jpg"></image>
                            <h4>Caravaggio</h4>
                            <p>Michelangelo Merisi da Caravaggio, pintor revolucionario, artista provocador, persona inquieta de caracter pendenciero, genio incomprendido, loco violento, hombre atormentado, que crearía él solo un estilo, el barroco.</p>
                        </div>
                    </div>
                </div>
            </div>
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