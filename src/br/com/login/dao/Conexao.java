package br.com.login.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public Connection getConnection() throws SQLException {
        String url = "jdbc:postgresql://localhost:5433/bibliotech";
        String user = "postgres";
        String password = "123";
                
        Connection conexao = DriverManager.getConnection(url, user, password);
        return conexao;
    }
}
