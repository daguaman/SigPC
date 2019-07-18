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
public class Socio_Economica {
    public int id;
   public double dblContrados;
   public double dblHogar;
   public double dblFertilizantes;
   public double dblSemillas;
   public double dblTransporte;

    public Socio_Economica() {
    }
   

    public Socio_Economica(int id, double dblContrados, double dblHogar, double dblFertilizantes, double dblSemillas, double dblTransporte) {
        this.id = id;
        this.dblContrados = dblContrados;
        this.dblHogar = dblHogar;
        this.dblFertilizantes = dblFertilizantes;
        this.dblSemillas = dblSemillas;
        this.dblTransporte = dblTransporte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   
    public double getDblContrados() {
        return dblContrados;
    }

    public void setDblContrados(double dblContrados) {
        this.dblContrados = dblContrados;
    }

    public double getDblHogar() {
        return dblHogar;
    }

    public void setDblHogar(double dblHogar) {
        this.dblHogar = dblHogar;
    }

    public double getDblFertilizantes() {
        return dblFertilizantes;
    }

    public void setDblFertilizantes(double dblFertilizantes) {
        this.dblFertilizantes = dblFertilizantes;
    }

    public double getDblSemillas() {
        return dblSemillas;
    }

    public void setDblSemillas(double dblSemillas) {
        this.dblSemillas = dblSemillas;
    }

    public double getDblTransporte() {
        return dblTransporte;
    }

    public void setDblTransporte(double dblTransporte) {
        this.dblTransporte = dblTransporte;
    }
   
}
