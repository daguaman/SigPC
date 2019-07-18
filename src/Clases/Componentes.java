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
public class Componentes extends Finca{
    public int id;
    public String strProduccion;
    public String strEquipos;
    public String strAcceso;
    public String strTipos;
    public String strOtro1;
    public String strOtro2;
    public String strOtro3;
    public String strOtro4;
    public String strOtro5;
    public String strOtro6;
    public String strOtro7;
    public String strOtro8;
    
    

    public Componentes() {
    }

    public Componentes(int id, String strProduccion, String strEquipos, String strAcceso, String strTipos, String strOtro1, String strOtro2, String strOtro3, int idF, String strNombreFinca, double dblSuperficieT, String strCultivo, double dblSupcultivo, double dblSupCafe, double dblParcela, String strRenueva, String strCausa, int intCosechas) {
        super(idF, strNombreFinca, dblSuperficieT, strCultivo, dblSupcultivo, dblSupCafe, dblParcela, strRenueva, strCausa, intCosechas);
        this.id = id;
        this.strProduccion = strProduccion;
        this.strEquipos = strEquipos;
        this.strAcceso = strAcceso;
        this.strTipos = strTipos;
        this.strOtro1 = strOtro1;
        this.strOtro2 = strOtro2;
        this.strOtro3 = strOtro3;
    }

    public Componentes(int id, String strProduccion, String strEquipos, String strAcceso, String strTipos, String strOtro1, String strOtro2, String strOtro3, String strOtro4, String strOtro5, String strOtro6, String strOtro7, String strOtro8) {
        this.id = id;
        this.strProduccion = strProduccion;
        this.strEquipos = strEquipos;
        this.strAcceso = strAcceso;
        this.strTipos = strTipos;
        this.strOtro1 = strOtro1;
        this.strOtro2 = strOtro2;
        this.strOtro3 = strOtro3;
        this.strOtro4 = strOtro4;
        this.strOtro5 = strOtro5;
        this.strOtro6 = strOtro6;
        this.strOtro7 = strOtro7;
        this.strOtro8 = strOtro8;
    }

    public String getStrOtro7() {
        return strOtro7;
    }

    public void setStrOtro7(String strOtro7) {
        this.strOtro7 = strOtro7;
    }

    public String getStrOtro8() {
        return strOtro8;
    }

    public void setStrOtro8(String strOtro8) {
        this.strOtro8 = strOtro8;
    }

   

    public String getStrOtro4() {
        return strOtro4;
    }

    public void setStrOtro4(String strOtro4) {
        this.strOtro4 = strOtro4;
    }

    public String getStrOtro5() {
        return strOtro5;
    }

    public void setStrOtro5(String strOtro5) {
        this.strOtro5 = strOtro5;
    }

    public String getStrOtro6() {
        return strOtro6;
    }

    public void setStrOtro6(String strOtro6) {
        this.strOtro6 = strOtro6;
    }

    
   
   
    public String getStrOtro1() {
        return strOtro1;
    }

    public void setStrOtro1(String strOtro1) {
        this.strOtro1 = strOtro1;
    }

    public String getStrOtro2() {
        return strOtro2;
    }

    public void setStrOtro2(String strOtro2) {
        this.strOtro2 = strOtro2;
    }

    public String getStrOtro3() {
        return strOtro3;
    }

    public void setStrOtro3(String strOtro3) {
        this.strOtro3 = strOtro3;
    }
    

  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStrProduccion() {
        return strProduccion;
    }

    public void setStrProduccion(String strProduccion) {
        this.strProduccion = strProduccion;
    }

    public String getStrEquipos() {
        return strEquipos;
    }

    public void setStrEquipos(String strEquipos) {
        this.strEquipos = strEquipos;
    }

    public String getStrAcceso() {
        return strAcceso;
    }

    public void setStrAcceso(String strAcceso) {
        this.strAcceso = strAcceso;
    }

    public String getStrTipos() {
        return strTipos;
    }

    public void setStrTipos(String strTipos) {
        this.strTipos = strTipos;
    }
    
    
    
    
}
