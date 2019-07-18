package BL;


import Clases.Clima;
import DAT.DATLabores;
import DAT.DATConexion;
import DAT.DATClima;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;


public class BLClima {
    //Permite acceder a los métodos de la capa DAT de la Clase Estudiante
    DATLabores ManejadorComponentesDAT = new DATLabores();
    DATClima ManejadorClimaDAT = new DATClima();
    
    //Permite acceder a los métodos de la capa DAT de la Clase Conexion
    DATConexion ManejadorConexionDAT = new DATConexion();
    //Para el Arreglo de Objetos
    
    //Para recuperar los datos en un ArrayList
  
    //Crear un ArrayList de Tipo Generico para recuperar cuando hay relaciones
    public static ArrayList<Object>  ListComponentes = new ArrayList<>();
    ArrayList<Clima> ArrC;
    
     
    
   
    
    public int Insertar(ArrayList<Clima> c) throws SQLException, ClassNotFoundException{
        int intRetorno = 1;
        //Descompone lo que viene en el ArrayList de Estudiantes par apoderlos procesar uno a uno.
        for (int i = 0; i < c.size(); i++) {
            intRetorno = ManejadorClimaDAT.Insertar(c.get(i).getStrDetalle_clima(), c.get(i).getStrMes(), c.get(i).getIntIdPar());
        }
        return intRetorno;
    }   
    
    public int Consulta_parcela(int id) throws ClassNotFoundException, SQLException {
        ResultSet rs;
        int value = 0;
        rs = ManejadorClimaDAT.Consultar_parcela(id);
        while (rs.next()) {
            value = rs.getInt(1);
        }
        return value;
    }
     
     public ArrayList<Clima> Consultar_Clima(int id) throws ClassNotFoundException, SQLException {
        ArrC = new ArrayList<Clima>();
        int intIncremento = 0;
        int idParcela= Consulta_parcela(id);
        ResultSet rs;
        rs = ManejadorClimaDAT.Consultar_clima(idParcela);
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
            Clima c = new Clima();
            for (String columnName : columns) {
                String value = rs.getString(columnName);
               if (columnName.equals("detalle_clima"))
                    c.setStrDetalle_clima(value);
               if (columnName.equals("mes"))
                    c.setStrMes(value);
               
                            
            }
            ArrC.add(c);
            intIncremento = intIncremento + 1;
        }
        return ArrC;
    }
     
     
     public int Actualizar(String strDetalle_clima,String strMes,int intIdPar) throws ClassNotFoundException, SQLException{
        
        return ManejadorClimaDAT.Actualizar(strDetalle_clima, strMes, intIdPar);
    }
     
     
    public void CerrarConexionBDD() throws SQLException{
        ManejadorConexionDAT.CerrarConexion();
    }
}
