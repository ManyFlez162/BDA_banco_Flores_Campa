/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import interfaces.IClientesDAO;
import excepciones.PersistenciaException;
import dominio.Cliente;
import interfaces.IConexionBD;
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
public class ClientesDAO implements IClientesDAO{
    
    private static final Logger LOG = Logger.getLogger(ClientesDAO.class.getName());
    
    private final IConexionBD generadorConexiones;

    public ClientesDAO(IConexionBD generadorConexion) {
        this.generadorConexiones = generadorConexion;
    }
    
    @Override
    public Cliente registrar(Cliente cliente) throws PersistenciaException{
        String codigoSQL = "call inserta_cliente (?,?,?,?,?,?,?)";
        
        try (Connection conexion = generadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL, Statement.RETURN_GENERATED_KEYS);){
            
            comando.setString(1, cliente.getNombres());
            comando.setString(2, cliente.getApellido_Paterno());
            comando.setString(3, cliente.getApellido_Materno());
            comando.setString(4, cliente.getFecha_Nacimiento());
            comando.setString(5, cliente.getCalle());
            comando.setString(6, cliente.getColonia());
            comando.setString(7, cliente.getNumero());
            
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
    public Cliente actualizar(Cliente cliente) throws PersistenciaException{
        try{
            Connection conexion = generadorConexiones.crearConexion();
            Statement comandoSql = conexion.createStatement();
            String codigoSQL = String.format("call actualiza_cliente "
                    + "(%d,'%s','%s','%s','%s',%d,'%s','%s','%s');", 
                    cliente.getId(),
                    cliente.getNombres(),
                    cliente.getApellido_Paterno(),
                    cliente.getApellido_Materno(),
                    cliente.getFecha_Nacimiento(),
                    cliente.getEdad(),
                    cliente.getCalle(),
                    cliente.getColonia(),
                    cliente.getNumero());
            
            int numeroRegistrosAfectados = comandoSql.executeUpdate(codigoSQL);
            conexion.close();

            if(numeroRegistrosAfectados == 1){
                return cliente;
            }else{
                return null;
            }
        }catch (SQLException e){
            LOG.log(Level.SEVERE, e.getMessage());
            throw new PersistenciaException("No fue posible actualizar al cliente");
        }
    }

    @Override
    public Cliente consultar(Integer idCliente) {
        String codigoSQL = "select * from clientes where id_cliente= ?";
        
        try(Connection conexion = generadorConexiones.crearConexion();
            PreparedStatement comando= conexion.prepareStatement(codigoSQL);){
            
            comando.setInt(1, idCliente);
            ResultSet registro=  comando.executeQuery();
            // Se encontró el cliente..
            Cliente cliente = null;
            if(registro.next()){ 
                Integer id = registro.getInt("id_cliente");
                String nombres=registro.getString("nombres");
                String apellidoP=registro.getString("apellido_paterno");
                String apellidoM=registro.getString("apellido_materno");
                String fechaNacimiento=registro.getString("fecha_nacimiento");
                int edad = registro.getInt("edad");
                String calle = registro.getString("calle");
                String colonia = registro.getString("colonia");
                String numero = registro.getString("numero");
                cliente=new Cliente(id,nombres,apellidoP,apellidoM,fechaNacimiento,edad,calle,colonia,numero);
            }
            
            return cliente;
        } catch(SQLException e){
            LOG.log(Level.SEVERE, e.getMessage());
            return null;
        }
    }
    
    
    
    
}
