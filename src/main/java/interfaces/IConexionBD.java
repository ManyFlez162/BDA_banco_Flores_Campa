/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author 233215 y 233301
 */
public interface IConexionBD {
    
    public Connection crearConexion() throws SQLException;
}
