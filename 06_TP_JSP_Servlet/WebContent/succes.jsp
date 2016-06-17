<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Succès</title>
	<link rel="stylesheet" type="text/css" href="style.css" />
</head>
<body>
	<h1>Login avec succès</h1>
	<% String idSession=(String) request.getAttribute("idSession"); %>
	<p>Votre login est ${sessionScope.agentSession.mail}, idSession : ${idSession}</p>
	<form action="succes" method="post">
		<input type="hidden" name="nom" /> 
		<input type="submit"
			value="Voir la liste des utilisateurs" />
	</form>
		<a href="ajouterUtilisateur.jsp">Ajouter</a>
	<a href="supprimerUtilisateur.jsp">Supprimer</a>
	<a href="modifierUtilisateur.jsp">Modifier</a>
</body>
</html>