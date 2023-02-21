/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import dominio.Retiro;
import excepciones.PersistenciaException;
import interfaces.IConexionBD;
import interfaces.IRetirosDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 233215 y 233301
 */
public class RetirosDAO implements IRetirosDAO{
    
    private static final Logger LOG = Logger.getLogger(RetirosDAO.class.getName());
    
    private final IConexionBD generadorConexiones;

    public RetirosDAO(IConexionBD generadorConexiones) {
        this.generadorConexiones = generadorConexiones;
    }
    
    @Override
    public Retiro retirar(Retiro retiro) throws PersistenciaException{
        String codigoSQL = "insert into retiros (cantidad,id_cuenta) values (?, ?);";
        
        try (Connection conexion = generadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL, Statement.RETURN_GENERATED_KEYS);){
            
            comando.setFloat(1, retiro.getCantidad());
            comando.setInt(2, retiro.getId_cuenta());
            
            comando.executeUpdate();
            
            ResultSet llavesGeneradas = comando.getGeneratedKeys();
            if(llavesGeneradas.next()){
                int posicionLlavePrimaria = 1;
                Integer llavePrimaria = llavesGeneradas.getInt(posicionLlavePrimaria);
                
                retiro = this.consultar(llavePrimaria);
                return retiro;
            }
            
            throw new PersistenciaException("Retiro registrado, pero id no generado");
            
        } catch(SQLException e){
            LOG.log(Level.SEVERE, e.getMessage());
            throw new PersistenciaException("No fue posible realizar el retiro");
        }
    }

    @Override
    public Retiro consultar(int idRetiro) {
        String codigoSQL = "select * from retio where id_cliente= ?";
        
        try(Connection conexion = generadorConexiones.crearConexion();
            PreparedStatement comando= conexion.prepareStatement(codigoSQL);){
            
            comando.setInt(1, idRetiro);
            ResultSet registro=  comando.executeQuery();
            // Se encontró el cliente..
            Retiro retiro = null;
            if(registro.next()){ 
                int id = registro.getInt("id_retiro");
                String fechaHoraRetiro = registro.getString("fecha_hora_transaccion");
                float cantidad = registro.getFloat("cantidad");
                int idCuenta = registro.getInt("id_cuenta");
                
                retiro = new Retiro(id, cantidad, fechaHoraRetiro, idCuenta);
            }
            
            return retiro;
        } catch(SQLException e){
            LOG.log(Level.SEVERE, e.getMessage());
            return null;
        }
    }
    
    
    
}
