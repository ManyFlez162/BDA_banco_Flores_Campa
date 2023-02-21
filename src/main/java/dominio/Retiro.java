
package dominio;
/**
 *
 * @author 233215 y 233301
 */

public class Retiro {
    private String folio;
    private int contrasenia;
    private int id_retiro;
    private float cantidad;
    private String fechaHoraRetiro;
    private int id_cuenta;

    /**
     * Método constructor sin id ni fecha de retiro
     * @param folio
     * @param contrasenia
     * @param cantidad
     * @param id_cuenta 
     */
    public Retiro(String folio, int contrasenia, float cantidad, int id_cuenta) {
        this.folio = folio;
        this.contrasenia = contrasenia;
        this.cantidad = cantidad;
        this.id_cuenta = id_cuenta;
    }

    /**
     * Método constructor sin folio ni contraseña
     * @param id_retiro
     * @param cantidad
     * @param fechaHoraRetiro
     * @param id_cuenta 
     */
    public Retiro(int id_retiro, float cantidad, String fechaHoraRetiro, int id_cuenta) {
        this.id_retiro = id_retiro;
        this.cantidad = cantidad;
        this.fechaHoraRetiro = fechaHoraRetiro;
        this.id_cuenta = id_cuenta;
    }
    
    /**
     * Método constructor
     * @param folio
     * @param contrasenia
     * @param id_retiro
     * @param cantidad
     * @param fechaHoraRetiro
     * @param id_cuenta 
     */
    public Retiro(String folio, int contrasenia, int id_retiro, int cantidad, String fechaHoraRetiro, int id_cuenta) {
        this.folio = folio;
        this.contrasenia = contrasenia;
        this.id_retiro = id_retiro;
        this.cantidad = cantidad;
        this.fechaHoraRetiro = fechaHoraRetiro;
        this.id_cuenta = id_cuenta;
    } 
    /**
     * Metodo que obtiene el folio de retiro sin cuenta 
     * @return 
     */
    public String getFolio() {
        return folio;
    }
    /**
     * Metodo que establece el folio del retiro sin cuenta
     * @param folio 
     */
    public void setFolio(String folio) {
        this.folio = folio;
    }
    /**
     * Metodo que obtiene la contraseña de retiro sin cuenta 
     * @return 
     */
    public int getContraseña() {
        return contrasenia;
    }
    /**
     * Metodo que establece la contraseña del retiro sin cuenta
     * @param contrasenia
     */
    public void setContrasena(int contrasenia) {
        this.contrasenia = contrasenia;
    }
    /**
     * Metodo que obtiene el id de transaccion de retiro sin cuenta 
     * @return 
     */
    public int getId_transaccion() {
        return id_retiro;
    }
    /**
     * Metodo que establece la transaccion del retiro sin cuenta
     * @param id_transaccion 
     */
    public void setId_transaccion(int id_transaccion) {
        this.id_retiro = id_transaccion;
    }

    /**
     * Metodo que te devuelve la contrasenia
     * @return 
     */
    public int getContrasenia() {
        return contrasenia;
    }

    /**
     * Método que establece la contrasenia
     * @param contrasenia 
     */
    public void setContrasenia(int contrasenia) {
        this.contrasenia = contrasenia;
    }

    /**
     * Método que devuelve el monto
     * @return 
     */
    public float getCantidad() {
        return cantidad;
    }

    /**
     * Método que establece el monto
     * @param cantidad 
     */
    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaHoraRetirno() {
        return fechaHoraRetiro;
    }

    public void setFechaHoraRetirno(String fechaHoraRetiro) {
        this.fechaHoraRetiro = fechaHoraRetiro;
    }

    public int getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(int id_cuenta) {
        this.id_cuenta = id_cuenta;
    }
    
    /**
     * Metodo que retorna los atributos de retiro sin cuenta
     * @return 
     */
    @Override
    public String toString() {
        return "RetiroSinC{" + "folio=" + folio + ", contrasenia=" + contrasenia + ", id_retiro=" + id_retiro + ", cantidad=" + cantidad + ", fechaHoraRetiro=" + fechaHoraRetiro + ", id_cuenta=" + id_cuenta + '}';
    }
    
    
}

