/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import dominio.Cliente;
import dominio.Transferencia;
import excepciones.PersistenciaException;
import interfaces.IConexionBD;
import interfaces.ITransferenciasDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import utils.ConfiguracionPaginado;

/**
 *
 * @author 233215 y 233301
 */
public class TransferenciasDAO implements ITransferenciasDAO{

    private static final Logger LOG = Logger.getLogger(TransferenciasDAO.class.getName());
    
    private final IConexionBD generadorConexiones;

    public TransferenciasDAO(IConexionBD generadorConexiones) {
        this.generadorConexiones = generadorConexiones;
    }
    
    @Override
    public Transferencia transferir(Transferencia transferencia) throws PersistenciaException {
        String codigoSQL = "insert into transferencias (cantidad, id_cuenta_origen, id_cuenta_destino)"
                + "values (?, ?, ?)";
        
        try (Connection conexion = generadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL, Statement.RETURN_GENERATED_KEYS);){
            
            comando.setFloat(1, transferencia.getCantidad());
            comando.setInt(2, transferencia.getIdCuentaEmisora());
            comando.setInt(3, transferencia.getIdCuentaReceptora());
            
            comando.executeUpdate();
            
            ResultSet llavesGeneradas = comando.getGeneratedKeys();
            if(llavesGeneradas.next()){
                int posicionLlavePrimaria = 1;
                Integer llavePrimaria = llavesGeneradas.getInt(posicionLlavePrimaria);
                
                transferencia = this.consultar(llavePrimaria);
                
                return transferencia;
            }
            
            throw new PersistenciaException("Transferencia registrada, pero id no generado");
            
            
        } catch(SQLException e){
            LOG.log(Level.SEVERE, e.getMessage());
            throw new PersistenciaException("No fue posible hacer la transferencia");
        }
    }

    @Override
    public Transferencia consultar(int idTransferencia) {
        String codigoSQL = "select * from transferencias where id_transferencia = ?";
        
        try(Connection conexion = generadorConexiones.crearConexion();
            PreparedStatement comando= conexion.prepareStatement(codigoSQL);){
            
            comando.setInt(1, idTransferencia);
            
            ResultSet registro=  comando.executeQuery();
            
            Transferencia transferencia = null;
            if(registro.next()){ 
                int id = registro.getInt("id_transferencia");
                String fechaHoraTransferencia = registro.getString("fecha_hora_transferencia");
                float cantidad = registro.getFloat("cantidad");
                int idOrigen = registro.getInt("id_cuenta_origen");
                int idDestino = registro.getInt("id_cuenta_destino");
                
                transferencia=new Transferencia(id,idOrigen,idDestino,fechaHoraTransferencia,cantidad);
            }
            
            return transferencia;
        } catch(SQLException e){
            LOG.log(Level.SEVERE, e.getMessage());
            return null;
        }
    }

    @Override
    public List<Transferencia> consultar(ConfiguracionPaginado configPaginado) throws PersistenciaException{
        String codigoSQL = "select * from transferencias "
                    + "limit ? offset ?";
        List <Transferencia> listaTransferencia = new LinkedList<>();
        try (               
            Connection conexion = generadorConexiones.crearConexion();
            PreparedStatement comando = conexion.prepareStatement(codigoSQL);
        ){
            comando.setInt(1, configPaginado.getElementosPorPagina());
            comando.setInt(2, configPaginado.getElementosASaltar());
            ResultSet resultado = comando.executeQuery();
            while(resultado.next()) {
                int id = resultado.getInt("id_transferencia");
                String fechaHoraTransferencia = resultado.getString("fecha_hora_transferencia");
                float cantidad = resultado.getFloat("cantidad");
                int idOrigen = resultado.getInt("id_cuenta_origen");
                int idDestino = resultado.getInt("id_cuenta_destino");
                
                Transferencia transferencia=new Transferencia(id,idOrigen,idDestino,fechaHoraTransferencia,cantidad);
                
                listaTransferencia.add(transferencia);
            }   
            return listaTransferencia;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            throw new PersistenciaException("No fue posible revisar la transacción");
        }
    }
    
}
