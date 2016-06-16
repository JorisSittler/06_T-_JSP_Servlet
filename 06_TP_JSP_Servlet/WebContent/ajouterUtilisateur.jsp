<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ajout d'utilisateur</title>
</head>
<body>
	<h3>Bienvenue sur la page d'ajout</h3>
	<p>Votre login est ${sessionScope.agentSession.mail}</p>
	<form method="post" action="ajouterUtilisateur">
		<table>
			<tr>
				<td>Nom</td>
				<td><input type="text" name="nom" /></td>
			</tr>
			<tr>
				<td>Prénom</td>
				<td><input type="text" name="prenom" /></td>
			</tr>
			<tr>
				<td>Mail</td>
				<td><input type="text" name="mail" /></td>
			</tr>
			<tr>
				<td>Mot de Passe</td>
				<td><input type="text" name="motdepasse" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Ajouter" /></td>
			</tr>
		</table>
	</form>
	<a href="succes.jsp">Accueil</a>
	<a href="supprimerUtilisateur.jsp">Supprimer</a>
	<a href="modifierUtilisateur.jsp">Modifier</a>
</body>
</html>