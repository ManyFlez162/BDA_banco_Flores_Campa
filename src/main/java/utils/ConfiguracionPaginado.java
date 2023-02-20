
package utils;
/**
 * @author Aracely Campa Quintana   id: 233215
 */
public class ConfiguracionPaginado {
    private int pagina;//Numero de pagina
    private int conteo;//Elementos por pagina
    
     

    public ConfiguracionPaginado(int pagina, int conteo) {
        this.pagina = 0;
        this.conteo = 5;
    }
   
    public int getPagina() {
        return pagina;
    }

    public void setPagina(int pagina) {
        this.pagina = pagina;
    }

    public int getConteo() {
        return conteo;
    }

    public void setConteo(int conteo) {
        this.conteo = conteo;
    }
    public int getElementosASaltar(){
        return this.pagina+this.conteo;
    }
    public void avanzarPagina(){
        this.pagina++;
    }
    public void retrocederPagina(){
       if(this.pagina>0){
        this.pagina--;
    }
}
}
