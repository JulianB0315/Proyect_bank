package Controlador;

import Ventanas.Guia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Capaz {
    public static void main(String[] args) {
        Guia pantaGuia= new Guia();
        pantaGuia.setVisible(true);
        pantaGuia.setLocationRelativeTo(null);       
    }
public class DatabaseConnection {
    private static final String URL = "jdbc:oracle:thin;@localhost:1521:XE"; 
    private static final String USER = "JULIAN";
    private static final String PASSWORD = "julian123"; 

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
}
