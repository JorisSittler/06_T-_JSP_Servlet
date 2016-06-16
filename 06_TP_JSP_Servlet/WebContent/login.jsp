<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h3>Bienvenue sur la page de login</h3>
	<form method="post" action="login">
		<table>
			<tr>
				<td>Mail</td>
				<td><input type="text" name="mail" /></td>
			</tr>
			<tr>
				<td>Mot de Passe</td>
				<td><input type="text" name="motdepasse" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Se Connecter" /></td>
			</tr>
		</table>
	</form>
</body>
</html>