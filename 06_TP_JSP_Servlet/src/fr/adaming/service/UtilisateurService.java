package fr.adaming.service;

import java.util.List;

import fr.adaming.dao.IUtilisateurDao;
import fr.adaming.dao.UtilisateurDaoImpl;
import fr.adaming.model.Utilisateur;

public class UtilisateurService implements IUtilisateurService {
	IUtilisateurDao utilisateurDao = new UtilisateurDaoImpl();

	@Override
	public List<Utilisateur> getAllUtilisateurs() {
		return utilisateurDao.getAllUtilisateurs();
	}

	@Override
	public int ajouterUtilisateur(Utilisateur u) {
		return utilisateurDao.ajouterUtilisateur(u);
	}

	@Override
	public int supprimerUtilisateur(String idString) {
		return utilisateurDao.supprimerUtilisateur(idString);
	}

	@Override
	public int modifierUtilisateur(Utilisateur u) {
		return utilisateurDao.modifierUtilisateur(u);
	}

	@Override
	public int modifierUtilisateur(Utilisateur u, String idString) {
		return utilisateurDao.modifierUtilisateur(u, idString);
	}

}
