/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Transferencia;
import excepciones.PersistenciaException;

/**
 *
 * @author yarvi
 */
public interface ITransferenciasDAO {
    
    public Transferencia transferir(Transferencia transferencia) throws PersistenciaException;
    public int sumar(int cantidad);
    public int restar(int cantidad);
    
}
