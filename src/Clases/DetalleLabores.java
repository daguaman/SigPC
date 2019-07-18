package Clases;
public class DetalleLabores 
{
    
    private int intId;
    private int intIdl;
    private String strMes;

    public DetalleLabores() {
    }

    public DetalleLabores(int intIdl, String strMes) {
        
        this.intIdl = intIdl;
        this.strMes = strMes;
    }

    public int getIntId() {
        return intId;
    }

    public void setIntId(int intId) {
        this.intId = intId;
    }

    public int getIntIdl() {
        return intIdl;
    }

    public void setIntIdl(int intIdl) {
        this.intIdl = intIdl;
    }

    public String getStrMes() {
        return strMes;
    }

    public void setStrMes(String strMes) {
        this.strMes = strMes;
    }
    
    
}
