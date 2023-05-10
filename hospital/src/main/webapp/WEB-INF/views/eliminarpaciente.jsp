<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Eliminar Paciente</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
          crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-1.10.2.js"></script>


</head>
<body>
<nav>
    <div id="nav-placeholder"></div>
    <nav>
        <%@include file="../resources/navbar.jsp" %>
    </nav>
</nav>

<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card">
                <div class="card-header">
                    <h3 class="text-center">Eliminar Paciente</h3>
                </div>
                <div class="card-body">
                    <form method="post" action="/hospital_war/eliminarpacienteok">
                        <div class="form-group">
                            <label for="targetPaciente">Ingrese Rut o Ficha Clinica:</label>
                            <input type="text" class="form-control" id="targetPaciente" name="targetPaciente"
                                   placeholder="" required pattern="[0-9]+">
                        </div>
                        <button type="submit" class="btn btn-primary btn-block">Buscar Paciente</button>
                    </form>

                </div>
            </div>
        </div>
    </div>
</div>

<c:if test="${not empty mensajeError}">
    <div class="alert alert-danger text-center mensaje-fade" role="alert">
        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Cerrar"></button>
        <p>${mensajeError}</p>
    </div>
</c:if>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
        crossorigin="anonymous"></script>
</body>
</html>

