/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package utils;

import implementaciones.ConexionBD;
import interfaces.IConexionBD;
import presentacion.Principal;

/**
 *
 * @author 233215 y 233301
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadenaConexion="jdbc:mysql://localhost/banco";
        IConexionBD generadorConexion = new ConexionBD(cadenaConexion,"root","");
        
        Principal principal = new Principal();
        principal.setVisible(true);
        
        
        
    }
    
}
