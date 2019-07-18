package clases;

public class suelo {
   
    private int intId;
    private double dblUbicacionX;
    private double dblUbicacionY;
    private double dblUbicacionZ;
    private String strUbicacionWP;
    private String strCultivoAnterior;
    private int intMuestra;
    private int intProfundidad;
    private int intNumeroMuestra;
    private int intPendiente;
    private int intRocas;
    private String strEstructura;
    private String strGrado;
    private String strFoliar;
    private String strObservaciones;

    public suelo() {
    }

    public suelo(double dblUbicacionX, double dblUbicacionY, double dblUbicacionZ, String strUbicacionWP, String strCultivoAnterior, int intMuestra, int intProfundidad, int intNumeroMuestra, int intPendiente, int intRocas, String strEstructura, String strGrado, String strFoliar, String strObservaciones) {
        this.dblUbicacionX = dblUbicacionX;
        this.dblUbicacionY = dblUbicacionY;
        this.dblUbicacionZ = dblUbicacionZ;
        this.strUbicacionWP = strUbicacionWP;
        this.strCultivoAnterior = strCultivoAnterior;
        this.intMuestra = intMuestra;
        this.intProfundidad = intProfundidad;
        this.intNumeroMuestra = intNumeroMuestra;
        this.intPendiente = intPendiente;
        this.intRocas = intRocas;
        this.strEstructura = strEstructura;
        this.strGrado = strGrado;
        this.strFoliar = strFoliar;
        this.strObservaciones = strObservaciones;
    }

    public suelo(int intId,double dblUbicacionX, double dblUbicacionY, double dblUbicacionZ, String strUbicacionWP, String strCultivoAnterior, int intMuestra, int intProfundidad, int intNumeroMuestra, int intPendiente, int intRocas, String strEstructura, String strGrado, String strFoliar, String strObservaciones) {
        this.intId = intId;
        this.dblUbicacionX = dblUbicacionX;
        this.dblUbicacionY = dblUbicacionY;
        this.dblUbicacionZ = dblUbicacionZ;
        this.strUbicacionWP = strUbicacionWP;
        this.strCultivoAnterior = strCultivoAnterior;
        this.intMuestra = intMuestra;
        this.intProfundidad = intProfundidad;
        this.intNumeroMuestra = intNumeroMuestra;
        this.intPendiente = intPendiente;
        this.intRocas = intRocas;
        this.strEstructura = strEstructura;
        this.strGrado = strGrado;
        this.strFoliar = strFoliar;
        this.strObservaciones = strObservaciones;
    }

    public int getIntId() {
        return intId;
    }

    public void setIntId(int intId) {
        this.intId = intId;
    }

    public double getDblUbicacionX() {
        return dblUbicacionX;
    }

    public void setDblUbicacionX(double dblUbicacionX) {
        this.dblUbicacionX = dblUbicacionX;
    }

    public double getDblUbicacionY() {
        return dblUbicacionY;
    }

    public void setDblUbicacionY(double dblUbicacionY) {
        this.dblUbicacionY = dblUbicacionY;
    }

    public double getDblUbicacionZ() {
        return dblUbicacionZ;
    }

    public void setDblUbicacionZ(double dblUbicacionZ) {
        this.dblUbicacionZ = dblUbicacionZ;
    }

    public String getStrUbicacionWP() {
        return strUbicacionWP;
    }

    public void setStrUbicacionWP(String strUbicacionWP) {
        this.strUbicacionWP = strUbicacionWP;
    }

 

    public String getStrCultivoAnterior() {
        return strCultivoAnterior;
    }

    public void setStrCultivoAnterior(String strCultivoAnterior) {
        this.strCultivoAnterior = strCultivoAnterior;
    }

    public int getIntMuestra() {
        return intMuestra;
    }

    public void setIntMuestra(int intMuestra) {
        this.intMuestra = intMuestra;
    }

    public int getIntProfundidad() {
        return intProfundidad;
    }

    public void setIntProfundidad(int intProfundidad) {
        this.intProfundidad = intProfundidad;
    }

    public int getIntNumeroMuestra() {
        return intNumeroMuestra;
    }

    public void setIntNumeroMuestra(int intNumeroMuestra) {
        this.intNumeroMuestra = intNumeroMuestra;
    }

    public int getIntPendiente() {
        return intPendiente;
    }

    public void setIntPendiente(int intPendiente) {
        this.intPendiente = intPendiente;
    }

    public int getIntRocas() {
        return intRocas;
    }

    public void setIntRocas(int intRocas) {
        this.intRocas = intRocas;
    }

    public String getStrEstructura() {
        return strEstructura;
    }

    public void setStrEstructura(String strEstructura) {
        this.strEstructura = strEstructura;
    }

    public String getStrGrado() {
        return strGrado;
    }

    public void setStrGrado(String strGrado) {
        this.strGrado = strGrado;
    }

    public String getStrFoliar() {
        return strFoliar;
    }

    public void setStrFoliar(String strFoliar) {
        this.strFoliar = strFoliar;
    }

  

    public String getStrObservaciones() {
        return strObservaciones;
    }

    public void setStrObservaciones(String strObservaciones) {
        this.strObservaciones = strObservaciones;
    }


   
}