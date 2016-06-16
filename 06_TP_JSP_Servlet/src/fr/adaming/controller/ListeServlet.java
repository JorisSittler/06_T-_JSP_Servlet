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

public class ListeServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		UtilisateurService service = new UtilisateurService();
		List<Utilisateur> liste = service.getAllUtilisateurs();
		req.setAttribute("userListe", liste);
		System.out.println(liste);

		RequestDispatcher rd = req
				.getRequestDispatcher("listeUtilisateurs.jsp");
		rd.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		UtilisateurService service = new UtilisateurService();

		List<Utilisateur> listeUser = service.getAllUtilisateurs();
		req.setAttribute("userListe", listeUser);

		RequestDispatcher rd = req
				.getRequestDispatcher("listeUtilisateurs.jsp");
		rd.forward(req, resp);
	}
}
