/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import interfaces.IClientesDAO;
import excepciones.PersistenciaException;
import dominio.Cliente;

/**
 *
 * @author 233215 y 233301
 */
public class ClientesDAO implements IClientesDAO{
    
    /**
     * Metodo que registra un cliente y lo retorna, en caso de no poder lanza un 
     * persistenciaException
     * @param cliente
     * @return
     * @throws PersistenciaException 
     */
    public Cliente registrar(Cliente cliente) throws PersistenciaException{
        return cliente;
    }
    /**
     * Metodo que actualiza cliente, en caso de no existir lanza una persitenciaException
     * @param cliente
     * @return
     * @throws PersistenciaException 
     */
    public Cliente actualizar(Cliente cliente) throws PersistenciaException{
        return cliente;
    }
    
    
}
