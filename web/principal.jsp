    <%-- 
    Document   : n
    Created on : 6/08/2019, 03:56:39 PM
    Author     : jerson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">


<head>

<!-- Required meta tags -->

<meta charset="utf-8">

<meta name="viewport" content="width=device-width, initial-scale=1.0">

<script src="https://code.jquery.com/jquery-2.1.3.min.js"></script>



<!-- Bootstrap CSS -->

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
<link rel="stylesheet" href="mycss/miestilo.css">


<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>




<!--fontawesome-->

<script defer src="https://use.fontawesome.com/releases/v5.0.13/js/all.js" integrity="sha384-xymdQtn1n3lH2wcu0qhcdaOpQwyoarkgLVxC/wZ5q7h9gHtxICrpcaSUfygqZGOe" crossorigin="anonymous"></script>

<!--This is used for search icon. Instead putting icon manually it is loaded from fontawesome-->




<title>Doctor Shots</title>

</head>

<body>

<!-- navbar -->

<nav class="navbar navbar-expand-md navbar-light bg-dark fixed-top">

    <a class="btn btn-outline-light navbar-brand" style="margin-left: 10px; border: none"><img src="img/logo.png" width="85px"></a>

<button type="button" class="navbar-toggler bg-light" data-toggle="collapse" data-target="#nav">

<span class="navbar-toggler-icon"></span>

</button>

<div class="collapse navbar-collapse justify-content-between" id="nav">

<ul class="navbar-nav">

<li class="nav-item" >

<a class="btn btn-outline-light font-crazy font-weight-bold px-3" href="#" style="margin-left: 10px; border: none">INICIO</a>

</li>

<li class="nav-item">

<a class="btn btn-outline-light font-crazy text-light font-weight-bold px-3" href="Controlador?menu=Empleados&accion=Listar" target="myframe" style="margin-left: 10px; border: none">USUARIOS</a>

</li>

<li class="nav-item">

<a class="btn btn-outline-light font-crazy text-light font-weight-bold px-3" href="Controlador?menu=producto" target="myframe" style="margin-left: 10px; border: none">INVENTARIO</a>

</li>

<li class="nav-item">

<a class="btn btn-outline-light font-crazy text-light font-weight-bold px-3" href="Controlador?menu=RegistrarVenta" target="myframe" style="margin-left: 10px; border: none">NUEVA VENTA</a>

</li>
</ul>
<div class="dropdown">
  <button type="button" class="btn upper font-old-school btn-outline-light dropdown-toggle font-weight-bold px-3 midropdow" data-toggle="dropdown" >
   ${usuario.getUsuario()}
  </button>
  <div class="dropdown-menu text-center">
      <a class="dropdown-item" href="#">
          <img src="img/user.png" alt="60" width="90"/>
      </a>
    <a class="dropdown-item font-crazy upper" href="#">Administrador</a>
    <a class="dropdown-item font-crazy upper" href="#">ADmin@misena.edu.co</a>
    <div class="dropdown-divider"></div>
    <form method="POST" action="Validar">
    
    <button name="accion" value="Salir" class="dropdown-item font-drop upper">Salir</button>
    </form>
  </div>
</div>

</div>

</nav>
  <br>
    <br>
  <br>
  <br>
  
 

  <div class="m-4" style="height:  1000px;" >
      <iframe name="myframe" style="height: 100%; width: 100%; border: none "></iframe>
  </div>

</body>

</html>