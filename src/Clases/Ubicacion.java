package Clases;


public class Ubicacion {
    
    private double dblUbicacionX;
    private double dblUbicaciony;
    private double dblUbicacionz;
    private String strUbicacionwp;
    private String strAsociacion1;
    private String strAsociacion2;
    private String strAsociacion3;
    private String strAsociacion4;
    private String strAsociacion5;
    private String strDensidad1;
    private String strDensidad2;
    private String strDensidad3;
    private String strDensidad4;
    private String strDensidad5;
    private String strPorque1;
    private String strPorque2;
    private String strPorque3;
    private String strPorque4;
    private String strPorque5;
    private int idParcel;

    public Ubicacion() {
    }

    public Ubicacion(double dblUbicacionX, double dblUbicaciony, double dblUbicacionz, String strUbicacionwp, String strAsociacion1, String strAsociacion2, String strAsociacion3, String strAsociacion4, String strAsociacion5, String strDensidad1, String strDensidad2, String strDensidad3, String strDensidad4, String strDensidad5, String strPorque1, String strPorque2, String strPorque3, String strPorque4, String strPorque5) {
        this.dblUbicacionX = dblUbicacionX;
        this.dblUbicaciony = dblUbicaciony;
        this.dblUbicacionz = dblUbicacionz;
        this.strUbicacionwp = strUbicacionwp;
        this.strAsociacion1 = strAsociacion1;
        this.strAsociacion2 = strAsociacion2;
        this.strAsociacion3 = strAsociacion3;
        this.strAsociacion4 = strAsociacion4;
        this.strAsociacion5 = strAsociacion5;
        this.strDensidad1 = strDensidad1;
        this.strDensidad2 = strDensidad2;
        this.strDensidad3 = strDensidad3;
        this.strDensidad4 = strDensidad4;
        this.strDensidad5 = strDensidad5;
        this.strPorque1 = strPorque1;
        this.strPorque2 = strPorque2;
        this.strPorque3 = strPorque3;
        this.strPorque4 = strPorque4;
        this.strPorque5 = strPorque5;
    }

    public Ubicacion(double dblUbicacionX, double dblUbicaciony, double dblUbicacionz, String strUbicacionwp, String strAsociacion1, String strAsociacion2, String strAsociacion3, String strAsociacion4, String strAsociacion5, String strDensidad1, String strDensidad2, String strDensidad3, String strDensidad4, String strDensidad5, String strPorque1, String strPorque2, String strPorque3, String strPorque4, String strPorque5, int idParcel) {
        this.dblUbicacionX = dblUbicacionX;
        this.dblUbicaciony = dblUbicaciony;
        this.dblUbicacionz = dblUbicacionz;
        this.strUbicacionwp = strUbicacionwp;
        this.strAsociacion1 = strAsociacion1;
        this.strAsociacion2 = strAsociacion2;
        this.strAsociacion3 = strAsociacion3;
        this.strAsociacion4 = strAsociacion4;
        this.strAsociacion5 = strAsociacion5;
        this.strDensidad1 = strDensidad1;
        this.strDensidad2 = strDensidad2;
        this.strDensidad3 = strDensidad3;
        this.strDensidad4 = strDensidad4;
        this.strDensidad5 = strDensidad5;
        this.strPorque1 = strPorque1;
        this.strPorque2 = strPorque2;
        this.strPorque3 = strPorque3;
        this.strPorque4 = strPorque4;
        this.strPorque5 = strPorque5;
        this.idParcel = idParcel;
    }

    public int getIdParcel() {
        return idParcel;
    }

    public void setIdParcel(int idParcel) {
        this.idParcel = idParcel;
    }
    
    

    public double getDblUbicacionX() {
        return dblUbicacionX;
    }

    public void setDblUbicacionX(double dblUbicacionX) {
        this.dblUbicacionX = dblUbicacionX;
    }

    public double getDblUbicaciony() {
        return dblUbicaciony;
    }

    public void setDblUbicaciony(double dblUbicaciony) {
        this.dblUbicaciony = dblUbicaciony;
    }

    public double getDblUbicacionz() {
        return dblUbicacionz;
    }

    public void setDblUbicacionz(double dblUbicacionz) {
        this.dblUbicacionz = dblUbicacionz;
    }

    public String getStrUbicacionwp() {
        return strUbicacionwp;
    }

    public void setStrUbicacionwp(String strUbicacionwp) {
        this.strUbicacionwp = strUbicacionwp;
    }

   

    public String getStrAsociacion1() {
        return strAsociacion1;
    }

    public void setStrAsociacion1(String strAsociacion1) {
        this.strAsociacion1 = strAsociacion1;
    }

    public String getStrAsociacion2() {
        return strAsociacion2;
    }

    public void setStrAsociacion2(String strAsociacion2) {
        this.strAsociacion2 = strAsociacion2;
    }

    public String getStrAsociacion3() {
        return strAsociacion3;
    }

    public void setStrAsociacion3(String strAsociacion3) {
        this.strAsociacion3 = strAsociacion3;
    }

    public String getStrAsociacion4() {
        return strAsociacion4;
    }

    public void setStrAsociacion4(String strAsociacion4) {
        this.strAsociacion4 = strAsociacion4;
    }

    public String getStrAsociacion5() {
        return strAsociacion5;
    }

    public void setStrAsociacion5(String strAsociacion5) {
        this.strAsociacion5 = strAsociacion5;
    }

    public String getStrDensidad1() {
        return strDensidad1;
    }

    public void setStrDensidad1(String strDensidad1) {
        this.strDensidad1 = strDensidad1;
    }

    public String getStrDensidad2() {
        return strDensidad2;
    }

    public void setStrDensidad2(String strDensidad2) {
        this.strDensidad2 = strDensidad2;
    }

    public String getStrDensidad3() {
        return strDensidad3;
    }

    public void setStrDensidad3(String strDensidad3) {
        this.strDensidad3 = strDensidad3;
    }

    public String getStrDensidad4() {
        return strDensidad4;
    }

    public void setStrDensidad4(String strDensidad4) {
        this.strDensidad4 = strDensidad4;
    }

    public String getStrDensidad5() {
        return strDensidad5;
    }

    public void setStrDensidad5(String strDensidad5) {
        this.strDensidad5 = strDensidad5;
    }

    public String getStrPorque1() {
        return strPorque1;
    }

    public void setStrPorque1(String strPorque1) {
        this.strPorque1 = strPorque1;
    }

    public String getStrPorque2() {
        return strPorque2;
    }

    public void setStrPorque2(String strPorque2) {
        this.strPorque2 = strPorque2;
    }

    public String getStrPorque3() {
        return strPorque3;
    }

    public void setStrPorque3(String strPorque3) {
        this.strPorque3 = strPorque3;
    }

    public String getStrPorque4() {
        return strPorque4;
    }

    public void setStrPorque4(String strPorque4) {
        this.strPorque4 = strPorque4;
    }

    public String getStrPorque5() {
        return strPorque5;
    }

    public void setStrPorque5(String strPorque5) {
        this.strPorque5 = strPorque5;
    }
    
    
}
