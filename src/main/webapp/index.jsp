<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Banco Platinum</title>
	</head>
<body>
	<form action="ValidadorServlet" method="POST" >
		Usuario: <input type="text" name="username" required/><br>
		Contraseña: <input type="password" name="password" required/><br>
		<input type="submit" name="loginbtn" value="Login"/>

	</form>
</body>
</html>
