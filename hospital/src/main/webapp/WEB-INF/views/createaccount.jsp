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
                            <form method="post" action="/hospital_war/registrousuario">
                                <div class="form-group">
                                    <label for="nombreUsuario">Nombre:</label>
                                    <input type="text" class="form-control" id="nombreUsuario" name="nombreUsuario"
                                        placeholder="Ingrese su nombre">
                                </div>
                                <div class="form-group">
                                    <label for="emailUsuario">Email:</label>
                                    <input type="email" class="form-control" id="emailUsuario" name="emailUsuario"
                                        placeholder="Ingrese su correo electrónico">
                                </div>
                                <div class="form-group">
                                    <label for="rolUsuario">Rol de Usuario:</label>
                                    <select class="form-control" id="rolUsuario" name="rolUsuario">
                                        <option value="Paciente">Paciente</option>
                                        <option value="Medico">Médico</option>
                                        <option value="Admin">Administrativo</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="claveUsuario">Clave:</label>
                                    <input type="password" class="form-control" id="claveUsuario" name="claveUsuario"
                                        placeholder="Ingrese su clave">
                                </div>
                                <button type="submit" class="btn btn-primary btn-block">Crear Cuenta</button>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
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