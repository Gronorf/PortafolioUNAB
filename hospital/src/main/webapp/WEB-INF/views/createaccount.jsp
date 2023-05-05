<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>CREATE ACCOUNT</title>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <link rel="stylesheet" href="../resources/style.css">
</head>
<body>
<div class="container register-form" >

    <form method="post" action="/hospital_war/registrousuario">
    <div class="form">
        <div class="note">
            <p>Registro de Usuario</p>
        </div>
        <div class="form-content">
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Nombre" name="nombreUsuario"/>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="email" name="emailUsuario"/>
                    </div>
                </div>
                <div class="col-md-6">

                    <div class="dropdown">
                        <label for="language">Seleccionar ROL de Usuario:</label>
                        <select name="language" id="language">
                            <option value="Paciente">Paciente</option>
                            <option value="Medico">Medico</option>
                            <option value="Admin">Administrativo</option>
                        </select>
                    </div>
                </div>
            </div>
            <div class="row">
            <div class="col-md-6">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Clave" name="claveUsuario"/>
                </div>
            </div>
        </div>
        <button type="Submit" >Crear Cuenta</button>
    </form>

    </div>
</div>
</div>
</body>
</html>
