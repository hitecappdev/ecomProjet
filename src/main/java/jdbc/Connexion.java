package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Connexion {
    private Connection conn;
    private Statement stm;

    public Connection getConn() {
        return conn;
    }

    public Statement getStm() {
        return stm;
    }

    public Connexion(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","password");
            stm=conn.createStatement();
        }catch(Exception e){
            e.printStackTrace();;
        }
    }
}
