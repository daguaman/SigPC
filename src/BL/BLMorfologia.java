package BL;
import Clases.Variedad1;
import DAT.DATConexion;
import DAT.DATMorfologia;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
public class BLMorfologia 
{
    DATMorfologia ManejadorMorfologiaDAT = new DATMorfologia();
    DATConexion ManejadorConexionDAT = new DATConexion();
    public static ArrayList<Variedad1> ArrlisMorfo;
    public int Insertar (Variedad1 v) throws ClassNotFoundException, SQLException
    {
        int retorno =ManejadorMorfologiaDAT.Insertar(v);
        return retorno;
    }
    public ArrayList<Variedad1> Consultar() throws ClassNotFoundException, SQLException
    {
        //int intIncremento = 0;
        ResultSet rs;
        ArrlisMorfo = new ArrayList<>();
        rs = ManejadorMorfologiaDAT.Consultar();
        ResultSetMetaData rm = rs.getMetaData();
        //Recupera los campos de la tabla
        int columnCount = rm.getColumnCount();
        ArrayList<String> columns = new ArrayList<>();
        for (int i = 1; i <=columnCount; i++)
        {
            String columnName = rm.getColumnName(i);
            columns.add(columnName);
        }
        //Envia los datos a la Clase
        while (rs.next()) 
        {
            Variedad1 v = new Variedad1();
            for (String columnName : columns) 
            {
                String value = rs.getString(columnName);
                if (columnName.equals("ID"))
                    v.setIntid(Integer.parseInt(value));
                if (columnName.equals("VARIEDAD"))
                    v.setStrVariedad1(value);
                if (columnName.equals("MES_FLORECE"))
                    v.setStrMesFlorece1(value);
                if (columnName.equals("DURACION_FLORACION"))
                    v.setIntDuracionFloracion1(Integer.parseInt(value));
                if (columnName.equals("MES_FRUCTIFICA"))
                    v.setStrMesfructifica1(value);
                if (columnName.equals("DURACION_FRUCTIFICA"))
                    v.setIntDuracionFructacion1(Integer.parseInt(value));
                if (columnName.equals("MES_COSECHA"))
                    v.setStrMesCosecha1((value));
                if (columnName.equals("DURACION_COSECHA"))
                    
                    v.setStrDuracionCosecha1(value);
                if (columnName.equals("TIPO_COSECHA"))
                    v.setStrComoCosecha1((value));
                if (columnName.equals("NUMERO_DIAS_COSECHA_FLORACION"))
                    v.setIntDuracionFloracion1(Integer.parseInt(value));
                if (columnName.equals("EDAD_CAFETAL"))
                    v.setIntEdadCafetal1(Integer.parseInt(value));
                if(columnName.equals ("COLOR_FLOR"))
                    v.setStrColorFlor1(value);
                if(columnName.equals("COLOR_FRUTO"))
                    v.setStrColorFruto1(value);
                if (columnName.equals("CARACTERISTICAS_VARIEDAD"))
                    v.setStrCaracteristicas1(value);
                if (columnName.equals("TAMANIO_CEREZA"))
                    v.setStrTamanoCereza1(value);
                }
            ArrlisMorfo.add(v);
            //ArrEstudiante[intIncremento] =  e;
            //intIncremento = intIncremento +1;
        }
        //ManejadorConexionDAT.CerrarConexion();
        return ArrlisMorfo;
    }
    public ArrayList<Variedad1> Consultar(int id) throws ClassNotFoundException, SQLException
    {
        //int intIncremento = 0;
        ResultSet rs;
        ArrlisMorfo = new ArrayList<>();
        rs = ManejadorMorfologiaDAT.Consultar(id);
        ResultSetMetaData rm = rs.getMetaData();
        //Recupera los campos de la tabla
        int columnCount = rm.getColumnCount();
        ArrayList<String> columns = new ArrayList<>();
        for (int i = 1; i <=columnCount; i++)
        {
            String columnName = rm.getColumnName(i);
            columns.add(columnName);
        }
        //Envia los datos a la Clase
        while (rs.next()) 
        {
            Variedad1 v = new Variedad1();
            for (String columnName : columns) 
            {
                String value = rs.getString(columnName);
                if (columnName.equals("ID"))
                    v.setIntid(Integer.parseInt(value));
                if (columnName.equals("IdVariedad"))
                    v.setVariedad(Integer.parseInt(value));
                if (columnName.equals("VARIEDAD"))
                    v.setStrVariedad1(value);
                if (columnName.equals("MES_FLORECE"))
                    v.setStrMesFlorece1(value);
                if (columnName.equals("DURACION_FLORACION"))
                    v.setIntDuracionFloracion1(Integer.parseInt(value));
                if (columnName.equals("MES_FRUCTIFICA"))
                    v.setStrMesfructifica1(value);
                if (columnName.equals("DURACION_FRUCTIFICA"))
                    v.setIntDuracionFructacion1(Integer.parseInt(value));
                if (columnName.equals("MES_COSECHA"))
                    v.setStrMesCosecha1((value));
                if (columnName.equals("DURACION_COSECHA"))
                    v.setStrDuracionCosecha1(value);
                if (columnName.equals("TIPO_COSECHA"))
                    v.setStrComoCosecha1((value));
                if (columnName.equals("NUMERO_DIAS_COSECHA_FLORACION"))
                    v.setIntDuracionFloracion1(Integer.parseInt(value));
                if (columnName.equals("EDAD_CAFETAL"))
                    v.setIntEdadCafetal1(Integer.parseInt(value));
                if(columnName.equals ("COLOR_FLOR"))
                    v.setStrColorFlor1(value);
                if(columnName.equals("COLOR_FRUTO"))
                    v.setStrColorFruto1(value);
                if (columnName.equals("CARACTERISTICAS_VARIEDAD"))
                    v.setStrCaracteristicas1(value);
                if (columnName.equals("TAMANIO_CEREZA"))
                    v.setStrTamanoCereza1(value);
            }
            ArrlisMorfo.add(v);
        }
        return ArrlisMorfo;
    }
      public int Consulta_existe_Morfologia(int id) throws ClassNotFoundException, SQLException {
        ResultSet rs;
        int value = 0;
        rs = ManejadorMorfologiaDAT.ConsultarVariedadMorfologia(id);
        while (rs.next()) {
            value = rs.getInt(1);
        }
        return value;
    }
      public int Consulta_existeId_Morfologia(int id) throws ClassNotFoundException, SQLException {
        ResultSet rs;
        int value = 0;
        rs = ManejadorMorfologiaDAT.ConsultarIdMorfologia(id);
        while (rs.next()) {
            value = rs.getInt(1);
        }
        return value;
    }
      public ArrayList<Variedad1> ConsultarVariedades(int id) throws ClassNotFoundException, SQLException
    {
        //int intIncremento = 0;
        ResultSet rs;
        ArrlisMorfo = new ArrayList<>();
        rs = ManejadorMorfologiaDAT.Consultar(id);
        ResultSetMetaData rm = rs.getMetaData();
        //Recupera los campos de la tabla
        int columnCount = rm.getColumnCount();
        ArrayList<String> columns = new ArrayList<>();
        for (int i = 1; i <=columnCount; i++)
        {
            String columnName = rm.getColumnName(i);
            columns.add(columnName);
        }
        //Envia los datos a la Clase
        while (rs.next()) 
        {
            Variedad1 v = new Variedad1();
            for (String columnName : columns) 
            {
                String value = rs.getString(columnName);
                if (columnName.equals("ID"))
                    v.setIntid(Integer.parseInt(value));
                if (columnName.equals("IdVariedad"))
                    v.setVariedad(Integer.parseInt(value));
                if (columnName.equals("VARIEDAD"))
                    v.setStrVariedad1(value);
                if (columnName.equals("MES_FLORECE"))
                    v.setStrMesFlorece1(value);
                if (columnName.equals("DURACION_FLORACION"))
                    v.setIntDuracionFloracion1(Integer.parseInt(value));
                if (columnName.equals("MES_FRUCTIFICA"))
                    v.setStrMesfructifica1(value);
                if (columnName.equals("DURACION_FRUCTIFICA"))
                    v.setIntDuracionFructacion1(Integer.parseInt(value));
                if (columnName.equals("MES_COSECHA"))
                    v.setStrMesCosecha1((value));
                if (columnName.equals("DURACION_COSECHA"))
                    v.setStrDuracionCosecha1(value);
                if (columnName.equals("TIPO_COSECHA"))
                    v.setStrComoCosecha1((value));
                if (columnName.equals("NUMERO_DIAS_COSECHA_FLORACION"))
                    v.setIntDuracionFloracion1(Integer.parseInt(value));
                if (columnName.equals("EDAD_CAFETAL"))
                    v.setIntEdadCafetal1(Integer.parseInt(value));
                if(columnName.equals ("COLOR_FLOR"))
                    v.setStrColorFlor1(value);
                if(columnName.equals("COLOR_FRUTO"))
                    v.setStrColorFruto1(value);
                if (columnName.equals("CARACTERISTICAS_VARIEDAD"))
                    v.setStrCaracteristicas1(value);
                if (columnName.equals("TAMANIO_CEREZA"))
                    v.setStrTamanoCereza1(value);
            }
            ArrlisMorfo.add(v);
        }
        return ArrlisMorfo;
    }
}