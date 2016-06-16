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

public class ModifierServlet extends HttpServlet {
	/**
	 * On r�cup�re les param�tres de l'utilisateur � modifier (identif� par
	 * l'ID), puis on fait la modif dans la BDD ; 
	 * apr�s on revient � la liste
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// r�cup�rer les params de la requ�te
		String idString = req.getParameter("id");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String mail = req.getParameter("mail");
		String mdp = req.getParameter("motdepasse");

		// envoyer les params vers la couche service
		UtilisateurService service = new UtilisateurService();
		Utilisateur u = new Utilisateur(nom, prenom, mail, mdp);
		service.modifierUtilisateur(u, idString);

		// on affiche la liste des utilisateurs
		List<Utilisateur> listeUser = service.getAllUtilisateurs();
		req.setAttribute("userListe", listeUser);

		RequestDispatcher rd = req
				.getRequestDispatcher("listeUtilisateurs.jsp");
		rd.forward(req, resp);
	}
}
