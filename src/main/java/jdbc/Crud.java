package jdbc;


import model.Article;
import model.Client;

import java.sql.SQLException;
import java.util.List;

public interface Crud {
     int insertClient(Client c );
     Client login(String nom,String prenom) throws SQLException;

    Article getArticleByNum(int num) throws SQLException;
    
    List<Article> getArticles() throws SQLException;
}
