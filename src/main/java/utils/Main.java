/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utils;

import dominio.Cliente;
import dominio.Cuenta;
import excepciones.PersistenciaException;
import implementaciones.ClientesDAO;
import implementaciones.ConexionBD;
import implementaciones.CuentasDAO;
import interfaces.IClientesDAO;
import interfaces.IConexionBD;
import interfaces.ICuentasDAO;

/**
 *
 * @author yarvi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadenaConexion="jdbc:mysql://localhost/banco_prueba";
        IConexionBD generadorConexion = new ConexionBD(cadenaConexion,"root","");
        
        IClientesDAO clientesDAO = new ClientesDAO(generadorConexion);
        Cliente cliente = new Cliente("Manuel","Flores","Velazquez","2003-02-16","Aguamarina","Valle Verder","1927");
        
//        try{
//        System.out.println(clientesDAO.registrar(cliente));
//        } catch(PersistenciaException e){
//            e.getMessage();
//        }
//        
//        cliente = new Cliente(4,"Juanito","Chavez","Shi","2010-01-20",13,"callesita","colonita","numerito");
//        try{
//            System.out.println(clientesDAO.actualizar(cliente));
//        } catch(PersistenciaException e){
//            e.getMessage();
//        }
        

        ICuentasDAO cuentasDAO = new CuentasDAO(generadorConexion);
        Cuenta cuenta = new Cuenta(1000,1);
        
//        try{
//            System.out.println(cuentasDAO.crearCuenta(cuenta));
//        } catch(PersistenciaException e){
//            e.getMessage();
//        }
        
        try{
            System.out.println(cuentasDAO.aumentarSaldo(500, 5));
        } catch(PersistenciaException e){
            e.getMessage();
        }
        
        
        
    }
    
}
