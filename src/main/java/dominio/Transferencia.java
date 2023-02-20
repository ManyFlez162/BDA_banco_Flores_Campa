
package dominio;

/**
 *
 * @author 233215 y 233301
 */
public class Transferencia {
    private int cuentaEmisora;
    private int cuentaReceptora;
    private int id_transaccion;
    
    public Transferencia(int cuentaEmisora, int cuentaReceptora, int id_transaccion) {
        this.cuentaEmisora = cuentaEmisora;
        this.cuentaReceptora = cuentaReceptora;
        this.id_transaccion = id_transaccion;
    }
    /**
     * Metodo para obtener la cuenta emisiora en transferencia
     * @return 
     */
    public int getCuentaEmisora() {
        return cuentaEmisora;
    }
    /** 
     * Metodo para establecer la cuenta emisora en transferencia
     * @param cuentaEmisora 
     */
    public void setCuentaEmisora(int cuentaEmisora) {
        this.cuentaEmisora = cuentaEmisora;
    }
    /**
     * Metodo para obtener la cuenta receptora en transferencia
     * @return 
     */
    public int getCuentaReceptora() {
        return cuentaReceptora;
    }
    /**
     * Metodo para establecer la cuenta receptora en transferencia
     * @param cuentaReceptora 
     */
    public void setCuentaReceptora(int cuentaReceptora) {
        this.cuentaReceptora = cuentaReceptora;
    }
    /**
     * Metodo para obtener el id de transaccion en transferencia
     * @return 
     */
    public int getId_transaccion() {
        return id_transaccion;
    }
    /**
     * Metodo para establecer el id en transferencia
     * @param id_transaccion 
     */
    public void setId_transaccion(int id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    


}
