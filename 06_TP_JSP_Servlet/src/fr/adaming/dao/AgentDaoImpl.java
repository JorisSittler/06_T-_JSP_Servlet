package fr.adaming.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.adaming.model.Agent;
import fr.adaming.util.DbUtilitaire;

public class AgentDaoImpl implements IAgentDao {

	@Override
	public List<Agent> getAllAgents() {
		try {
			Connection cnx = DbUtilitaire.seConnecter();
			String requete = "SELECT * FROM agents;";
			PreparedStatement ps = cnx.prepareStatement(requete);
			ResultSet rs = ps.executeQuery();

			List<Agent> liste = new ArrayList<>();
			while (rs.next()) {
				int id2 = rs.getInt("id");
				String mail2 = rs.getString("mail");
				String motDePasse2 = rs.getString("motdepasse");
				Agent agent = new Agent(id2, mail2, motDePasse2);
				liste.add(agent);
			}
			return liste;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtilitaire.seDeconnecter();
		}
		return null;
	}

	@Override
	public int isExist(String mail, String mdp) {
		try {
			Connection cnx = DbUtilitaire.seConnecter();
			String requete = "SELECT COUNT(id) FROM agents WHERE mail=? and motdepasse=?";
			PreparedStatement ps = cnx.prepareStatement(requete);
			ps.setString(1, mail);
			ps.setString(2, mdp);
			
			ResultSet rs = ps.executeQuery();
			rs.next();

			return rs.getInt(1);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DbUtilitaire.seDeconnecter();
		}
		return 0;
	}

}
