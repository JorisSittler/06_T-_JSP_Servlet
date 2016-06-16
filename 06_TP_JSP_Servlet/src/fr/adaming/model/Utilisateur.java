package fr.adaming.model;

public class Utilisateur {
	private int id;
	private String nom, prenom, mail, motDePasse;

	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param mail
	 * @param motDePasse
	 */
	public Utilisateur(int id, String nom, String prenom, String mail,
			String motDePasse) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.motDePasse = motDePasse;
	}

	/**
	 * ctor sans ID
	 * @param nom
	 * @param prenom
	 * @param mail
	 * @param motDePasse
	 */
	public Utilisateur(String nom, String prenom, String mail, String motDePasse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.motDePasse = motDePasse;
	}

	/**
	 * ctor sans paramètre
	 */
	public Utilisateur() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom
				+ ", mail=" + mail + ", motDePasse=" + motDePasse + "]";
	}
	
}
