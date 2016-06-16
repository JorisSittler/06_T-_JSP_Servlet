package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Agent;

public interface IAgentService {
	/**
	 * @return liste de tous les agents dans la base
	 */
	public List<Agent> getAllAgents();
	/**
	 * Renvoie le nombre d'agents avec le mail et le mdp
	 * @param mail
	 * @param mdp Mot de Passe
	 * @return
	 */
	public int isExist(String mail, String mdp);
}
