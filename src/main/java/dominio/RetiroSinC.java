
package dominio;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

/**
 *
 * @author 233215 y 233301
 */

public class RetiroSinC {
    private String folio;
    private int contrasenia;
    private int id_transaccion;
    private float cantidad;
    private String fechaHoraRetirno;
    private int id_cuenta;
    
    /**
     * Metodo contructor
     * @param folio
     * @param contrasenia
     * @param id_transaccion 
     * @param cantidad
     */
    public RetiroSinC(String folio, int contrasenia, int id_transaccion, int cantidad, String fechaHoraRetiro, int id_cuenta) {
        this.folio = folio;
        this.contrasenia = contrasenia;
        this.id_transaccion = id_transaccion;
        this.cantidad = cantidad;
        this.fechaHoraRetirno = fechaHoraRetiro;
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
        return id_transaccion;
    }
    /**
     * Metodo que establece la transaccion del retiro sin cuenta
     * @param id_transaccion 
     */
    public void setId_transaccion(int id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    public int getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(int contrasenia) {
        this.contrasenia = contrasenia;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    public String getFechaHoraRetirno() {
        return fechaHoraRetirno;
    }

    public void setFechaHoraRetirno(String fechaHoraRetirno) {
        this.fechaHoraRetirno = fechaHoraRetirno;
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
    
    public String toString() {
        return "RetiroSinC{" + "folio=" + folio + ", contrasenia=" + contrasenia + ", id_transaccion=" + id_transaccion + ", cantidad=" + cantidad + ", fechaHoraRetirno=" + fechaHoraRetirno + ", id_cuenta=" + id_cuenta + '}';
    }
    
    
}

