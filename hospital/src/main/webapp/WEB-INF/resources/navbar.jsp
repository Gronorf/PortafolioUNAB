<%@page contentType="text/html" pageEncoding="UTF-8" %>

<nav class="navbar navbar-expand-lg bg-body-tertiary">
    <div class="container-fluid">
        <a href="/hospital_war/home">
            <img src="resources/logo2.png" alt="MediHub" class="img-responsive" style="width: 40px; height: 40px;"/>
        </a>
        <a class="navbar-brand">NEUROLOGIA INFANTIL</a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="/hospital_war/home">Inicio</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Generar Reporte</a>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown"
                       aria-expanded="false">
                        Bienvenido/a, ${nombreLogin}
                    </a>
                    <ul class="dropdown-menu">
                        <li><a class="dropdown-item" href="#">Cuenta</a></li>
                        <li><a class="dropdown-item" href="/hospital_war/">Salir</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>