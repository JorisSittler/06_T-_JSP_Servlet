package fr.adaming.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.adaming.model.Utilisateur;
import fr.adaming.service.UtilisateurService;

public class AjouterServlet extends HttpServlet {

	/**
	 * On récupère les paramètres de l'utilisateur à créer, puis on l'ajoute à la BDD
	 * après on revient à la liste
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// récupérer les params de la requête
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String mail = req.getParameter("mail");
		String mdp = req.getParameter("motdepasse");

		// envoyer les params vers la couche service
		UtilisateurService service = new UtilisateurService();
		Utilisateur u = new Utilisateur(nom, prenom, mail, mdp);
		service.ajouterUtilisateur(u);

		// on affiche la liste des utilisateurs
		List<Utilisateur> listeUser = service.getAllUtilisateurs();
		req.setAttribute("userListe", listeUser);

		RequestDispatcher rd = req
				.getRequestDispatcher("listeUtilisateurs.jsp");
		rd.forward(req, resp);
	}
}
