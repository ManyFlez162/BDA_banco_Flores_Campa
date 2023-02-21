/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utils;

import dominio.Cliente;
import excepciones.PersistenciaException;
import implementaciones.ClientesDAO;
import implementaciones.ConexionBD;
import interfaces.IClientesDAO;
import interfaces.IConexionBD;

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
        
        try{
        System.out.println(clientesDAO.registrar(cliente));
        } catch(PersistenciaException e){
            e.getMessage();
        }
        
        cliente = new Cliente(3,"Juanito","Chavez","Shi","2010-01-20",13,"callesita","colonita","numerito");
        try{
            System.out.println(clientesDAO.actualizar(cliente));
        } catch(PersistenciaException e){
            e.getMessage();
        }
        
    }
    
}
