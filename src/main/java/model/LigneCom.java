package model;

public class LigneCom {
	private int numComm;
	private int codeArticle;
	private int qntComm;
	
	public LigneCom() {
		super();
	}
			
	public LigneCom(int numComm, int codeArticle, int qntComm) {
		super();
		this.numComm = numComm;
		this.codeArticle = codeArticle;
		this.qntComm = qntComm;
	}
	
	public int getNumComm() {
		return numComm;
	}
	public void setNumComm(int numComm) {
		this.numComm = numComm;
	}
	public int getCodeArticle() {
		return codeArticle;
	}
	public void setCodeArticle(int codeArticle) {
		this.codeArticle = codeArticle;
	}
	public int getQntComm() {
		return qntComm;
	}
	public void setQntComm(int qntComm) {
		this.qntComm = qntComm;
	}
	
	
}
