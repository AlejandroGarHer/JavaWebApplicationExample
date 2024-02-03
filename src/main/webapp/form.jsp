<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Actividad 1. Servlets. Servlet 3</title>
</head>
<body>
    <h1>Formulario</h1>
    <form action="/Servlet4">
        <label for="fname">Nombre:</label><br>
        <input type="text" id="fname" name="fname" value=""><br>
        <label for="lname1">Apellido 1:</label><br>
        <input type="text" id="lname1" name="lname1" value=""><br>
        <label for="lname2">Apellido 2:</label><br>
        <input type="text" id="lname2" name="lname2" value=""><br><br>
        <input type="submit" value="Enviar">
    </form>
    <p></p>
    <p>Al hacer click en el botón "Enviar", los datos del formulario se envían a la página "/Servlet4".</p>
</body>
</html>