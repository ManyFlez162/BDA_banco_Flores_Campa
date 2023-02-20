
package implementaciones;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;
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
    
    /**
     * Constructor que inicializa las variables 
     * @param cadenaConexion
     * @param usuario
     * @param password 
     */
    public ConexionBD(String cadenaConexion, String usuario, String password) {
        this.cadenaConexion = cadenaConexion;
        this.usuario = usuario;
        this.password = password;
    }
    
    /**
     * Metodo que crea una conexion con la base de datos, en caso de no poder crear la conexion
     * lanza una sqlException
     * @return
     * @throws SQLException 
     */
    public Connection crearConexion() throws SQLException{
        Connection conexion = DriverManager.getConnection(cadenaConexion, usuario, password);
        return conexion;
    }
}
