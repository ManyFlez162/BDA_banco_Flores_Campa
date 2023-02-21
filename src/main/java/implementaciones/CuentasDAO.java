/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import dominio.Cuenta;
import excepciones.PersistenciaException;
import interfaces.IConexionBD;
import interfaces.ICuentasDAO;
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
public class CuentasDAO implements ICuentasDAO{

    private static final Logger LOG = Logger.getLogger(ClientesDAO.class.getName());
    
    private final IConexionBD generadorConexiones;

    public CuentasDAO(IConexionBD generadorConexion) {
        this.generadorConexiones = generadorConexion;
    }
    
    @Override
    public Cuenta crearCuenta(Cuenta cuenta) throws PersistenciaException {
        String codigoSQL = "insert into clientes"
                    + "(nombres, apellido_paterno, apellido_materno, fecha_nacimiento, calle, colonia, numero) "
                    + "values(?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conexion = generadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL, Statement.RETURN_GENERATED_KEYS);){
            
            
            
            
//            comando.setString(1, conexion.getNombres());
//            comando.setString(2, cliente.getApellido_Paterno());
//            comando.setString(3, cliente.getApellido_Materno());
//            comando.setString(4, cliente.getFecha_Nacimiento());
//            comando.setString(5, cliente.getCalle());
//            comando.setString(6, cliente.getColonia());
//            comando.setString(7, cliente.getNumero());
            
            comando.executeUpdate();
            
            ResultSet llavesGeneradas = comando.getGeneratedKeys();
            if(llavesGeneradas.next()){
                int posicionLlavePrimaria = 1;
                Integer llavePrimaria = llavesGeneradas.getInt(posicionLlavePrimaria);
                cliente.setId(llavePrimaria);
                return cliente;
            }
            
            throw new PersistenciaException("Cliente registrado, pero id no generado");
            
            
        } catch(SQLException e){
            LOG.log(Level.SEVERE, e.getMessage());
            throw new PersistenciaException("No fue posible registrar al cliente");
        }
    }

    @Override
    public Cuenta cancelar(Cuenta cuenta) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cuenta aumentarSaldo(int cantidad) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cuenta disminuirSaldo(int cantidad) throws PersistenciaException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
