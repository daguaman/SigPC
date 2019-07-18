/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import static BL.BLProvincias.ArrEcuador;
import Clases.Ecuador;
import DAT.DATProvincias;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Dell_5437
 */
public class BLProvincias {

    DATProvincias ManejadorProvincias = new DATProvincias();
    public static ArrayList<Ecuador> ArrEcuador;

    //Metodo que recupera datos de la Base de Datos
    public ArrayList<Ecuador> Consultar() throws ClassNotFoundException, SQLException {

        ArrEcuador = new ArrayList<Ecuador>();
        int intIncremento = 0;
        ResultSet rs;
        rs = ManejadorProvincias.Consultar();
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
            Ecuador e = new Ecuador();
            for (String columnName : columns) {
                String value = rs.getString(columnName);
                if (columnName.equals("provincia")) {
                    e.setStrProvincia(value);
                }
            }
            ArrEcuador.add(e);
            intIncremento = intIncremento + 1;
        }
        return ArrEcuador;
    }

    public ArrayList<Ecuador> ConsultarCantones(String pro) throws ClassNotFoundException, SQLException {

        ArrEcuador = new ArrayList<Ecuador>();
        int intIncremento = 0;
        ResultSet rs;
        rs = ManejadorProvincias.ConsultarCantones(pro);
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
            Ecuador e = new Ecuador();
            for (String columnName : columns) {
                String value = rs.getString(columnName);
                if (columnName.equals("Cantones")) {
                    e.setStrCantones(value);
                }
            }
            ArrEcuador.add(e);
            intIncremento = intIncremento + 1;
        }
        return ArrEcuador;
    }

}
