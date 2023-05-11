<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>LOGIN</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="resources/style.css">
    <script src="https://code.jquery.com/jquery-1.10.2.js"></script>
</head>
<body>
<div class="login-form">
    <form action="/hospital_war/verificationLogin" method="post">

        <div class="form-group" style="margin-bottom: 20px;">
            <img src="resources/logo.png" alt="MediHub" class="img-responsive" style="max-width: 100%; height: auto;"/>
        </div>
        <div class="form-group">
            <input type="text" class="form-control" placeholder="Usuario" required="required" id="nombreUsuario"
                   name="nombreUsuario">
        </div>
        <div class="form-group">
            <input type="password" class="form-control" placeholder="Clave" required="required" id="claveUsuario"
                   name="claveUsuario">
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-primary btn-block">Entrar</button>
        </div>
    </form>

    <form action="createaccount" method="get">
            <input type="hidden" value="crear">
            <div class="text-center">
                <button type="submit" class="btn btn-primary">Crear Cuenta</button>
            </div>
    </form>
</div>

<c:if test="${not empty mensaje}">
    <div class="alert alert-success text-center mensaje-fade" role="alert">
        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Cerrar"></button>
        <p>${mensaje}</p>
    </div>
</c:if>

<c:if test="${not empty mensajeError}">
    <div class="alert alert-danger text-center mensaje-fade" role="alert">
        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Cerrar"></button>
        <p>${mensajeError}</p>
    </div>
</c:if>


</body>
<footer class="fixed-bottom">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
                    Creado por: Mauricio Gutiérrez Ulloa | 2023 | Alpha 0.0.1
                </div>
            </div>
        </div>
    </div>
</footer>

</html>