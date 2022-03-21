package model;

public class Article {
	private int codeArticle;
	private String destination;
	private String auteur;
	private String category;
	private Category categorie;
	private float prix;
	private int stock;
	private String image;
	
	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public Category getCategorie() {
		return categorie;
	}

	public void setCategorie(Category categorie) {
		this.categorie = categorie;
	}

	public Article(int codeArticle, String destination,String auteur,  float prix, int stock,Category categorie, String image) {
		super();
		this.codeArticle = codeArticle;
		this.destination = destination;
		this.auteur=auteur;
		this.categorie = categorie;
		this.prix = prix;
		this.stock = stock;
		this.image = image;
	}

	public Article() {
		super();
	}
	
	public int getCodeArticle() {
		return codeArticle;
	}
	public void setCodeArticle(int codeArticle) {
		this.codeArticle = codeArticle;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	
}
