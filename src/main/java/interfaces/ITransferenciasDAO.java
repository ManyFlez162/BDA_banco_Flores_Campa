/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Transferencia;
import excepciones.PersistenciaException;
import java.util.List;
import utils.ConfiguracionPaginado;

/**
 *
 * @author 233215 y 233301
 */
public interface ITransferenciasDAO {
    
    public Transferencia transferir(Transferencia transferencia) throws PersistenciaException;
    public Transferencia consultar(int idTransferencia);
    public List<Transferencia> consultar(ConfiguracionPaginado configPaginado) throws PersistenciaException;
    
    
}
