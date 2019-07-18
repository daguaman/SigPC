/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import Clases.Ubicacion;
import DAT.DATConexion;
import DAT.DATUbicacion;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class BLUbicacion {
    
    DATUbicacion ManejadorUbicacion = new DATUbicacion();
     
   DATConexion cc= new DATConexion();
   ArrayList<Ubicacion>ArrU;
     public int Insertar(ArrayList<Ubicacion> e) throws SQLException, ClassNotFoundException{
         int intRetorno =0;
         for (int i = 0; i < e.size(); i++){
             intRetorno = ManejadorUbicacion.Insertar(e.get(i).getDblUbicacionX(), e.get(i).getDblUbicaciony(),e.get(i).getDblUbicacionz(),e.get(i).getStrUbicacionwp(),e.get(i).getStrAsociacion1(),e.get(i).getStrAsociacion2(),e.get(i).getStrAsociacion3(), e.get(i).getStrAsociacion4(),e.get(i).getStrAsociacion5(),e.get(i).getStrDensidad1(),e.get(i).getStrDensidad2(),e.get(i).getStrDensidad3(),e.get(i).getStrDensidad4(),e.get(i).getStrDensidad5(),e.get(i).getStrPorque1(),e.get(i).getStrPorque2(),e.get(i).getStrPorque3(),e.get(i).getStrPorque4(),e.get(i).getStrPorque5(), e.get(i).getIdParcel());
         }
         
        return intRetorno;
    } 
     
     
     
      public int Consulta_parcela(int id) throws ClassNotFoundException, SQLException {
        ResultSet rs;
        int value = 0;
        rs = ManejadorUbicacion.Consultar_parcela(id);
        while (rs.next()) {
            value = rs.getInt(1);
        }
        return value;
    }
     
     public ArrayList<Ubicacion> Consultar_Ubicacion(int id) throws ClassNotFoundException, SQLException {
        ArrU = new ArrayList<Ubicacion>();
        int intIncremento = 0;
        int idParcela= Consulta_parcela(id);
        
        
              
        
        ResultSet rs;
        rs = ManejadorUbicacion.Consultar_ubicacion(idParcela);
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
            Ubicacion u = new Ubicacion();
            for (String columnName : columns) {
                String value = rs.getString(columnName);
               if (columnName.equals("ubicacion_x")){
                   u.setDblUbicacionX(Double.parseDouble(value));
               }
               if (columnName.equals("ubicacion_y")){
                   u.setDblUbicaciony(Double.parseDouble(value));
               }
               if (columnName.equals("ubicacion_z")){
                   u.setDblUbicacionz(Double.parseDouble(value));
               }
               if (columnName.equals("ubicacion_wp")){
                   u.setStrUbicacionwp(value);
               }
               if (columnName.equals("asociacion1")){
                   u.setStrAsociacion1(value);
               }
               if (columnName.equals("asociacion2")){
                   u.setStrAsociacion2(value);
               }
               if (columnName.equals("asociacion3")){
                  u.setStrAsociacion3(value);
               }
               if (columnName.equals("asociacion4")){
                 u.setStrAsociacion4(value);
               }
               if (columnName.equals("asociacion5")){
                   u.setStrAsociacion5(value);
               }
               if (columnName.equals("densidad1")){
                   u.setStrDensidad1(value);
               }
               if (columnName.equals("densidad2")){
                   u.setStrDensidad2(value);
               }
               if (columnName.equals("densidad3")){
                  u.setStrDensidad3(value);
               }
               if (columnName.equals("densidad4")){
                 u.setStrDensidad4(value);
               }
               if (columnName.equals("densidad5")){
                   u.setStrDensidad5(value);
               }
               if (columnName.equals("porque1")){
                   u.setStrPorque1(value);                       
               }
               if (columnName.equals("porque2")){
                   u.setStrPorque2(value);
               }
               if (columnName.equals("porque3")){
                  u.setStrPorque3(value);
               }
               if (columnName.equals("porque4")){
                 u.setStrPorque4(value);
               }
               if (columnName.equals("porque5")){
                   u.setStrPorque5(value);
               }          
            }
            ArrU.add(u);
            intIncremento = intIncremento + 1;
        }
        return ArrU;
    }
     
}
