<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Actividad 1. Servlets. Servlet 4</title>
</head>
<body>
    <h1>¡Bienvenid@ <%= request.getParameter("fname") %>!</h1>
    <h2>Datos introducidos</h2>
    <p>Nombre: <%= request.getParameter("fname") %></p>
    <p>Apellido 1: <%= request.getParameter("lname1") %></p>
    <p>Apellido 2: <%= request.getParameter("lname2") %></p>
</body>
</html>