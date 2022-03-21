package model;

public class Category {
	
	private int refCat;
	private String cat;
	
	public int getRefCat() {
		return refCat;
	}
	public void setRefCat(int refCat) {
		this.refCat = refCat;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	
	public Category() {
		super();
	}
	public Category( String cat) {
		super();
		this.cat = cat;
	}
	public Category(int refCat, String cat) {
		super();
		this.refCat = refCat;
		this.cat = cat;
	}

}
