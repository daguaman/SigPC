package Clases;


public class DetalleClima {
    private int intId;
    private int intIdc;
    private String strMes;

    public DetalleClima() {
    }

    public DetalleClima( int intIdc, String strMes) {
        
        this.intIdc = intIdc;
        this.strMes = strMes;
    }

    public int getIntId() {
        return intId;
    }

    public void setIntId(int intId) {
        this.intId = intId;
    }

    public int getIntIdc() {
        return intIdc;
    }

    public void setIntIdc(int intIdc) {
        this.intIdc = intIdc;
    }

    public String getStrMes() {
        return strMes;
    }

    public void setStrMes(String strMes) {
        this.strMes = strMes;
    }
    
}
