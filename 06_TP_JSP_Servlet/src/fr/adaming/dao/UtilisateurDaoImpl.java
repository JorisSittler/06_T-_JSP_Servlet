package fr.adaming.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;

import fr.adaming.model.Utilisateur;
import fr.adaming.util.DbUtilitaire;

public class UtilisateurDaoImpl implements IUtilisateurDao {

	@Override
	public List<Utilisateur> getAllUtilisateurs() {
		try {
			Connection cnx = DbUtilitaire.seConnecter();
			String requete = "SELECT * FROM utilisateurs;";
			PreparedStatement ps = cnx.prepareStatement(requete);
			ResultSet rs = ps.executeQuery();

			List<Utilisateur> liste = new ArrayList<Utilisateur>();
			while (rs.next()) {
				int id2 = rs.getInt("id");
				String nom2 = rs.getString("nom");
				String prenom2 = rs.getString("prenom");
				String mail2 = rs.getString("mail");
				String motDePasse2 = rs.getString("motdepasse");

				Utilisateur ut = new Utilisateur(id2, nom2, prenom2, mail2,
						motDePasse2);
				liste.add(ut);
			}
			//System.out.println(liste);
			return liste;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtilitaire.seDeconnecter();
		}
		return null;
	}

	@Override
	public int ajouterUtilisateur(Utilisateur u) {
		try {
			Connection cnx = DbUtilitaire.seConnecter();
			String requete = "INSERT INTO utilisateurs (nom, prenom, mail, motdepasse) VALUES (?,?,?,?)";
			PreparedStatement ps = cnx.prepareStatement(requete);
			// passer les paramètres
			ps.setString(1, u.getNom());
			ps.setString(2, u.getPrenom());
			ps.setString(3, u.getMail());
			ps.setString(4, u.getMotDePasse());

			return ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtilitaire.seDeconnecter();
		}
		return 0;
	}

	@Override
	public int supprimerUtilisateur(String id) {
		try {
			Connection cnx = DbUtilitaire.seConnecter();
			String requete = "DELETE FROM utilisateurs WHERE id=?";
			PreparedStatement ps = cnx.prepareStatement(requete);
			// passer les paramètres
			ps.setString(1, id);

			return ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtilitaire.seDeconnecter();
		}
		return 0;
	}

	@Override
	public int modifierUtilisateur(Utilisateur u) {
		try {
			Connection cnx = DbUtilitaire.seConnecter();
			String requete = "UPDATE utilisateurs SET nom=?, prenom=?, mail=?, motdepasse=? WHERE id=?";
			PreparedStatement ps = cnx.prepareStatement(requete);
			// passer les paramètres
			ps.setString(1, u.getNom());
			ps.setString(2, u.getPrenom());
			ps.setString(3, u.getMail());
			ps.setString(4, u.getMotDePasse());
			ps.setInt(5, u.getId());

			return ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtilitaire.seDeconnecter();
		}
		return 0;
	}

	@Override
	public int modifierUtilisateur(Utilisateur u, String id) {
		try {
			Connection cnx = DbUtilitaire.seConnecter();
			String requete = "UPDATE utilisateurs SET nom=?, prenom=?, mail=?, motdepasse=? WHERE id=?";
			PreparedStatement ps = cnx.prepareStatement(requete);
			// passer les paramètres
			ps.setString(1, u.getNom());
			ps.setString(2, u.getPrenom());
			ps.setString(3, u.getMail());
			ps.setString(4, u.getMotDePasse());
			ps.setString(5, id);

			return ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtilitaire.seDeconnecter();
		}
		return 0;
	}
}
