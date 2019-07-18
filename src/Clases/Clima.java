package Clases;

public class Clima {
    private String strMes;
    private String strDetalle_clima;
    private int intIdPar;
    private int intId;

    public Clima() {
    }

    public Clima(String strDetalle_clima,String strMes,  int intIdPar) {
        this.strMes = strMes;
        this.strDetalle_clima = strDetalle_clima;
        this.intIdPar = intIdPar;
    }

    public String getStrMes() {
        return strMes;
    }

    public void setStrMes(String strMes) {
        this.strMes = strMes;
    }

    public String getStrDetalle_clima() {
        return strDetalle_clima;
    }

    public void setStrDetalle_clima(String strDetalle_clima) {
        this.strDetalle_clima = strDetalle_clima;
    }

    public int getIntIdPar() {
        return intIdPar;
    }

    public void setIntIdPar(int intIdPar) {
        this.intIdPar = intIdPar;
    }

    public int getIntId() {
        return intId;
    }

    public void setIntId(int intId) {
        this.intId = intId;
    }

  
    
    
}
