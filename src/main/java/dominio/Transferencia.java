
package dominio;

/**
 *
 * @author 233215 y 233301
 */
public class Transferencia {
    private int idTransferencia;
    private int idCuentaEmisora;
    private int idCuentaReceptora;
    private String fechaHoraTransaccion;
    private float cantidad;

    public Transferencia(int idTransferencia, int idCuentaEmisora, int idCuentaReceptora, String fechaHoraTransaccion, float cantidad) {
        this.idTransferencia = idTransferencia;
        this.idCuentaEmisora = idCuentaEmisora;
        this.idCuentaReceptora = idCuentaReceptora;
        this.fechaHoraTransaccion = fechaHoraTransaccion;
        this.cantidad = cantidad;
    }

    public Transferencia(int idCuentaEmisora, int idCuentaReceptora, float cantidad) {
        this.idCuentaEmisora = idCuentaEmisora;
        this.idCuentaReceptora = idCuentaReceptora;
        this.cantidad = cantidad;
    }

    public int getIdTransferencia() {
        return idTransferencia;
    }

    public void setIdTransferencia(int idTransferencia) {
        this.idTransferencia = idTransferencia;
    }

    public int getIdCuentaEmisora() {
        return idCuentaEmisora;
    }

    public void setIdCuentaEmisora(int idCuentaEmisora) {
        this.idCuentaEmisora = idCuentaEmisora;
    }

    public int getIdCuentaReceptora() {
        return idCuentaReceptora;
    }

    public void setIdCuentaReceptora(int idCuentaReceptora) {
        this.idCuentaReceptora = idCuentaReceptora;
    }

    public String getFechaHoraTransaccion() {
        return fechaHoraTransaccion;
    }

    public void setFechaHoraTransaccion(String fechaHoraTransaccion) {
        this.fechaHoraTransaccion = fechaHoraTransaccion;
    }

    public float getCantidad() {
        return cantidad;
    }

    public void setCantidad(float cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Transferencia{" + "idTransferencia=" + idTransferencia + ", idCuentaEmisora=" + idCuentaEmisora + ", idCuentaReceptora=" + idCuentaReceptora + ", fechaHoraTransaccion=" + fechaHoraTransaccion + ", cantidad=" + cantidad + '}';
    }
    
}
