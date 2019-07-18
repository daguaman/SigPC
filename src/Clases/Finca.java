/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Dell_5437
 */
public class Finca {
    public int idF;
    public String strNombreFinca;
    public double dblSuperficieT;
    public String strCultivo;
    public double dblSupcultivo;
    public double dblSupCafe;
    public double dblParcela;
    public String strRenueva;
    public String strCausa;
    public int intCosechas;

    public Finca() {
    }

    public Finca(int idF, String strNombreFinca, double dblSuperficieT, String strCultivo, double dblSupcultivo, double dblSupCafe, double dblParcela, String strRenueva, String strCausa, int intCosechas) {
        this.idF = idF;
        this.strNombreFinca = strNombreFinca;
        this.dblSuperficieT = dblSuperficieT;
        this.strCultivo = strCultivo;
        this.dblSupcultivo = dblSupcultivo;
        this.dblSupCafe = dblSupCafe;
        this.dblParcela = dblParcela;
        this.strRenueva = strRenueva;
        this.strCausa = strCausa;
        this.intCosechas = intCosechas;
    }

    public int getIdF() {
        return idF;
    }

    public void setIdF(int idF) {
        this.idF = idF;
    }

    public String getStrNombreFinca() {
        return strNombreFinca;
    }

    public void setStrNombreFinca(String strNombreFinca) {
        this.strNombreFinca = strNombreFinca;
    }

    public double getDblSuperficieT() {
        return dblSuperficieT;
    }

    public void setDblSuperficieT(double dblSuperficieT) {
        this.dblSuperficieT = dblSuperficieT;
    }

    public String getStrCultivo() {
        return strCultivo;
    }

    public void setStrCultivo(String strCultivo) {
        this.strCultivo = strCultivo;
    }

    public double getDblSupcultivo() {
        return dblSupcultivo;
    }

    public void setDblSupcultivo(double dblSupcultivo) {
        this.dblSupcultivo = dblSupcultivo;
    }

    public double getDblSupCafe() {
        return dblSupCafe;
    }

    public void setDblSupCafe(double dblSupCafe) {
        this.dblSupCafe = dblSupCafe;
    }

    public double getDblParcela() {
        return dblParcela;
    }

    public void setDblParcela(double dblParcela) {
        this.dblParcela = dblParcela;
    }

    public String getStrRenueva() {
        return strRenueva;
    }

    public void setStrRenueva(String strRenueva) {
        this.strRenueva = strRenueva;
    }

    public String getStrCausa() {
        return strCausa;
    }

    public void setStrCausa(String strCausa) {
        this.strCausa = strCausa;
    }

    public int getIntCosechas() {
        return intCosechas;
    }

    public void setIntCosechas(int intCosechas) {
        this.intCosechas = intCosechas;
    }
    
}