/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Date;


/**
 *
 * @author Dell_5437
 */
public class Campo {
    public int id;
    public int idA;
    public String dtFecha;
    private String strResponsable;
    
    private String strProvincia;
    private String strCanton;
    private String strCodigo;
    private String strParroquia;
    private String strLocalidad;
    private String strNombres;
    private String strApellidos;
    private int intTelefono;
    private int intIdentidad;
    private String strObservaciones;

    public Campo() {
    }

    public Campo(int idA, String dtFecha, String strResponsable, String strProvincia, String strCanton, String strCodigo, String strParroquia, String strLocalidad, String strNombres, String strApellidos, int intTelefono, int intIdentidad, String strObservaciones) {
        this.idA = idA;
        this.dtFecha = dtFecha;
        this.strResponsable = strResponsable;
        this.strProvincia = strProvincia;
        this.strCanton = strCanton;
        this.strCodigo = strCodigo;
        this.strParroquia = strParroquia;
        this.strLocalidad = strLocalidad;
        this.strNombres = strNombres;
        this.strApellidos = strApellidos;
        this.intTelefono = intTelefono;
        this.intIdentidad = intIdentidad;
        this.strObservaciones = strObservaciones;
    }
    
    

    public int getIdA() {
        return idA;
    }

    public void setIdA(int idA) {
        this.idA = idA;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    public String getStrCodigo() {
        return strCodigo;
    }

    public void setStrCodigo(String strCodigo) {
        this.strCodigo = strCodigo;
    }

    
    public String getDtFecha() {
        return dtFecha;
    }

    public void setDtFecha(String dtFecha) {
        this.dtFecha = dtFecha;
    }
    public String getStrResponsable() {
        return strResponsable;
    }

    public void setStrResponsable(String strResponsable) {
        this.strResponsable = strResponsable;
    }

    

    public String getStrProvincia() {
        return strProvincia;
    }

    public void setStrProvincia(String strProvincia) {
        this.strProvincia = strProvincia;
    }

    public String getStrCanton() {
        return strCanton;
    }

    public void setStrCanton(String strCanton) {
        this.strCanton = strCanton;
    }

    public String getStrParroquia() {
        return strParroquia;
    }

    public void setStrParroquia(String strParroquia) {
        this.strParroquia = strParroquia;
    }

    public String getStrLocalidad() {
        return strLocalidad;
    }

    public void setStrLocalidad(String strLocalidad) {
        this.strLocalidad = strLocalidad;
    }

    public String getStrNombres() {
        return strNombres;
    }

    public void setStrNombres(String strNombres) {
        this.strNombres = strNombres;
    }

    public String getStrApellidos() {
        return strApellidos;
    }

    public void setStrApellidos(String strApellidos) {
        this.strApellidos = strApellidos;
    }

    public int getIntTelefono() {
        return intTelefono;
    }

    public void setIntTelefono(int intTelefono) {
        this.intTelefono = intTelefono;
    }

    public int getIntIdentidad() {
        return intIdentidad;
    }

    public void setIntIdentidad(int intIdentidad) {
        this.intIdentidad = intIdentidad;
    }

    public String getStrObservaciones() {
        return strObservaciones;
    }

    public void setStrObservaciones(String strObservaciones) {
        this.strObservaciones = strObservaciones;
    }
    
}