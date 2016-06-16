package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Agent;

public interface IAgentDao {
	/**
	 * @return liste de tous les agents dans la base
	 */
	public List<Agent> getAllAgents();
	/**
	 * @param mail
	 * @param mdp
	 * @return nombre d'agent ayant les mail et mdp en paramètre
	 */
	public int isExist(String mail, String mdp);
}
