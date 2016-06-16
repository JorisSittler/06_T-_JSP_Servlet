package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Utilisateur;

public interface IUtilisateurDao {
	/**
	 * @return liste de tous les utilisateurs dans la BDD
	 */
	public List<Utilisateur> getAllUtilisateurs();

	/**
	 * @param u
	 *            utilisateur � ajouter
	 * @return 1 si OK, 0 si probl�me
	 */
	public int ajouterUtilisateur(Utilisateur u);

	/**
	 * @param idString
	 *            l'ID de l'utilisateur � supprimer
	 * @return 1 si OK, 0 si probl�me
	 */
	public int supprimerUtilisateur(String idString);

	/**
	 * modifie l'utilisateur dans BD � l'ID de l'utilisateur u
	 * 
	 * @param u
	 *            l'utilisateur modifi�
	 * @return 1 si OK, 0 si probl�me
	 */
	public int modifierUtilisateur(Utilisateur u);
	
	/**
	 * modifie l'utilisateur dans la BD � l'ID 'id'
	 * @param u utilisateur (sans ID)
	 * @param idString l'id de l'utilisateur � modifier dans la base
	 * @return
	 */
	public int modifierUtilisateur(Utilisateur u, String idString);
}
