package fr.adaming.test;

import fr.adaming.service.AgentService;
import fr.adaming.service.IAgentService;
import fr.adaming.service.IUtilisateurService;
import fr.adaming.service.UtilisateurService;

/**
 * Classe pour tester les fonctionnalités
 * 
 * @author inti0304
 */
public class Test {

	public static void main(String[] args) {
		IUtilisateurService serv = new UtilisateurService();
		IAgentService ag = new AgentService();
		System.out.println(serv.getAllUtilisateurs());
		System.out.println(ag.getAllAgents());
		System.out.println(ag.isExist("abcd@mail.com", "1234"));
		System.out.println(ag.isExist("abcd@com", "1234"));
		
		System.out.println(serv.supprimerUtilisateur("8"));
	}
}
