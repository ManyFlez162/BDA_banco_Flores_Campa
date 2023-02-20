
package dominio;
/**
 *
 * @author 233215 y 
 */
public class Transaccion {
    private int id;
    private String fecha;
    private enum tipo{Retirosintarjeta, Transferencia};
    private boolean cantidad;
    private int id_cuenta;
    
    /**
     * Contrsuctor que inicializa los atributos
     * @param id
     * @param fecha
     * @param cantidad
     * @param id_cuenta 
     */
    public Transaccion(int id, String fecha, boolean cantidad, int id_cuenta) {
        this.id = id;
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.id_cuenta = id_cuenta;
    }
    /**
     * Metodo que obtiene el id de transaccion 
     * @return 
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    /**
     * Metodo que obtiene la fecha de transaccion 
     * @return 
     */
    public String getFecha() {
        return fecha;
    }
    /**
     * Metodo para establecer la fecha de transaccion
     * @param fecha 
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    /**
     * Metodo que obtiene la cantidad de transaccion 
     * @return 
     */
    public boolean isCantidad() {
        return cantidad;
    }
    /**
     * Metodo para establecer la cantidad de transacaccion
     * @param cantidad 
     */
    public void setCantidad(boolean cantidad) {
        this.cantidad = cantidad;
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

   
}