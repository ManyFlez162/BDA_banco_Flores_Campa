
package interfaces;

import dominio.Transferencia;
import excepciones.PersistenciaException;

/**
 *
 * @author 233215 y 
 */
public interface ITransferenciasDAO {
    /**
     * Metodo que inicializa las variables suma y resta para la clase transferencia
     * @param transferencia
     * @return
     * @throws PersistenciaException 
     */
    public Transferencia transferir(Transferencia transferencia) throws PersistenciaException;
    public int sumar(int cantidad);
    public int restar(int cantidad);
    
}
