<%-- 
    Document   : n
    Created on : 6/08/2019, 03:56:39 PM
    Author     : jerson
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="mycss/miestilo.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

        <title>Login</title>
    </head>
    <body class="body-yo" >
       <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <ul class="navbar-nav">
    <li class="nav-item active">
      <a class="btn btn-outline-light" style="margin-left: 50px; border: none ; font-size:30px" href="#">INICIAR SESION</a>
    </li>
  
  </ul>
           

</nav>
         
        <div class="container mt-4 col-lg-3" >
            <div class="card col-sm-10 " style="background-image: url('img/background.png')" >
                
                <div class="card-body ">
                    <form action="Validar" method="POST">
                        <div class="form-group text-center" >
                            <h3 style="color: #fefefe">Login</h3>
                            <img src="img/logo.png" alt="70" width="170"/><br>
                            <label style="color: #fefefe">Bienvenidos al sistema</label>
                        </div>
                         <div class="form-group">
                             <label style="color: #fefefe">Usuario:</label>
                             <input type="text" name="txtuser" class="form-control">
                        </div>
                         <div class="form-group">
                             <label style="color: #fefefe">Password:</label>
                             <input type="password" name="txtpass" class="form-control">
                        </div>
                        <input type="submit" name="accion" value="Ingresar" class="btn btn-info btn-block">
                    </form>
                </div>        
            </div>  
            
        </div>
        
      
        
        
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
