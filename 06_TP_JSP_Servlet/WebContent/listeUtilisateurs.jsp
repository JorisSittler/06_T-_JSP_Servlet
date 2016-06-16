
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Liste des utilisateurs</title>
</head>
<body>
<p>Votre login est ${sessionScope.agentSession.mail}</p>
<form action="succes" method="post">
		<input type="hidden" name="nom" /> 
		<input type="submit"
			value="Mettre la liste à jour" />
	</form>
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
				<td><c:out value="${utilisateur.nom}" /></td>
				<td><c:out value="${utilisateur.prenom}" /></td>
				<td><c:out value="${utilisateur.mail}" /></td>
				<td><c:out value="${utilisateur.motDePasse}" /></td>
			</tr>
		</c:forEach>
	</table>
	<a href="ajouterUtilisateur.jsp">Ajouter</a>
	<a href="supprimerUtilisateur.jsp">Supprimer</a>
	<a href="modifierUtilisateur.jsp">Modifier</a>
	<a href="echec.jsp">Se déconnecter</a>
</body>
</html>