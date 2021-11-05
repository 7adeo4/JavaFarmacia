<%-- 
    Document   : listaRecetas
    Created on : Nov 4, 2021, 4:15:05 PM
    Author     : Pc-Casa
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.exemple.modelos.Recetas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </head>
    <body>
         <h1 class="mt-5">Listado de Recetas</h1>

        <table class="table mt-5">
            <thead>
                <tr>
                    <th>Id</th>
                    <th>Tipo</th>
                    <th>Descripcion</th>
                    <th>Costo</th>
                    <th>Acciones</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${requestScope.Listado}" var="r">
                <tr>
                    <td> ${r.getIdReceta()}</td>
                    <td> ${r.getIdCliente()}</td>
                    <td> ${r.getIdProfesional()}</td>
                    <td> ${r.getIdMetodoPago()}</td>
                    <td> ${r.getIdSucursal()}</td>
                </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
