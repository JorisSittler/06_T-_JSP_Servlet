<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Suppression d'utilisateur</title>
</head>
<body>
	${userListe}
		<table style="border: solid 1px black">
			<tr style="background-color: lightgray">
				<th>id</th>
				<th>Nom</th>
				<th>Prénom</th>
				<th>Mail</th>
				<th>Mot de Passe</th>
			</tr>
			<c:forEach var="utilisateur" items="${userListe}">
				<tr>
					<td>${utilisateur.id}</td>
					<td>${utilisateur.nom}</td>
					<td>${utilisateur.prenom}</td>
					<td>${utilisateur.mail}</td>
					<td>${utilisateur.motDePasse}</td>
				</tr>
			</c:forEach>
		</table>
	<p>Votre login est ${sessionScope.agentSession.mail}</p>
	<form method="post" action="supprimerUtilisateur">
		<table>
			<tr>
				<td>ID de l'utilisateur à supprimer :</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Supprimer" /></td>
			</tr>
		</table>
	</form>
	<a href="succes.jsp">Accueil</a>
	<a href="ajouterUtilisateur.jsp">Ajouter</a>
	<a href="modifierUtilisateur.jsp">Modifier</a>
</body>
</html>