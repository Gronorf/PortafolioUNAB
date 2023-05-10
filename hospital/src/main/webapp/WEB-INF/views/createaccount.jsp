<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Registro de Usuario</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-1.10.2.js"></script>
</head>

<body>
<div class="container">
    <div class="row justify-content-center">
        <div class="col-md-6">
            <div class="card">
                <div class="card-header">
                    <h3 class="text-center">Crear Cuenta</h3>
                </div>
                <div class="card-body">
                    <form method="post" action="/hospital_war/registrousuario" onsubmit="return validarFormulario()">
                        <div class="form-group">
                            <label for="nombreUsuario">Usuario:</label>
                            <input type="text" class="form-control" id="nombreUsuario" name="nombreUsuario"
                                   placeholder="Nombre de usuario" required>
                        </div>
                        <div class="form-group">
                            <label for="emailUsuario">Email:</label>
                            <input type="email" class="form-control" id="emailUsuario" name="emailUsuario"
                                   placeholder="Ingrese su correo electrónico" required>
                        </div>
                        <div class="form-group">
                            <label for="rolUsuario">Rol de Usuario:</label>
                            <select class="form-control" id="rolUsuario" name="rolUsuario">
                                <option value="" disabled selected>Seleccione rol</option>
                                <option value="paciente">Paciente</option>
                                <option value="medico">Médico</option>
                                <option value="admin">Administrativo</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="claveUsuario">Clave:</label>
                            <input type="password" class="form-control" id="claveUsuario" name="claveUsuario"
                                   placeholder="Ingrese su clave" required>
                        </div>
                        <button type="submit" class="btn btn-primary btn-block">Crear Cuenta</button>
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

<script>
    function validarFormulario() {

        var nombreUsuario = document.getElementById("nombreUsuario").value;
        var emailUsuario = document.getElementById("emailUsuario").value;
        var rolUsuario = document.getElementById("rolUsuario").value;
        var claveUsuario = document.getElementById("claveUsuario").value;

        // Validar que los campos no estén vacíos
        if (nombreUsuario == "" || emailUsuario == "" || rolUsuario == "" || claveUsuario == "") {
            alert("Debe completar todos los campos.");
            return false;
        }
        // Si todas las validaciones son exitosas, enviar el formulario
        return true;
    }
</script>

<!-- jQuery and Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNVe1X"
        crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
        integrity="sha384-JjSmVgy"></script>
</body>
</html>