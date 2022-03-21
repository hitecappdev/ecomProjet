package model;

public class Client {
	
	private int id ;
	private String nom;
	private String prenom;
	private String email;
	private String adress;
	private int codePostale;
	private String ville;
	private String phone;
	private String password;
	
	
	public Client() {
		super();
	}
	
	public Client(int id, String nom, String prenom, String email, String adress, String password) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adress = adress;
		this.codePostale = codePostale;
		this.ville = ville;
		this.phone = phone;
		this.password = password;
	}
	
	public Client(String nom, String prenom, String email, String adress, String password) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adress = adress;
		this.password = password;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getCodePostale() {
		return codePostale;
	}
	public void setCodePostale(int codePostale) {
		this.codePostale = codePostale;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	

	
}
