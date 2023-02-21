/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Retiro;
import excepciones.PersistenciaException;


/**
 *
 * @author 233215 y 233301
 */
public interface IRetirosDAO {
    
    public Retiro retirar(Retiro retiro) throws PersistenciaException;
    public Retiro consultar(int idRetiro);
    
}
