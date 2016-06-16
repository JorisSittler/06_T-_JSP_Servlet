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

public class SupprimerServlet extends HttpServlet {

	/**
	 * on balance la liste des Utilisateur
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		UtilisateurService service = new UtilisateurService();
		List<Utilisateur> listeUser = service.getAllUtilisateurs();
		req.setAttribute("userListe", listeUser);
		RequestDispatcher rd = req
				.getRequestDispatcher("supprimerUtilisateur.jsp");
		rd.forward(req, resp);
	}

	/**
	 * On récupère l'id de l'utilisateur à supprimer et demande sa suppression de la BDD
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// récupérer l'id
		String idString = req.getParameter("id");
		UtilisateurService service = new UtilisateurService();
		service.supprimerUtilisateur(idString);

		// on affiche la liste des utilisateurs
		List<Utilisateur> listeUser = service.getAllUtilisateurs();
		req.setAttribute("userListe", listeUser);

		RequestDispatcher rd = req
				.getRequestDispatcher("listeUtilisateurs.jsp");
		rd.forward(req, resp);

	}

}
