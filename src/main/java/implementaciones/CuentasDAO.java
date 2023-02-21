/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import dominio.Cliente;
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
        String codigoSQL = "insert into cuentas (saldo,id_cliente) values (?, ?);";
        
        try (Connection conexion = generadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL, Statement.RETURN_GENERATED_KEYS);){
            
            comando.setFloat(1, cuenta.getSaldo());
            comando.setInt(2, cuenta.getId_cliente());
            
            comando.executeUpdate();
            
            ResultSet llavesGeneradas = comando.getGeneratedKeys();
            if(llavesGeneradas.next()){
                int posicionLlavePrimaria = 1;
                Integer llavePrimaria = llavesGeneradas.getInt(posicionLlavePrimaria);
                //cuenta.setId_cuenta(llavePrimaria);
                cuenta = this.consultar(llavePrimaria);
                return cuenta;
            }
            
            throw new PersistenciaException("Cuenta registrada, pero id no generado");
            
        } catch(SQLException e){
            LOG.log(Level.SEVERE, e.getMessage());
            throw new PersistenciaException("No fue posible registrar la cuenta");
        }
    }

    @Override
    public Cuenta cancelar(int idCuenta) throws PersistenciaException {
        try{
            Connection conexion = generadorConexiones.crearConexion();
            Statement comandoSql = conexion.createStatement();
            String codigoSQL = String.format("update cuentas set saldo = 0 where id_cuenta=%d;",
            idCuenta);
            
            int numeroRegistrosAfectados = comandoSql.executeUpdate(codigoSQL);
            conexion.close();

            Cuenta cuenta;
            if(numeroRegistrosAfectados == 1){
                cuenta=this.consultar(idCuenta);
                return cuenta;
            }else{
                return null;
            }
        }catch (SQLException e){
            LOG.log(Level.SEVERE, e.getMessage());
            throw new PersistenciaException("No fue posible cancelar la cuenta");
        }
    }

    @Override
    public Cuenta aumentarSaldo(float cantidad, int idCuenta) throws PersistenciaException {
        try{
            Connection conexion = generadorConexiones.crearConexion();
            Statement comandoSql = conexion.createStatement();
            String codigoSQL = String.format("update cuentas set saldo = saldo + %f where id_cuenta=%d;",
            cantidad,idCuenta);
            
            int numeroRegistrosAfectados = comandoSql.executeUpdate(codigoSQL);
            conexion.close();

            Cuenta cuenta;
            if(numeroRegistrosAfectados == 1){
                cuenta=this.consultar(idCuenta);
                return cuenta;
            }else{
                return null;
            }
        }catch (SQLException e){
            LOG.log(Level.SEVERE, e.getMessage());
            throw new PersistenciaException("No fue posible sumar dinero a la cuenta");
        }
    }

    @Override
    public Cuenta disminuirSaldo(float cantidad, int idCuenta) throws PersistenciaException {
        try{
            Connection conexion = generadorConexiones.crearConexion();
            Statement comandoSql = conexion.createStatement();
            String codigoSQL = String.format("update cuentas set saldo = saldo - %f where id_cuenta=%d;",
            cantidad,idCuenta);
            
            Cuenta cuenta=this.consultar(idCuenta);
            cuenta=this.consultar(idCuenta);
            
            if(cantidad>cuenta.getSaldo()){
                System.out.println("No quedará suficiente dinero en la cuenta");
            } else{
                int numeroRegistrosAfectados = comandoSql.executeUpdate(codigoSQL);
                conexion.close();

                if(numeroRegistrosAfectados == 1){
                    cuenta=this.consultar(idCuenta);
                    return cuenta;
                }else{
                    return null;
                }
            }
            
            return null;
            
        }catch (SQLException e){
            LOG.log(Level.SEVERE, e.getMessage());
            throw new PersistenciaException("No fue posible quitar dinero a la cuenta");
        }
    }

    @Override
    public Cuenta consultar(int idCuenta) {
        String codigoSQL = "select * from cuentas where id_cuenta= ?";
        
        try(Connection conexion = generadorConexiones.crearConexion();
            PreparedStatement comando= conexion.prepareStatement(codigoSQL);){
            
            comando.setInt(1, idCuenta);
            ResultSet registro=  comando.executeQuery();
            
            Cuenta cuenta = null;
            if(registro.next()){ 
                int id = registro.getInt("id_cuenta");
                float saldo = registro.getFloat("saldo");
                String fechaApertura = registro.getString("fecha_apertura");
                int idCliente = registro.getInt("id_cliente");
                
                cuenta=new Cuenta(id,saldo,fechaApertura,idCliente);
            }
            
            return cuenta;
        } catch(SQLException e){
            LOG.log(Level.SEVERE, e.getMessage());
            return null;
        }
    }
    
    
    
}
