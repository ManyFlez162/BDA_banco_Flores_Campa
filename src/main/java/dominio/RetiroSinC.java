
package dominio;
/**
 *
 * @author 233215 y 233301
 */

public class RetiroSinC {
    private String folio;
    private int contraseña;
    private int id_transaccion;
    /**
     * Metodo contructor
     * @param folio
     * @param contraseña
     * @param id_transaccion 
     */
    public RetiroSinC(String folio, int contraseña, int id_transaccion) {
        this.folio = folio;
        this.contraseña = contraseña;
        this.id_transaccion = id_transaccion;
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
        return contraseña;
    }
    /**
     * Metodo que establece la contraseña del retiro sin cuenta
     * @param contraseña
     */
    public void setContrasena(int contraseña) {
        this.contraseña = contraseña;
    }
    /**
     * Metodo que obtiene el id de transaccion de retiro sin cuenta 
     * @return 
     */
    public int getId_transaccion() {
        return id_transaccion;
    }
    /**
     * Metodo que establece la transaccion del retiro sin cuenta
     * @param id_transaccion 
     */
    public void setId_transaccion(int id_transaccion) {
        this.id_transaccion = id_transaccion;
    }
    /**
     * Metodo que retorna los atributos de retiro sin cuenta
     * @return 
     */
    @Override
    public String toString() {
        return "RetiroSinC{" + "folio=" + folio + ", contrase\u00f1a=" + contraseña + ", id_transaccion=" + id_transaccion + '}';
    }
    
    
}

