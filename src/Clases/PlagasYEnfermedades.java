package CLASES;

/**
 *
 * @author JuanP
 */
public class PlagasYEnfermedades {

    String strTipo;
    String strIncidencia;
    String strNombre;
    String strProducto;
    String strDosis;
    String strFrecuencia;
    String strMes;
    String strVari;
    int intId;

    public PlagasYEnfermedades( String strTipo, String strIncidencia, String strNombre, String strProducto, String strDosis, String strFrecuencia, String strMes, String strVari) {
        this.strTipo = strTipo;
        this.strIncidencia = strIncidencia;
        this.strNombre = strNombre;
        this.strProducto = strProducto;
        this.strDosis = strDosis;
        this.strFrecuencia = strFrecuencia;
        this.strMes = strMes;
        this.strVari = strVari;
    }

    public PlagasYEnfermedades( String strIncidencia, String strProducto, String strDosis, String strFrecuencia, String strMes, String strVari) {
        this.strIncidencia = strIncidencia;
        this.strProducto = strProducto;
        this.strDosis = strDosis;
        this.strFrecuencia = strFrecuencia;
        this.strMes = strMes;
        this.strVari = strVari;
    }

    public PlagasYEnfermedades() {

    }

    public int getIntId() {
        return intId;
    }

    public void setIntId(int intId) {
        this.intId = intId;
    }



    public String getStrTipo() {
        return strTipo;
    }

    public void setStrTipo(String strTipo) {
        this.strTipo = strTipo;
    }

    public String getStrIncidencia() {
        return strIncidencia;
    }

    public void setStrIncidencia(String strIncidencia) {
        this.strIncidencia = strIncidencia;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public String getStrProducto() {
        return strProducto;
    }

    public void setStrProducto(String strProducto) {
        this.strProducto = strProducto;
    }

    public String getStrDosis() {
        return strDosis;
    }

    public void setStrDosis(String strDosis) {
        this.strDosis = strDosis;
    }

    public String getStrFrecuencia() {
        return strFrecuencia;
    }

    public void setStrFrecuencia(String strFrecuencia) {
        this.strFrecuencia = strFrecuencia;
    }

    public String getStrMes() {
        return strMes;
    }

    public void setStrMes(String strMes) {
        this.strMes = strMes;
    }

    public String getStrVari() {
        return strVari;
    }

    public void setStrVari(String strVari) {
        this.strVari = strVari;
    }

}
