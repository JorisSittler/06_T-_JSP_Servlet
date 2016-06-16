package fr.adaming.service;

import java.util.List;

import fr.adaming.dao.AgentDaoImpl;
import fr.adaming.dao.IAgentDao;
import fr.adaming.model.Agent;

public class AgentService implements IAgentService {
	IAgentDao agentDao = new AgentDaoImpl();

	@Override
	public List<Agent> getAllAgents() {
		return agentDao.getAllAgents();
	}

	@Override
	public int isExist(String mail, String mdp) {
		return agentDao.isExist(mail, mdp);
	}

}
