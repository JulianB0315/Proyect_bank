package Ventanas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
        public static Connection getConnection() throws SQLException {
        String url = "jdbc:oracle:thin:@localhost:1521:XE"; // Cambia el URL de acuerdo a tu configuración
        String user = "JULIAN";//User
        String password = "julian123";//Password

        try {
            Class.forName("oracle.jdbc.OracleDriver"); // Cargar el driver
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return DriverManager.getConnection(url, user, password);
    }
}

