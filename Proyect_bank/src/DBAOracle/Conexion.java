package DBAOracle;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
public class Conexion {
    protected Connection conexion=null;
    
    public Conexion(){
        
    }
    protected void connectar() throws SQLException, ClassNotFoundException{
        Class.forName("oracle.jdbc.driver.OracleDirver");
        conexion = DriverManager.getConnection("jdbc:oracle:thin;@localhost:1521:XE","JULIAN","julian123");
    }
    
    protected void desconectar() throws SQLException{
        if(!conexion.isClosed()){
            conexion.close();
        }
    }
}
