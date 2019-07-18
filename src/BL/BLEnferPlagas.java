
package BL;

import DAT.DATEnfer;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import CLASES.PlagasYEnfermedades;
import DAT.DATConexion;
import static DAT.DATConexion.con;


public class BLEnferPlagas {
 DATEnfer ManejadorEnfer = new DATEnfer();
 DATConexion con= new DATConexion();
    
    public static ArrayList<PlagasYEnfermedades> ArrEnfer;
    public static PlagasYEnfermedades pe;
    
     public ArrayList<PlagasYEnfermedades> Consultar(int id) throws ClassNotFoundException, SQLException {
       ArrEnfer = new ArrayList<PlagasYEnfermedades>();
        int intIncremento = 0;
        ResultSet rs;
        rs = ManejadorEnfer.Consultar(id);
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
            PlagasYEnfermedades pe = new PlagasYEnfermedades();
            for (String columnName : columns) {

                String value = rs.getString(columnName);
                if (columnName.equals("id")) {
                    pe.setIntId(Integer.parseInt(value));
                }
                if (columnName.equals("TIPO")) {
                    pe.setStrTipo(value);
                }
                if (columnName.equals("NOMBRE")) {
                    pe.setStrNombre(value);
                }
                if (columnName.equals("INCIDENCIA")) {
                    pe.setStrIncidencia(value);
                }
                if (columnName.equals("PRODUCTO")) {
                    pe.setStrProducto(value);
                }
                if (columnName.equals("DOSIS")) {
                    pe.setStrDosis(value);
                }
                if (columnName.equals("FRECUENCIA")) {
                    pe.setStrFrecuencia(value);
                }
                if (columnName.equals("MES")) {
                    pe.setStrMes(value);
                }
                if (columnName.equals("VARIERESIS")) {
                    pe.setStrVari(value);
                }
                
            }
            ArrEnfer.add(pe);
            intIncremento = intIncremento + 1;
        }
        return ArrEnfer;
    }


    public void Agregar(PlagasYEnfermedades pe) throws ClassNotFoundException, SQLException {
        ManejadorEnfer.Agregar(pe);

    }

     
     public int Actualizar(int id,String strIncidencia ,String strProducto,String strDosis, String strFrecuencia,String strMes,String strVariedad) throws SQLException, ClassNotFoundException{
          return ManejadorEnfer.Actualizar( id,strIncidencia, strProducto, strDosis, strFrecuencia, strMes, strVariedad);
    
    }
       public void CerrarConexionBDD() throws SQLException{
        con. CerrarConexion();
    }
   
}
