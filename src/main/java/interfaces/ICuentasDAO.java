package interfaces;
import dominio.Cuenta;
import excepciones.PersistenciaException;

/**
 *
 * @author 233215 y 233301
 */
public interface ICuentasDAO {
    
    /**
     * Metodo que crea una cuenta, en caso de no poder lanza una persistenciaException
     * @param cuenta
     * @return
     * @throws PersistenciaException 
     */
    public Cuenta crearCuenta(Cuenta cuenta) throws PersistenciaException{
        
    }
    /**
     * Metodo que cancela una cuenta, en caso de no existir lanza una persistenciaException
     * @param cuenta
     * @return
     * @throws PersistenciaException 
     */
    public Cuenta cancelar(Cuenta cuenta) throws PersistenciaException{
        
    }
    /**
     * Metodo que aumenta el saldo de la cuenta del cliente, en caso de no poder o no
     * existir se lanza una persistenciaException
     * @param cantidad
     * @return
     * @throws PersistenciaException 
     */
    public Cuenta aumentarSaldo(int cantidad) throws PersistenciaException{
        
    }
    /**
     * Metodo que disminuye el saldo mediante una resta, en caso de no poder lanza una
     * persistencia Exception
     * @param cantidad
     * @return
     * @throws PersistenciaException 
     */
    public Cuenta disminuirSaldo(int cantidad) throws PersistenciaException{
        
    }
    
}
