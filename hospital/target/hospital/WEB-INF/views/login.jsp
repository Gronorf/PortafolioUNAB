<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>LOGIN</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <style>
            .login-form {
                width: 340px;
                margin: 50px auto;
                font-size: 15px;
            }
            .login-form form {
                margin-bottom: 15px;
                background: #f7f7f7;
                box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
                padding: 30px;
            }
            .login-form h2 {
                margin: 0 0 15px;
            }
            .form-control, .btn {
                min-height: 38px;
                border-radius: 2px;
            }
            .btn {
                font-size: 15px;
                font-weight: bold;
            }
        </style>
    </head>
    <body>
    <div class="login-form">
        <form action="/examples/actions/con" method="post">
            <h2 class="text-center">MediHub</h2>
            <div class="form-group">
                <input type="text" class="form-control" placeholder="Usuario" required="required" name="nombreUsuario" oninvalid="this.setCustomValidity('Debe ingresar un Usuario.')" oninput="setCustomValidity('')">
            </div>
            <div class="form-group">
                <input type="password" class="form-control" placeholder="Clave" required="required" name="claveUsuario" oninvalid="this.setCustomValidity('Debe ingresar un Clave.')" oninput="setCustomValidity('')">
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-primary btn-block">INGRESAR</button>
            </div>
        </form>
        <form action="/createaccount" method="get">
            <input type="hidden" value="crear">
            <p class="text-center"><a href="createaccount">Crear Cuenta</a></p>
        </form>

    </div>
    </body>
</html>