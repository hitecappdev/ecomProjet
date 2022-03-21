package jdbc;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Category;

import model.Article;
import model.Client;



public class CrudImp implements Crud{
	
    @Override
    public int insertClient(Client c ) {
        Connexion cn = new Connexion();

        Statement stm = cn.getStm();
        int rt2 = 0;
        try {
                String sql2 = "INSERT INTO client (nom,prenom,email,adresse,password) VALUES('"+ c.getNom() + "','" + c.getPrenom() + "','" + c.getEmail()+"','" +c.getAdress()+ "','" +c.getPassword()+"');";
                rt2 = stm.executeUpdate(sql2);
            

        } catch (Exception e) {
            e.printStackTrace();
        }
        return rt2;

    }
    @Override
    public Client login(String nom, String password) throws SQLException {
        Connexion cn = new Connexion();

        Statement stm = cn.getStm();
        String sql1 = "Select * from client where  nom='"+nom+"' and password='"+password+"' limit 1;";
        ResultSet result=stm.executeQuery(sql1);
        if(result.next()){
            System.out.println("eala slamtek");
            return new Client(
            		result.getInt(1),
            		result.getString(2),
            		result.getString(3),
            		result.getString(4),
            		result.getString(5),
            		result.getString(6)
            		);
        }
        System.out.println("teste khasser hhHHH");

        return null;



    }

    @Override
    public Article getArticleByNum(int num) throws SQLException {
        Connexion cn = new Connexion();

        Statement stm = cn.getStm();
        String sql1 = "Select * from article where codeArticle="+num+";";
        ResultSet result=stm.executeQuery(sql1);
        if(result.next()){
        	
        	System.out.print(result.getString("designation"));
        	
            return new Article(result.getInt("codeArticle"),result.getString("designation"),result.getString("auteur"),result.getInt("prix"),result.getInt("stock"),new Category(result.getString("categorie")),result.getString("photo"));
        }
        System.out.println("no article");

        return null;
    }
    
    @Override
    public List<Article> getArticles() throws SQLException {
        Connexion cn = new Connexion();

        Statement stm = cn.getStm();
        
        List<Article> articles = new ArrayList<Article>();
        
        String sql1 = "Select * from article ;";
        ResultSet result=stm.executeQuery(sql1);
        
        while(result.next()) {
        	articles.add(
        			new Article(
        				result.getInt(1),
        				result.getString(2),
        				result.getString(7),
        				Float.parseFloat(result.getString(3)),
        				result.getInt(4),
        				new Category(result.getString(5)),
        			
        				result.getString(6)		        				
        			));
        	
        }
        

        return articles;
    }


}
