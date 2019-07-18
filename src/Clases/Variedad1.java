package Clases;
public class Variedad1 {
    private String strMesFlorece1;
    private String strVariedad1;
    private int intDuracionFloracion1;
    private String strMesfructifica1;
    private int intDuracionFructacion1;
    private String strMesCosecha1;
    private String  strDuracionCosecha1;
    private String strComoCosecha1;
    private String strDiaFloracion1;
    private int intEdadCafetal1;
    private String strColorFlor1;
    private String strColorFruto1;
    private String strCaracteristicas1;
    private String strTamanoCereza1;
    private int intid;
    public int idParcela;
    public int variedad;

    public Variedad1(int variedad,String strMesFlorece1, String strVariedad1, int intDuracionFloracion1, String strMesfructifica1, int intDuracionFructacion1, String strMesCosecha1, String strDuracionCosecha1, String strComoCosecha1, String strDiaFloracion1, int intEdadCafetal1, String strColorFlor1, String strColorFruto1, String strCaracteristicas1, String strTamanoCereza1, int idParcela) {
       this.variedad=variedad;
        this.strMesFlorece1 = strMesFlorece1;
        this.strVariedad1 = strVariedad1;
        this.intDuracionFloracion1 = intDuracionFloracion1;
        this.strMesfructifica1 = strMesfructifica1;
        this.intDuracionFructacion1 = intDuracionFructacion1;
        this.strMesCosecha1 = strMesCosecha1;
        this.strDuracionCosecha1 = strDuracionCosecha1;
        this.strComoCosecha1 = strComoCosecha1;
        this.strDiaFloracion1 = strDiaFloracion1;
        this.intEdadCafetal1 = intEdadCafetal1;
        this.strColorFlor1 = strColorFlor1;
        this.strColorFruto1 = strColorFruto1;
        this.strCaracteristicas1 = strCaracteristicas1;
        this.strTamanoCereza1 = strTamanoCereza1;       
        this.idParcela = idParcela;
    }

    public String getStrDuracionCosecha1() {
        return strDuracionCosecha1;
    }

    public void setStrDuracionCosecha1(String strDuracionCosecha1) {
        this.strDuracionCosecha1 = strDuracionCosecha1;
    }

    public int getVariedad() {
        return variedad;
    }

    public void setVariedad(int variedad) {
        this.variedad = variedad;
    }

    public int getIntid() {
        return intid;
    }

    public void setIntid(int intid) {
        this.intid = intid;
    }

    public int getIdParcela() {
        return idParcela;
    }

    public void setIdParcela(int idParcela) {
        this.idParcela = idParcela;
    }
    

    public Variedad1() {
    }

    public Variedad1(String strMesFlorece1, String strVariedad1, int intDuracionFloracion1, String strMesfructifica1, int intDuracionFructacion1, String strMesCosecha1, String strDuracionCosecha1, String strComoCosecha1, String strDiaFloracion1, int intEdadCafetal1, String strColorFlor1, String strColorFruto1, String strCaracteristicas1, String strTamanoCereza1) {
        this.strMesFlorece1 = strMesFlorece1;
        this.strVariedad1 = strVariedad1;
        this.intDuracionFloracion1 = intDuracionFloracion1;
        this.strMesfructifica1 = strMesfructifica1;
        this.intDuracionFructacion1 = intDuracionFructacion1;
        this.strMesCosecha1 = strMesCosecha1;
        this.strDuracionCosecha1 = strDuracionCosecha1;
        this.strComoCosecha1 = strComoCosecha1;
        this.strDiaFloracion1 = strDiaFloracion1;
        this.intEdadCafetal1 = intEdadCafetal1;
        this.strColorFlor1 = strColorFlor1;
        this.strColorFruto1 = strColorFruto1;
        this.strCaracteristicas1 = strCaracteristicas1;
        this.strTamanoCereza1 = strTamanoCereza1;
    }

    public String getStrMesFlorece1() {
        return strMesFlorece1;
    }

    public void setStrMesFlorece1(String strMesFlorece1) {
        this.strMesFlorece1 = strMesFlorece1;
    }

    public String getStrVariedad1() {
        return strVariedad1;
    }

    public void setStrVariedad1(String strVariedad1) {
        this.strVariedad1 = strVariedad1;
    }
    
    public int getIntDuracionFloracion1() {
        return intDuracionFloracion1;
    }

    public void setIntDuracionFloracion1(int intDuracionFloracion1) {
        this.intDuracionFloracion1 = intDuracionFloracion1;
    }

    public String getStrMesfructifica1() {
        return strMesfructifica1;
    }

    public void setStrMesfructifica1(String strMesfructifica1) {
        this.strMesfructifica1 = strMesfructifica1;
    }

    public int getIntDuracionFructacion1() {
        return intDuracionFructacion1;
    }

    public void setIntDuracionFructacion1(int intDuracionFructacion1) {
        this.intDuracionFructacion1 = intDuracionFructacion1;
    }

    public String getStrMesCosecha1() {
        
        return strMesCosecha1;
    }

    public void setStrMesCosecha1(String strMesCosecha1) {
        this.strMesCosecha1 = strMesCosecha1;
    }

    public String getStrtDuracionCosecha1() {
        return strDuracionCosecha1;
    }

    public void setIntDuracionCosecha1(String strDuracionCosecha1) {
        this.strDuracionCosecha1 = strDuracionCosecha1;
    }

    public String getStrComoCosecha1() 
    {
        return strComoCosecha1;
    }

    public void setStrComoCosecha1(String TCosecha) {
        this.strComoCosecha1=TCosecha;
    }

    public String getStrDiaFloracion1() {
        return strDiaFloracion1;
    }

    public void setStrDiaFloracion1(String strDiaFloracion1) {
        this.strDiaFloracion1 = strDiaFloracion1;
    }

    public int getIntEdadCafetal1() {
        return intEdadCafetal1;
    }

    public void setIntEdadCafetal1(int intEdadCafetal1) {
        this.intEdadCafetal1 = intEdadCafetal1;
    }

    public String getStrColorFlor1() {
        return strColorFlor1;
    }

    public void setStrColorFlor1(String strColorFlor1) {
        this.strColorFlor1 = strColorFlor1;
    }

    public String getStrColorFruto1() {
        return strColorFruto1;
    }

    public void setStrColorFruto1(String strColorFruto1) {
        this.strColorFruto1 = strColorFruto1;
    }

    public String getStrCaracteristicas1() {
        return strCaracteristicas1;
    }

    public void setStrCaracteristicas1(String strCaracteristicas1) {
        this.strCaracteristicas1 = strCaracteristicas1;
    }

    public String getStrTamanoCereza1() 
    {
        return strTamanoCereza1;
    }

    public void setStrTamanoCereza1(String intTamanoCereza1) {
        this.strTamanoCereza1 = intTamanoCereza1;
    }
}   