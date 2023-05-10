<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Home Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
          crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="resources/style.css">
    <script src="https://code.jquery.com/jquery-1.10.2.js"></script>
</head>
<body>
<nav>
    <div id="nav-placeholder"></div>
    <nav>
        <%@include file="../resources/navbar.jsp" %>
    </nav>
</nav>

<div class="container bg-white mt-5 p-3">
    <div class="row row-cols-md-2 row-cols-lg-6 g-2">
        <div class="col">
            <form action="/verpaciente" method="get">
                <a href="verpaciente" style="text-decoration: none;">
                    <div class="card text-center">
                        <div class="image">
                            <input type="hidden">
                            <img src="resources/viewlist.png" width="75"/>
                        </div>
                        <span>Ver Pacientes</span>
                    </div>
                </a>
            </form>
        </div>
        <div class="col">
            <form action="/inicioagregarpaciente" method="get">
                <a href="agregarpaciente" style="text-decoration: none;">
                    <div class="card text-center">
                        <div class="image">
                            <input type="hidden">
                            <img src="resources/addlist.png" width="75"/>
                        </div>
                        <span>Ingresar Paciente</span>
                    </div>
                </a>
            </form>
        </div>
        <div class="col">
            <form action="/iniciobuscar" method="get">
                <a href="buscarmodificarpaciente" style="text-decoration: none;">
                    <div class="card text-center">
                        <div class="image">
                            <input type="hidden">
                            <img src="resources/modifyicon.png" width="75"/>
                        </div>
                        <span>Modificar Paciente</span>
                    </div>
                </a>
            </form>
        </div>
        <div class="col">
            <form action="/inicioeliminarpaciente" method="get">
                <a href="eliminarpaciente" style="text-decoration: none;">
                    <div class="card text-center">
                        <div class="image">
                            <input type="hidden">
                            <img src="resources/deleteicon.png" width="75"/>
                        </div>
                        <span>Eliminar Paciente</span>
                    </div>
                </a>
            </form>
        </div>
        <div class="col">
            <form action="error" method="get">
                <a href="error" style="text-decoration: none;">
                    <div class="card text-center">
                        <div class="image">
                            <input type="hidden">
                            <img src="resources/controllogo.png" width="75"/>
                        </div>
                        <span>Ingresar Control</span>
                    </div>
                </a>
            </form>
        </div>
        <div class="col">
            <form action="/inicioreporte" method="get">
                <a href="inicioreporte" style="text-decoration: none;">
                    <div class="card text-center">
                        <div class="image">
                            <input type="hidden">
                            <img src="resources/reportlogo.png" width="75"/>
                        </div>
                        <span>Generar Reporte</span>
                    </div>
                </a>
            </form>
        </div>
        <div class="col">
            <a href="/hospital_war/" style="text-decoration: none;">
                <div class="card text-center">
                    <div class="image">
                        <input type="hidden">
                        <img src="resources/exitlogo.png" width="75"/>
                    </div>
                    <span>Salir</span>
                </div>
            </a>
        </div>
    </div>
</div>

<c:if test="${not empty mensaje}">
    <div class="alert alert-success text-center mensaje-fade" role="alert">
        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Cerrar"></button>
        <p>${mensaje}</p>
    </div>
</c:if>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
        crossorigin="anonymous"></script>
</body>
</html>

