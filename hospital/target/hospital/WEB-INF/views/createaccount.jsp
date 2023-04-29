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
<body id="bodyPadre">
<div class="container register-form" >
    <div class="form">
        <div class="note">
            <p>Registro de Usuario</p>
        </div>

        <div class="form-content">
            <div class="row">
                <div class="col-md-6">
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Nombre" value=""/>
                    </div>
                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Apellido" value=""/>
                    </div>
                </div>
                <div class="col-md-6">

                    <div class="form-group">
                        <input type="text" class="form-control" placeholder="Email" value=""/>
                    </div>

                    <div class="dropdown">
                        <label for="language">Seleccionar ROL de Usuario:</label>
                        <select name="language" id="language">
                            <option value="javascript">Paciente</option>
                            <option value="python">Medico</option>
                            <option value="c++">Administrativo</option>
                        </select>
                    </div>

                </div>
            </div>
            <div class="row">
            <div class="col-md-6">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Your Password *" value=""/>
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Confirm Password *" value=""/>
                </div>
            </div>
        </div>
        <button type="button" class="btnSubmit">Submit</button>
    </div>
</div>
</div>
</body>
</html>
