<%-- 
    Document   : Empleados
    Created on : 7/08/2019, 12:30:18 AM
    Author     : jerson
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">



        <meta name="viewport" content="width=device-width, initial-scale=1.0">

        <script src="https://code.jquery.com/jquery-2.1.3.min.js"></script>



        <!-- Bootstrap CSS -->

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">

        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js" integrity="sha384-B0UglyR+jN6CkvvICOB2joaf5I4l3gm9GU6Hc1og6Ls7i6U/mkkaduKaBhlAXv9k" crossorigin="anonymous"></script>




        <!--fontawesome-->

        <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/all.js" integrity="sha384-xymdQtn1n3lH2wcu0qhcdaOpQwyoarkgLVxC/wZ5q7h9gHtxICrpcaSUfygqZGOe" crossorigin="anonymous"></script>

        <title>JSP Page</title>
    </head>
    <body>
        <div class="d-flex">
            <div class="card col-sm-6">
                <div class="card-body">
                    <form action="Controlador?menu=Empleados"   method="POST">
                        <div class="form-group">
                            <label>Cedula</label>
                            <input type="text" name="txtcedula"  class="form-control">                            
                        </div>
                      
                        <div class="form-group">
                            <label>Nombres</label>
                            <input type="text" name="txtnombre" value="${uu.getUsuario()}" class="form-control">                            
                        </div>
                        


                        <div class="form-group">
                            <label>Contraseña</label>
                            <input type="text" name="txtpass" class="form-control">                            
                        </div>

                        <div class="form-group">
                            <label>Rol</label><br>
                            <select name="Rol">

                                <option value="administrador">Admin</option>
                                <option value="empleado">Empleado</option>


                            </select>                          
                        </div>
                        <input type="submit" name="accion" value="Agregar" class="btn btn-info">                        
                    </form>


                </div>


            </div>
            <div class="col-sm-7">
                <table class="table text-hover">
                    <thead>
                        <tr>
                            <th>Cedula</th>
                            <th>Nombre</th>
                            <th>Rol</th>
                            <th>Acciones</th>

                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="em" items="${empleados}">
                            <tr>
                                <td>${em.getCedula()}</td>
                                <td>${em.getUsuario()}</td>
                                <td><img src="img/${em.getRol()}.png"></td>   
                                <td>
                                    <a class="btn btn-warning" href="Controlador?menu=Empleados&accion=Editar&cedula="${em.getCedula()}>Editar</a>
                                    <a class="btn btn-danger"href="Controlador?menu=Empleados&accion=Delete&cedula="${em.getCedula()} >Delete</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>




        </div>      

    </body>
</html>
