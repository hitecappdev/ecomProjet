package model;

import java.sql.Date;

public class Commande {

	private int numComm;
	private int codeClient;
	private Date dateComm;
	
	
	public Commande() {
		super();
	}
	public Commande(int codeClient, Date dateComm) {
		super();
		this.codeClient = codeClient;
		this.dateComm = dateComm;
	}
	public Commande(int numComm, int codeClient, Date dateComm) {
		super();
		this.numComm = numComm;
		this.codeClient = codeClient;
		this.dateComm = dateComm;
	}
	public int getNumComm() {
		return numComm;
	}
	public void setNumComm(int numComm) {
		this.numComm = numComm;
	}
	public int getCodeClient() {
		return codeClient;
	}
	public void setCodeClient(int codeClient) {
		this.codeClient = codeClient;
	}
	public Date getDateComm() {
		return dateComm;
	}
	public void setDateComm(Date dateComm) {
		this.dateComm = dateComm;
	}
	
	
}
