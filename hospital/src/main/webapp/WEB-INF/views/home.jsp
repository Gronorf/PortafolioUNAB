<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Botones con imágenes</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
          integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
          crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-1.10.2.js"></script>
</head>
<body>
<nav>
    <div id="nav-placeholder"></div>
    <nav>
        <%@include file="../resources/navbar.jsp" %>
    </nav>
</nav>
<div class="container mt-5">
    <div class="row">
        <div class="col-sm-6 col-lg-3 mb-4">
            <a href="#">
                <img src="https://via.placeholder.com/300x300.png?text=Button+1" class="img-fluid rounded">
            </a>
        </div>
        <div class="col-sm-6 col-lg-3 mb-4">
            <a href="#">
                <img src="https://via.placeholder.com/300x300.png?text=Button+2" class="img-fluid rounded">
            </a>
        </div>
        <div class="col-sm-6 col-lg-3 mb-4">
            <a href="#">
                <img src="https://via.placeholder.com/300x300.png?text=Button+3" class="img-fluid rounded">
            </a>
        </div>
        <div class="col-sm-6 col-lg-3 mb-4">
            <a href="#">
                <img src="https://via.placeholder.com/300x300.png?text=Button+4" class="img-fluid rounded">
            </a>
        </div>
    </div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
        crossorigin="anonymous"></script>
</body>
</html>

