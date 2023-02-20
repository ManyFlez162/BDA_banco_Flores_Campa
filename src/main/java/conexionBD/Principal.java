
package conexionBD;

import dominio.Cliente;
import implementaciones.ConexionBD;
import interfaces.IClientesDAO;
import interfaces.IConexionBD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 233215 y 
 */
public class Principal {

    public static void main(String[] args) throws SQLException {
        String cadenaConexion = "jdbc:mysql://localhost/banco";
            Connection  conexion = (Connection) DriverManager.getConnection(cadenaConexion, "root", "");
            
            
            IConexionBD generadorConexiones = (IConexionBD) new ConexionBD("jdbc:mysql://localhost/banco", "root", "");
            
}
