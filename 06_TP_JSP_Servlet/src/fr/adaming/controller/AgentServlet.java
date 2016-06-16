package fr.adaming.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.adaming.model.Agent;
import fr.adaming.model.Utilisateur;
import fr.adaming.service.AgentService;
import fr.adaming.service.UtilisateurService;

public class AgentServlet extends HttpServlet {

	/**
	 * On récupère les valeurs (mail et mdp) envoyées par le formulaire et
	 * vérifie si l'agent correspondant existe. 
	 * Si oui on va sur la page liste utilisateurs
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// récupérer les params de la requête
		String mail = req.getParameter("mail");
		String mdp = req.getParameter("motdepasse");

		// envoyer les params vers la couche service
		AgentService agentService = new AgentService();
		int verif = agentService.isExist(mail, mdp);
		if (verif == 1) {
			Agent agentSession = new Agent(mail, mdp);
			HttpSession maSession = req.getSession();

			maSession.setAttribute("agentSession", agentSession);
			maSession.setMaxInactiveInterval(120);

			// on affiche la liste des utilisateurs
			UtilisateurService service = new UtilisateurService();
			List<Utilisateur> listeUser = service.getAllUtilisateurs();
			req.setAttribute("userListe", listeUser);

			RequestDispatcher rd = req.getRequestDispatcher("listeUtilisateurs.jsp");
			rd.forward(req, resp);
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("echec.jsp");
			rd.forward(req, resp);
		}
	}
}
