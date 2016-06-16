package fr.adaming.model;

public class Agent {
	private int id;
	private String mail, password;

	/**
	 * ctor sans paramètre
	 */
	public Agent() {
		super();
	}

	/**
	 * ctor sans ID
	 * 
	 * @param mail
	 * @param password
	 */
	public Agent(String mail, String password) {
		super();
		this.mail = mail;
		this.password = password;
	}

	/**
	 * ctor
	 * 
	 * @param id
	 * @param mail
	 * @param password
	 */
	public Agent(int id, String mail, String password) {
		super();
		this.id = id;
		this.mail = mail;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Agent [id=" + id + ", mail=" + mail + ", password=" + password
				+ "]";
	}

}
