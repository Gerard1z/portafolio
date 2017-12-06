<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="css/style.css" rel="stylesheet"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>consulta los del usuario</h1>
<form id="frmDatosUsuario" action= "EjemploJDBCAgregarRegistroServlet" method="post">
<input id="Acepta" type="submit" value="consultas Registros">
</form>

<h1>introduce los datos del usuario</h1>
<form id="frmDatosUsuario" action= "EjemploJDBCAgregarRegistrosServlet" method="post">
<label>input the User id:</label><input type=text" name="txtIdUser"/>
</br>
<label>input the Username:</label><input type=text" name="txtUsername"/>
</br>
<label>input the password of the user:</label><input type="password" name="txtpassword"/>
</br>
<input id="Acepta" type="submit" value="Agregar Registro">
</form>

</body>
<script src="js/script.js"></script>
</html>