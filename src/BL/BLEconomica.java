/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import Clases.Finca;
import Clases.Socio_Economica;
import DAT.DATEconomica;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dell_5437
 */
public class BLEconomica {
    DATEconomica ManejadorEconomia = new DATEconomica();   
    ArrayList<Socio_Economica>Arrc;
    public void agregarEconomica(Socio_Economica s) throws ClassNotFoundException, SQLException{
        ManejadorEconomia.AgregarEconomica(s);
    }
    public void modificarEconomica(Socio_Economica s,int id) throws ClassNotFoundException, SQLException{
        ManejadorEconomia.ModificarEconomica(s, id);
        
    }
    public ArrayList<Socio_Economica> Consultar(int id) throws ClassNotFoundException, SQLException {
        Arrc = new ArrayList<Socio_Economica>();
        int intIncremento = 0;
        ResultSet rs;
        rs = ManejadorEconomia.Consultar(id);
        //para desglosar los datos que estan dentro del resultSet
        ResultSetMetaData rm = rs.getMetaData();
        //Recupera las columnas de la tabla
        int columnCount = rm.getColumnCount();
        ArrayList<String> columns = new ArrayList<>();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = rm.getColumnName(i);
            columns.add(columnName);
        }
        //Envia los datos a la Clase
        while (rs.next()) {
            Socio_Economica s = new Socio_Economica();
            for (String columnName : columns) {
                String value = rs.getString(columnName);
                if (columnName.equals("Contratados")) {
                    s.setDblContrados(Double.parseDouble(value));
                }
                if (columnName.equals("Hogar")) {
                   s.setDblHogar(Double.parseDouble(value));
                }
                if (columnName.equals("Fertilizantes")) {
                    s.setDblFertilizantes(Double.parseDouble(value));
                }
                if (columnName.equals("Semillas")) {
                    s.setDblSemillas(Double.parseDouble(value));
                }
                if (columnName.equals("Trasnporte")) {
                    s.setDblTransporte(Double.parseDouble(value));
                }
                
            }
            Arrc.add(s);
            intIncremento = intIncremento + 1;
        }
        return Arrc;
    }
}
