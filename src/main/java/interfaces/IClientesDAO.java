/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import dominio.Cliente;
import excepciones.PersistenciaException;

/**
 * 
 * @author 233215 y 233301
 */
public interface IClientesDAO {
    
    public Cliente registrar(Cliente cliente) throws PersistenciaException;
    public Cliente actualizar(Cliente cliente) throws PersistenciaException;
    public Cliente consultar(Integer idCliente);

    
    

    
}