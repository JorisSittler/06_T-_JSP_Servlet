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
	 *            utilisateur à ajouter
	 * @return 1 si OK, 0 si problème
	 */
	public int ajouterUtilisateur(Utilisateur u);

	/**
	 * @param idString
	 *            l'ID de l'utilisateur à supprimer
	 * @return 1 si OK, 0 si problème
	 */
	public int supprimerUtilisateur(String idString);

	/**
	 * modifie l'utilisateur dans BD à l'ID de l'utilisateur u
	 * 
	 * @param u
	 *            l'utilisateur modifié
	 * @return 1 si OK, 0 si problème
	 */
	public int modifierUtilisateur(Utilisateur u);
	
	/**
	 * modifie l'utilisateur dans la BD à l'ID 'id'
	 * @param u utilisateur (sans ID)
	 * @param idString l'id de l'utilisateur à modifier dans la base
	 * @return
	 */
	public int modifierUtilisateur(Utilisateur u, String idString);
}
