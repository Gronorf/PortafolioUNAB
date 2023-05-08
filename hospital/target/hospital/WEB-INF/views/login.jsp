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
                <input type="text" class="form-control" placeholder="Usuario" required="required" id="nombreUsuario" name="nombreUsuario">
            </div>
            <div class="form-group">
                <input type="password" class="form-control" placeholder="Clave" required="required" id="claveUsuario" name="claveUsuario">
            </div>
            <div class="form-group">
                <button type="submit" class="btn btn-primary btn-block">Entrar</button>
            </div>
        </form>
        <form action="/createaccount" method="get">
            <input type="hidden" value="crear">
            <p class="text-center"><a href="createaccount">Crear Cuenta</a></p>
        </form>
    </div>

    <% if (request.getAttribute("cuentaCreada") != null) { %>
    <!-- Modal -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h4 class="modal-title" id="myModalLabel">Cuenta Creada</h4>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Cerrar"><span
                            aria-hidden="true">&times;</span></button>
                </div>
                <div class="modal-body">
                    <p>Su cuenta ha sido creada exitosamente.</p>
                </div>
            </div>
        </div>
    </div>
    <!-- ... -->
    <% } %>
    <%  request.setAttribute("cuentaCreada", false); %>
    <script>
        $(document).ready(function () {
            $('#myModal').modal('show');
        });
    </script>


    </body>
</html>