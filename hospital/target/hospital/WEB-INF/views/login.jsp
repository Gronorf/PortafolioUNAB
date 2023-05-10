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

</body>

<footer class="fixed-bottom">
    <div class="container">
        <div class="row">
            <div class="col-md-4">
                <h4>Enlaces útiles</h4>
                <ul class="list-unstyled">
                    <li><a href="#">Inicio</a></li>
                    <li><a href="#">Acerca de</a></li>
                    <li><a href="#">Servicios</a></li>
                    <li><a href="#">Contacto</a></li>
                </ul>
            </div>
            <div class="col-md-4">
                <h4>Información de contacto</h4>
                <ul class="list-unstyled">
                    <li><i class="fa fa-map-marker"></i> 123 Calle Falsa, Ciudad Ficticia</li>
                    <li><i class="fa fa-phone"></i> (123) 456-7890</li>
                    <li><i class="fa fa-envelope"></i> info@ejemplo.com</li>
                </ul>
            </div>
            <div class="col-md-4">
                <h4>Síguenos</h4>
                <ul class="list-unstyled list-inline">
                    <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                    <li><a href="#"><i class="fa fa-instagram"></i></a></li>
                    <li><a href="#"><i class="fa fa-linkedin"></i></a></li>
                </ul>
            </div>
        </div>
        <div class="row">
            <div class="col-md-12">
                <hr>
                <p class="text-muted small">Derechos reservados &copy; 2023 | Ejemplo.com</p>
            </div>
        </div>
    </div>
</footer>


<div class="text-center p-3" style="background-color: rgba(0, 0, 0, 0.2);">
    © 2023 - Todos los derechos reservados
</div>
</footer>


</html>