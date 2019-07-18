/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author ruben
 */
public class Parcelas1 {

//    private int intIdp;
    private String strSuperficie;
    private int intNumeroPlantas;
    private double dblMarcoPlantacion;
    private String strSemilla;
    private String strProduccionAnual;
    private String strRazonDeSiembra;
    public int idFinca;

    public Parcelas1() {
    }

    public Parcelas1(String strSuperficie, int intNumeroPlantas, double intMarcoPlantacion, String strSemilla, String strProduccionAnual, String strRazonDeSiembra, int idFinca) {
        this.strSuperficie = strSuperficie;
        this.intNumeroPlantas = intNumeroPlantas;
        this.dblMarcoPlantacion = intMarcoPlantacion;
        this.strSemilla = strSemilla;
        this.strProduccionAnual = strProduccionAnual;
        this.strRazonDeSiembra = strRazonDeSiembra;
        this.idFinca = idFinca;
    }

    
    public int getIdFinca() {
        return idFinca;
    }

    /*public int getIntIdp() {
    return intIdp;
    }
    public void setIntIdp(int intIdp) {
    this.intIdp = intIdp;
    }*/
    public void setIdFinca(int idFinca) {    
        this.idFinca = idFinca;
    }

    public String getStrSuperficie() {
        return strSuperficie;
    }

    public void setStrSuperficie(String strSuperficie) {
        this.strSuperficie = strSuperficie;
    }

    public int getIntNumeroPlantas() {
        return intNumeroPlantas;
    }

    public void setIntNumeroPlantas(int intNumeroPlantas) {
        this.intNumeroPlantas = intNumeroPlantas;
    }

    
    public double getIntMarcoPlantacion() {
        return dblMarcoPlantacion;
    }

    public void setIntMarcoPlantacion(int intMarcoPlantacion) {
        this.dblMarcoPlantacion = intMarcoPlantacion;
    }

    public String getStrSemilla() {
        return strSemilla;
    }

    public void setStrSemilla(String strSemilla) {
        this.strSemilla = strSemilla;
    }

    public String getStrProduccionAnual() {
        return strProduccionAnual;
    }

    public void setStrProduccionAnual(String strProduccionAnual) {
        this.strProduccionAnual = strProduccionAnual;
    }

    public String getStrRazonDeSiembra() {
        return strRazonDeSiembra;
    }

    public void setStrRazonDeSiembra(String strRazonDeSiembra) {
        this.strRazonDeSiembra = strRazonDeSiembra;
    }

    
    
}
