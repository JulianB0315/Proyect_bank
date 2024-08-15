/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Julian
 */
public class ConexionOracle {
    private Connection conn = null;
    private String url,user,pass;

    public ConexionOracle() {
        conectar();
    }
    
    private void conectar(){
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            url="jdbc:oracle:thin:@localhost:1521:XE";
            user="JULIAN";
            pass="julian123";
            conn = DriverManager.getConnection(url,user,pass);
            System.out.println("Conectado!");
        } catch (Exception e) {
            System.out.println("ERROR, nose puso conectar");
        }
    }
    private void Desconectar(){
        try {
            conn.close();
        } catch (Exception e) {
            System.out.println("Error no se puedo desconectar");
        }
    }
}
