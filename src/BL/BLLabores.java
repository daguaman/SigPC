/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;


import static BL.BLsuelo.lstProductos;
import Clases.Labores;
import Clases.Parcelas1;
import DAT.DATConexion;
import DAT.DATLabores;
import DAT.DATsuelo;
import clases.suelo;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class BLLabores {
     //Permite acceder a los métodos de la capa DAT de la Clase Estudiante
    DATLabores ManejadorLaboresDAT = new DATLabores();
    public static ArrayList<Labores> lstLabores;
    
    //Permite acceder a los métodos de la capa DAT de la Clase Conexion
    DATConexion ManejadorConexionDAT = new DATConexion();
    //Para el Arreglo de Objetos
    
    //Para recuperar los datos en un ArrayList
  
    //Crear un ArrayList de Tipo Generico para recuperar cuando hay relaciones
    public static ArrayList<Object>  ListComponentes = new ArrayList<>();
    ArrayList<Parcelas1>Arra;
    ArrayList<Labores> ArrS;
    DATLabores ManejadorLabores = new DATLabores();
    
     
    
   
    
    public int Insertar(ArrayList<Labores> c) throws SQLException, ClassNotFoundException{
        int intRetorno = 1;
        //Descompone lo que viene en el ArrayList de Estudiantes par apoderlos procesar uno a uno.
        for (int i = 0; i < c.size(); i++) {
            intRetorno = ManejadorLaboresDAT.Insertar(c.get(i).getStrDetalle_labor(), c.get(i).getStrMes(), c.get(i).getIntIdPar());
        }
        return intRetorno;
    }   
    
    

    public ArrayList<Labores> Consultar() throws ClassNotFoundException, SQLException {
        
    int intIncremento =0;
    ResultSet rs;
    int intId=0;
    

        lstLabores = new ArrayList<>();
        rs = ManejadorLaboresDAT.Consultar();
        ResultSetMetaData rm = rs.getMetaData();
        //Recupera los campos de la tabla
        int columnCount = rm.getColumnCount();
        ArrayList<String> columns = new ArrayList<>();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = rm.getColumnName(i);
            columns.add(columnName);
        }
        //Envia los datos a la Clase
        while (rs.next()) 
        {
            for (String columnName : columns) 
            {
                String value = rs.getString(columnName);
                if (columnName.equals("id"))
                    intId= Integer.parseInt(value);
            }
            try
            {
               Labores l= new Labores(intId);
                lstLabores.add(l);
            }
            catch(Exception ex)
            {
                String msn = ex.getMessage();
            }
        }
        //Metodo para cerrar la conexion de la BDD, siempre cerramos luego que ya lo tenemos en un objeto para manipularlos
        CerrarConexionBDD();
        return lstLabores;
    }
     public int Consulta_existe_Parcela(int id) throws ClassNotFoundException, SQLException {
        ResultSet rs;
        int value = 0;
        rs = ManejadorLaboresDAT.ConsultarIdParcela(id);
        while (rs.next()) {
            value = rs.getInt(1);
        }
        return value;
    }
     
     
     public int Consulta_parcela(int id) throws ClassNotFoundException, SQLException {
        ResultSet rs;
        int value = 0;
        rs = ManejadorLaboresDAT.Consultar_parcela(id);
        while (rs.next()) {
            value = rs.getInt(1);
        }
        return value;
    }
     
     public ArrayList<Labores> Consultar_labores(int id) throws ClassNotFoundException, SQLException {
        ArrS = new ArrayList<Labores>();
        int intIncremento = 0;
        int idParcela= Consulta_parcela(id);
        ResultSet rs;
        rs = ManejadorLabores.Consultar_labores(idParcela);
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
            Labores l = new Labores();
            for (String columnName : columns) {
                String value = rs.getString(columnName);
               if (columnName.equals("detalle_labores"))
                    l.setStrDetalle_labor(value);
               if (columnName.equals("mes"))
                    l.setStrMes(value);
               
                            
            }
            ArrS.add(l);
            intIncremento = intIncremento + 1;
        }
        return ArrS;
    }
     
    
    
    
   
     
    public void CerrarConexionBDD() throws SQLException{
        ManejadorConexionDAT.CerrarConexion();
    }

}
