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
        <link rel="stylesheet" href="mycss/miestilo.css">



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
            <div class="card col-sm-6-my my-oppacity" >
                <div class="card-body ">
                    <form action="Controlador?menu=Empleados"   method="POST">
                        <div class="form-group">
                            <label class="font-drop upper font-color-drop-little " >Cedula</label>
                            <input type="text" name="txtcedula"  class="form-control">                            
                        </div>
                      
                        <div class="form-group">
                            <label class="font-drop upper font-color-drop-little">Nombres</label>
                            <input type="text" name="txtnombre"  class="form-control">                            
                        </div>
                        


                        <div class="form-group">
                            <label class="font-drop upper font-color-drop-little">Contraseña</label>
                            <input type="text" name="txtpass" class="form-control">                            
                        </div>

                        <div class="form-group">
                            <label class="font-drop upper font-color-drop-little">Rol</label><br>
                            <select name="Rol" class="browser-default custom-select">
                                <option selected>Elige</option>
                                <option class="font-drop upper font-color-drop-little" value="administrador">Administrador</option>
                                <option class="font-drop upper font-color-drop-little" value="empleado">Empleado</option>


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
                            <th class="font-drop upper font-color-drop">Cedula</th>
                            <th class="font-drop upper font-color-drop">Nombre</th>
                            <th class="font-drop upper font-color-drop">Rol</th>
                            <th class="font-drop upper font-color-drop" >Acciones</th>

                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="em" items="${empleados}">
                            <tr>
                                <td class="font-Neon">${em.getCedula()}</td>
                                <td class="font-pacman">${em.getUsuario()}</td>
                                <td ><img src="img/${em.getRol()}.png"></td>   
                                <td>
                                    <a class="btn btn-warning font-drop" href="Controlador?menu=Empleados&accion=Editar&cedula="${em.getCedula()}>Editar</a>
                                    <a class="btn btn-danger font-drop"href="Controlador?menu=Empleados&accion=Delete&cedula="${em.getCedula()} >Delete</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>




        </div>      

    </body>
</html>
