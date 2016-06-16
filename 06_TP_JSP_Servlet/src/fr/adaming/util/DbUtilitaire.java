package fr.adaming.util;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

public class DbUtilitaire {
	public static Connection cnx;
	public final static String url = "jdbc:mysql://localhost:3306/jsp_sql";
	public final static String user = "root";
	public final static String password = "root";

	/**
	 * se connecte à la BD
	 * @return la Connection créée
	 */
	public static Connection seConnecter() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cnx = DriverManager.getConnection(url, user, password);
			return cnx;
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} 
		return null;
	}
	
	/**
	 * se déconnecte de la DB
	 */
	public static void seDeconnecter(){
		if(cnx != null){
			try {
				cnx.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
