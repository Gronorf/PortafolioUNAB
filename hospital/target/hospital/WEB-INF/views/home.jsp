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


<%--<form action="/verpaciente" method="get">--%>
<%--    <input type="hidden" value="crear">--%>
<%--    <p class="text-center"><a href="createaccount">Crear Cuenta</a></p>--%>
<%--</form>--%>


<div class="container bg-white mt-5 p-3">
    <div class="row g-2">
        <div class="col-md-2">
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
        <div class="col-md-2">
            <div class="card text-center">
                <div class="image">
                    <img src="resources/addlist.png" width="75"/>
                </div>
                <span>Agregar Paciente</span>
            </div>
        </div>
        <div class="col-md-2">
            <div class="card text-center">
                <div class="image">
                    <img src="https://i.imgur.com/LaQvLQG.png" width="75"/>
                </div>
                <span>Car Repair</span>
            </div>
        </div>
        <div class="col-md-2">
            <div class="card text-center">
                <div class="image">
                    <img src="https://i.imgur.com/9UsQzOZ.png" width="75"/>
                </div>
                <span>Electrician</span>
            </div>
        </div>
        <div class="col-md-2">
            <div class="card text-center">
                <div class="image">
                    <img src="https://i.imgur.com/iUd0UJk.png" width="75"/>
                </div>
                <span>Painter</span>
            </div>
        </div>
        <div class="col-md-2">
            <div class="card text-center">
                <div class="image">
                    <img src="https://i.imgur.com/jfJQfUA.png" width="75"/>
                </div>
                <span>Plumber</span>
            </div>
        </div>

        <div class="col-md-2">
            <div class="card text-center">
                <div class="image">
                    <img src="https://i.imgur.com/B3pzxO5.png" width="75"/>
                </div>
                <span>Carpenter</span>
            </div>
        </div>
        <div class="col-md-2">
            <div class="card text-center">
                <div class="image">
                    <img src="https://i.imgur.com/0pBmq1V.png" width="75"/>
                </div>
                <span>Makeup</span>
            </div>
        </div>
        <div class="col-md-2">
            <div class="card text-center">
                <div class="image">
                    <img src="https://i.imgur.com/9UsQzOZ.png" width="75"/>
                </div>
                <span>Grooming</span>
            </div>
        </div>

        <div class="col-md-2">
            <div class="card text-center">
                <div class="image">
                    <img src="https://i.imgur.com/Vcfr7J6.png" width="75"/>
                </div>
                <span>Pest control</span>
            </div>
        </div>

        <div class="col-md-2">
            <div class="card text-center">
                <div class="image">
                    <img src="https://i.imgur.com/jfJQfUA.png" width="75"/>
                </div>
                <span>Hair Style</span>
            </div>
        </div>
        <div class="col-md-2">
            <div class="card text-center">
                <div class="image">
                    <img src="https://i.imgur.com/iUd0UJk.png" width="75"/>
                </div>
                <span>Massage</span>
            </div>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
        crossorigin="anonymous"></script>
</body>
</html>

