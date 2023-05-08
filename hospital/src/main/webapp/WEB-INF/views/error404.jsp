<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Error 404 - Página no encontrada</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <!-- Bootstrap JS -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
    <style>
        .error-template {padding: 40px 15px;text-align: center;}
        .error-actions {margin-top:15px;margin-bottom:15px;}
        .btn {padding: 10px 20px;}
    </style>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="error-template">
                <h1>Error 404 - Página no encontrada</h1>
                <p>Lo siento, la página que estás buscando no se encuentra en nuestro servidor.</p>
                <img src="https://example.com/gato-espacio.jpg" alt="Gato en el espacio" class="img-responsive">
                <div class="error-actions">
                    <a href="#" class="btn btn-primary btn-lg"><span class="glyphicon glyphicon-home"></span> Ir a la página principal</a>
                    <a href="#" class="btn btn-default btn-lg"><span class="glyphicon glyphicon-envelope"></span> Contactar soporte</a>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
