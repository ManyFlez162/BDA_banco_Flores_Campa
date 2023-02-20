
package dominio;

/**
 *
 * @author 233215 y
 */
public class Cuenta {
    private int id_cuenta;
    private float saldo;
    private String fecha_apertura;
    private int id_cliente;
    /**
     * Constructor que establece a los objetos de la clase cuenta
     * @param id_cuenta
     * @param saldo
     * @param fecha_apertura
     * @param id_cliente 
     */
    public Cuenta(int id_cuenta, float saldo, String fecha_apertura, int id_cliente) {
        this.id_cuenta = id_cuenta;
        this.saldo = saldo;
        this.fecha_apertura = fecha_apertura;
        this.id_cliente = id_cliente;
    }
   
    public Cuenta(float saldo, String fecha_apertura, int id_cliente) {
        this.saldo = saldo;
        this.fecha_apertura = fecha_apertura;
        this.id_cliente = id_cliente;
    }
    /**
     * Metodo que obtiene el id de cuenta
     * @return 
     */
    public int getId_cuenta() {
        return id_cuenta;
    }
    /**
     * Metodo para establecer el id de cuenta
     * @param id_cuenta 
     */
    public void setId_cuenta(int id_cuenta) {    
        this.id_cuenta = id_cuenta;
    }
    /**
     * Metodo para obtener el saldo de cuenta
     * @return 
     */
    public float getSaldo() {
        return saldo;
    }
    /**
     * Metodo para establecer el saldo de cuenta
     * @param saldo 
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    /**
     * Metodo para obtener la fecha de apertura de cuenta
     * @return 
     */
    public String getFecha_apertura() {
        return fecha_apertura;
    }
    /**
     * Metodo para establecer la fecha de apertura de cuenta
     * @param fecha_apertura 
     */
    public void setFechaApertura(String fecha_apertura) {
        this.fecha_apertura = fecha_apertura;
    }
    /**
     * Metodo para obtener el id de cliente en cuenta
     * @return 
     */
    public int getId_cliente() {
        return id_cliente;
    }
    /**
     * Metodo para establecer el id del cliente en cuenta
     * @param id_cliente 
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    /**
     * Metodo que retorna todos los atributos de cuenta
     * @return 
     */
    @Override
    public String toString() {
        return "Cuenta{" + "id_cuenta=" + id_cuenta + ", saldo=" + saldo + ", fecha_apertura=" + fecha_apertura + ", id_cliente=" + id_cliente + '}';
    }
    
    

    
    
    
}
