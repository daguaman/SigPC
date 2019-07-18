package Clases;

public class Labores {
    
    private String strMes;
    private String strDetalle_labor;
    private int intIdPar;
    private int intId;

    public Labores() {
    }

    public Labores(int intIdPar) {
        this.intIdPar = intIdPar;
    }
    

    public Labores( String strDetalle_labor,String strMes, int intIdPar) {
        this.strMes = strMes;
        this.strDetalle_labor = strDetalle_labor;
        this.intIdPar = intIdPar;
    }

    public String getStrMes() {
        return strMes;
    }

    public void setStrMes(String strLabor) {
        this.strMes = strLabor;
    }

    public String getStrDetalle_labor() {
        return strDetalle_labor;
    }

    public void setStrDetalle_labor(String strDetalle_labor) {
        this.strDetalle_labor = strDetalle_labor;
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
