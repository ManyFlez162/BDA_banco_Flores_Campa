
package implementaciones;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 233215 y 233301
 */
public class ConexionBD {
    
    private final String cadenaConexion;
    private final String usuario;
    private final String password;

    public ConexionBD(String cadenaConexion, String usuario, String password) {
        this.cadenaConexion = cadenaConexion;
        this.usuario = usuario;
        this.password = password;
    }

    public Connection crearConexion() throws SQLException{
        Connection conexion = DriverManager.getConnection(cadenaConexion, usuario, password);
        return conexion;
    }
}
