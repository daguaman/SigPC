/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import static BL.BLProvincias.ArrEcuador;
import Clases.Asociaciones;
import Clases.Campo;
import Clases.Ecuador;
import DAT.DATFicha;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dell_5437
 */
public class BLFicha {

    public static ArrayList<Campo> ArrCampos;
    DATFicha ManejadorFicha = new DATFicha();
    ArrayList<Campo> Arre;
    ArrayList<Asociaciones>ArrA;

    public void AgregarFicha(Campo ca) throws ClassNotFoundException, SQLException {
        ManejadorFicha.Agregar(ca);
    }

    public int Consulta_existe() throws ClassNotFoundException, SQLException {
        ResultSet rs;
        int value = 0;
        rs = ManejadorFicha.Consultar();
        while (rs.next()) {
            value = rs.getInt(1);
        }
        return value;
    }
     public int Consulta_existe(int idBusca) throws ClassNotFoundException, SQLException {
        ResultSet rs;
        int value = 0;
        rs = ManejadorFicha.ConsultarExiste(idBusca);
        while (rs.next()) {
            value = rs.getInt(2);
        }
        return value;
    }
     public String ConsultarIdAsociacion(int id) throws ClassNotFoundException, SQLException {
        ResultSet rs;
        String value = "";
        rs = ManejadorFicha.ConsultarIdAsociacion(id);
        while (rs.next()) {
            value = rs.getString(2);
        }
        return value;
    }
    

    public void AgregarAsociacion(String nombre) throws ClassNotFoundException, SQLException {
        ManejadorFicha.AgregarAsociacion(nombre);
    }

    public ArrayList<Asociaciones> ConsultarAsociacion() throws ClassNotFoundException, SQLException {

        ArrA = new ArrayList<Asociaciones>();
        int intIncremento = 0;
        ResultSet rs;
        rs = ManejadorFicha.ConsultarAsociacion();

        //Envia los datos a la Clase
        while (rs.next()) {
            Asociaciones a = new Asociaciones();
            String value = rs.getString("Nombre");
            a.setStrNombre(value);         

            ArrA.add(a);
            intIncremento = intIncremento + 1;
        }

        return ArrA;
    }
  
     public ArrayList<Asociaciones> ConsultarAsociacion(String nombre) throws ClassNotFoundException, SQLException {

      ArrA = new ArrayList<Asociaciones>();
        int intIncremento = 0;
        ResultSet rs;
        rs = ManejadorFicha.ConsultarAsociacion(nombre);
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
            Asociaciones a = new Asociaciones();
            for (String columnName : columns) {
                String value = rs.getString(columnName);
                if (columnName.equals("id")) {
                    a.setIntId(Integer.parseInt(value));
                }
                if (columnName.equals("Nombre")) {
                    a.setStrNombre(value);
                }                
            }
            ArrA.add(a);
            intIncremento = intIncremento + 1;
        }
        return ArrA;
    }
    
    
    public ArrayList<Asociaciones> ConsultarAsociacion(int id) throws ClassNotFoundException, SQLException {

      ArrA = new ArrayList<Asociaciones>();
        int intIncremento = 0;
        ResultSet rs;
        rs = ManejadorFicha.ConsultarAsociacion(id);
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
            Asociaciones a = new Asociaciones();
            for (String columnName : columns) {
                String value = rs.getString(columnName);
                if (columnName.equals("id")) {
                    a.setIntId(Integer.parseInt(value));
                }
                if (columnName.equals("Nombre")) {
                    a.setStrNombre(value);
                }                
            }
            ArrA.add(a);
            intIncremento = intIncremento + 1;
        }
        return ArrA;
    }
    

    public ArrayList<Campo> Consultar() throws ClassNotFoundException, SQLException {
        Arre = new ArrayList<Campo>();
        int intIncremento = 0;
        ResultSet rs;
        rs = ManejadorFicha.Consultar();
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
            Campo ca = new Campo();
            for (String columnName : columns) {
                String value = rs.getString(columnName);
                if (columnName.equals("Id")) {
                    ca.setId(Integer.parseInt(value));
                }
                if (columnName.equals("Fecha")) {
                    ca.setDtFecha(value);
                }
                  if (columnName.equals("idA")) {
                   ca.setIdA(Integer.parseInt(value));
                }
                if (columnName.equals("Responsable")) {
                    ca.setStrResponsable(value);
                }
                if (columnName.equals("Provincia")) {
                    ca.setStrProvincia(value);
                }
                if (columnName.equals("Canton")) {
                    ca.setStrCanton(value);
                }
                if (columnName.equals("Codigo")) {
                    ca.setStrCodigo(value);
                }
                if (columnName.equals("parroquia")) {
                    ca.setStrParroquia(value);
                }
                if (columnName.equals("nombres")) {
                    ca.setStrNombres(value);
                }
                if (columnName.equals("apellidos")) {
                    ca.setStrApellidos(value);
                }
                if (columnName.equals("cedula")) {
                    ca.setIntIdentidad(Integer.parseInt(value));
                }
                if (columnName.equals("telefono")) {
                    ca.setIntTelefono(Integer.parseInt(value));
                }
                if (columnName.equals("Observaciones")) {
                    ca.setStrObservaciones(value);
                }
            }
            Arre.add(ca);
            intIncremento = intIncremento + 1;
        }
        return Arre;
    }

    public ArrayList<Campo> Consultar(int id) throws ClassNotFoundException, SQLException {
        Arre = new ArrayList<Campo>();
        int intIncremento = 0;
        ResultSet rs;
        rs = ManejadorFicha.Consultar(id);
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
            Campo ca = new Campo();
            for (String columnName : columns) {
                String value = rs.getString(columnName);
                if (columnName.equals("Id")) {
                    ca.setId(Integer.parseInt(value));
                }
                 if (columnName.equals("idA")) {
                    ca.setIdA(Integer.parseInt(value));
                }
                if (columnName.equals("Fecha")) {
                    ca.setDtFecha(value);
                }
                if (columnName.equals("Responsable")) {
                    ca.setStrResponsable(value);
                }
               if (columnName.equals("IdA")) {
                   ca.setIdA(Integer.parseInt(value));
                }
                if (columnName.equals("Provincia")) {
                    ca.setStrProvincia(value);
                }
                if (columnName.equals("Canton")) {
                    ca.setStrCanton(value);
                }
                if (columnName.equals("Codigo")) {
                    ca.setStrCodigo(value);
                }
                if (columnName.equals("parroquia")) {
                    ca.setStrParroquia(value);
                }
                if (columnName.equals("Localidad")) {
                    ca.setStrLocalidad(value);
                }
                if (columnName.equals("nombres")) {
                    ca.setStrNombres(value);
                }
                if (columnName.equals("apellidos")) {
                    ca.setStrApellidos(value);
                }
                if (columnName.equals("cedula")) {
                    ca.setIntIdentidad(Integer.parseInt(value));
                }
                if (columnName.equals("telefono")) {
                    ca.setIntTelefono(Integer.parseInt(value));
                }
                if (columnName.equals("Observaciones")) {
                    ca.setStrObservaciones(value);
                }
            }
            Arre.add(ca);
            intIncremento = intIncremento + 1;
        }
        return Arre;
    }

    public void Modificar(Campo ca, int id) throws ClassNotFoundException, SQLException {
        ManejadorFicha.Modificar(ca, id);
    }

    public ArrayList<Campo> ConsultarFicha(String buscar) throws ClassNotFoundException, SQLException {
        Arre = new ArrayList<Campo>();
        int intIncremento = 0;
        ResultSet rs;
        rs = ManejadorFicha.buscarFicha(buscar);
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
            Campo ca = new Campo();
            for (String columnName : columns) {
                String value = rs.getString(columnName);
               if (columnName.equals("Id")) {
                    ca.setId(Integer.parseInt(value));
                }
               if (columnName.equals("idA")) {
                    ca.setIdA(Integer.parseInt(value));
                }
                if (columnName.equals("Fecha")) {
                    ca.setDtFecha(value);
                }
                if (columnName.equals("Responsable")) {
                    ca.setStrResponsable(value);
                }
                if (columnName.equals("IdA")) {
                   ca.setIdA(Integer.parseInt(value));
                }
                if (columnName.equals("Provincia")) {
                    ca.setStrProvincia(value);
                }
                if (columnName.equals("Canton")) {
                    ca.setStrCanton(value);
                }
                if (columnName.equals("Codigo")) {
                    ca.setStrCodigo(value);
                }
                if (columnName.equals("parroquia")) {
                    ca.setStrParroquia(value);
                }
                if (columnName.equals("Localidad")) {
                    ca.setStrLocalidad(value);
                }
                if (columnName.equals("nombres")) {
                    ca.setStrNombres(value);
                }
                if (columnName.equals("apellidos")) {
                    ca.setStrApellidos(value);
                }
                if (columnName.equals("cedula")) {
                    ca.setIntIdentidad(Integer.parseInt(value));
                }
                if (columnName.equals("telefono")) {
                    ca.setIntTelefono(Integer.parseInt(value));
                }
                if (columnName.equals("Observaciones")) {
                    ca.setStrObservaciones(value);
                }

            }
            Arre.add(ca);
            intIncremento = intIncremento + 1;
        }
        return Arre;
    }

}
