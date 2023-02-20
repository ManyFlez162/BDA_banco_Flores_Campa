/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;


import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

/**
 *
 * @author 233215 y 233301
 */
public class Cliente {
    private Integer id;
    private String nombres;
    private String apellido_Paterno;
    private String apellido_Materno;
    private int edad;
    private String fecha_Nacimiento;
    private String calle;
    private String colonia;
    private String numero;

    /**Metodo contructor por omision
     * 
     */
    public Cliente() {
    }

    public Cliente(Integer id, String nombres, String apellido_Paterno, String apellido_Materno, 
            int edad, String fecha_Nacimiento, String calle, String colonia, String numero) {
        this.id = id;
        this.nombres = nombres;
        this.apellido_Paterno = apellido_Paterno;
        this.apellido_Materno = apellido_Materno;
        this.edad = edad;
        this.fecha_Nacimiento = fecha_Nacimiento;
        this.calle = calle;
        this.colonia = colonia;
        this.numero = numero;
    }
    
    /** Metodo para obtener el ID del cliente
     * @return id
     */
    public Integer getId() {
        return id;
    }
    
    /**
     * Metodo para estable el ID del cliente
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    /**
     * Metodo para obtener los nombres del cliente
     * @return  nombres
     */
    public String getNombres() {
        return nombres;
    }
    
    /** Metodo que establece los nobres del cliente
     * @param nombres 
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    /**
     * Metodo para obtener el apellido paterno del cliente
     * @return apellido_Paterno
     */
    public String getApellido_Paterno() {
        return apellido_Paterno;
    }
    
    /**
     * Metodo que establece el apellido paterno del cliente
     * @param apellido_Paterno 
     */
    public void setApellido_Paterno(String apellido_Paterno) {
        this.apellido_Paterno = apellido_Paterno;
    }
    
    /**
     * Metodo que obtiene el apellido materno del cliente
     * @return apellido_Materno
     */
    public String getApellido_Materno() {
        return apellido_Materno;
    }
    
    /**
     * Metodo que establece el apellido materno del cliente
     * @param apellido_Materno 
     */
    public void setApellido_Materno(String apellido_Materno) {
        this.apellido_Materno = apellido_Materno;
    }
    
    /**
     * Metodo que obtiene la edad del cliente
     * @return edad
     */
    public int getEdad() {
        return edad;
    }
    
    /**
     * Metodo que establece la edad del cliente
     * @param edad 
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /**
     * Metodo que obtiene la fecha de nacimiento del cliente
     * @return fecha_Nacimiento
     */
    public String getFecha_Nacimiento() {
        return fecha_Nacimiento;
    }
    
    /**
     * Metodo que establece la fecha de nacimiento del cliente
     * @param fecha_Nacimiento 
     */
    public void setFecha_Nacimiento(String fecha_Nacimiento) {
        this.fecha_Nacimiento = fecha_Nacimiento;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombres=" + nombres + ", apellido_Paterno=" + apellido_Paterno + ", apellido_Materno=" + apellido_Materno + ", edad=" + edad + ", fecha_Nacimiento=" + fecha_Nacimiento + ", calle=" + calle + ", colonia=" + colonia + ", numero=" + numero + '}';
    }
    
    

   
}
