package BL;

import DAT.DATConexion;
import DAT.DATsuelo;
import clases.suelo;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import java.util.ArrayList;

public class BLsuelo {

    DATsuelo ManejadorSuelo = new DATsuelo();
    public static ArrayList<suelo> lstProductos;
    DATConexion cc = new DATConexion();
    ArrayList<suelo> ArrS;
    //Para el Arreglo de Objetos

    public int Insertar(ArrayList<suelo> e) throws SQLException, ClassNotFoundException {
        int intRetorno = 0;
        for (int i = 0; i < e.size(); i++) {
            intRetorno = ManejadorSuelo.Insertar(e.get(i).getDblUbicacionX(), e.get(i).getDblUbicacionY(), e.get(i).getDblUbicacionZ(), e.get(i).getStrUbicacionWP(), e.get(i).getStrCultivoAnterior(), e.get(i).getIntMuestra(), e.get(i).getIntProfundidad(), e.get(i).getIntNumeroMuestra(), e.get(i).getIntPendiente(), e.get(i).getIntRocas(), e.get(i).getStrEstructura(), e.get(i).getStrGrado(), e.get(i).getStrFoliar(), e.get(i).getStrObservaciones(), e.get(i).getIntId());
        }

        return intRetorno;
    }

        //Descompone lo que viene en el ArrayList de Estudiantes par apoderlos procesar uno a uno.
    public ArrayList<suelo> Consultar() throws ClassNotFoundException, SQLException {

        int intIncremento = 0;
        ResultSet rs;
        int intId = 0;
        double dblUbicacionX = 0;
        double dblUbicacionY = 0;
        double dblUbicacionZ = 0;
        String strUbicacionWP = null;
        String strCultivoAnterior = null;
        int intMuestra = 0;
        int intProfundidad = 0;
        int intNumeroMuestra = 0;
        int intPendiente = 0;
        int intRocas = 0;
        String strEstructura = null;
        String strGrado = null;
        String strFoliar = null;
        String strObservaciones = null;

        lstProductos = new ArrayList<>();
        rs = ManejadorSuelo.Consultar();
        ResultSetMetaData rm = rs.getMetaData();
        //Recupera los campos de la tabla
        int columnCount = rm.getColumnCount();
        ArrayList<String> columns = new ArrayList<>();
        for (int i = 1; i <= columnCount; i++) {
            String columnName = rm.getColumnName(i);
            columns.add(columnName);
        }
        //Envia los datos a la Clase
        while (rs.next()) {
            for (String columnName : columns) {
                String value = rs.getString(columnName);
                if (columnName.equals("id")) {
                    intId = Integer.parseInt(value);
                }
                if (columnName.equals("ubicacion_x")) {
                    dblUbicacionX = Double.parseDouble(value);
                }
                if (columnName.equals("ubicacion_y")) {
                    dblUbicacionY = Double.parseDouble(value);
                }
                if (columnName.equals("ubicacion_z")) {
                    dblUbicacionZ = Double.parseDouble(value);
                }
                if (columnName.equals("ubicacion_wp")) {
                    strUbicacionWP = (value);
                }
                if (columnName.equals("cultivo_anterior")) {
                    strCultivoAnterior = value;
                }
                if (columnName.equals("muestra")) {
                    intMuestra = Integer.parseInt(value);
                }
                if (columnName.equals("profundidad")) {
                    intProfundidad = Integer.parseInt(value);
                }
                if (columnName.equals("numero_muestra")) {
                    intNumeroMuestra = Integer.parseInt(value);
                }
                if (columnName.equals("pendiente")) {
                    intPendiente = Integer.parseInt(value);
                }
                if (columnName.equals("rocas")) {
                    intRocas = Integer.parseInt(value);
                }
                if (columnName.equals("estructura")) {
                    strEstructura = value;
                }
                if (columnName.equals("grado")) {
                    strGrado = value;
                }
                if (columnName.equals("foliar")) {
                    strFoliar = value;
                }
                if (columnName.equals("observaciones")) {
                    strObservaciones = value;
                }

            }
            try {
                suelo s = new suelo(intId, dblUbicacionX, dblUbicacionY, dblUbicacionZ, strUbicacionWP, strCultivoAnterior, intMuestra, intProfundidad, intNumeroMuestra, intPendiente, intRocas, strEstructura, strGrado, strFoliar, strObservaciones);

                lstProductos.add(s);
            } catch (Exception ex) {
                String msn = ex.getMessage();
            }
        }
        //Metodo para cerrar la conexion de la BDD, siempre cerramos luego que ya lo tenemos en un objeto para manipularlos
        CerrarConexionBDD();
        return lstProductos;
    }

    public int Actualizar(int id, double dblUbicacionX, double dblUbicacionY, double dblUbicacionZ, String strUbicacionWP, String strCultivoAnterior, int intMuestra, int intProfundidad, int intNumeroMuestra, int intPendiente, int intRocas, String strEstructura, String strGrado, String strFoliar, String strObservaciones) throws ClassNotFoundException, SQLException {
        return ManejadorSuelo.Actualizar(id, dblUbicacionX, dblUbicacionY, dblUbicacionZ, strUbicacionWP, strCultivoAnterior, intMuestra, intProfundidad, intNumeroMuestra, intPendiente, intRocas, strEstructura, strGrado, strFoliar, strObservaciones);

    }

    public void CerrarConexionBDD() throws SQLException {
        cc.CerrarConexion();
    }

    public ArrayList<suelo> Consultar_suelo(int id) throws ClassNotFoundException, SQLException {
        ArrS = new ArrayList<suelo>();
        int intIncremento = 0;
        ResultSet rs;
        rs = ManejadorSuelo.Consultar_Suelo(id);
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
            suelo s = new suelo();
            for (String columnName : columns) {
                String value = rs.getString(columnName);
                if (columnName.equals("UBICACION_X")) {
                    s.setDblUbicacionX(Double.parseDouble(value));
                }
                if (columnName.equals("UBICACION_Y")) {
                   s.setDblUbicacionY(Double.parseDouble(value));
                }
                if (columnName.equals("UBICACION_Z")) {
                    s.setDblUbicacionZ(Double.parseDouble(value));
                }
                if (columnName.equals("UBICACION_WP")) {
                    s.setStrUbicacionWP(value);
                }
                if (columnName.equals("CULTIVO_ANTERIOR")) {
                    s.setStrCultivoAnterior(value);
                }
                 if (columnName.equals("MUESTRA")) {
                    s.setIntMuestra(Integer.parseInt(value));
                }
                  if (columnName.equals("PROFUNDIDAD")) {
                    s.setIntProfundidad(Integer.parseInt(value));
                }
                   if (columnName.equals("NUMERO_MUESTRA")) {
                    s.setIntNumeroMuestra(Integer.parseInt(value));
                }
                    if (columnName.equals("PENDIENTE")) {
                    s.setIntPendiente(Integer.parseInt(value));
                }
                     if (columnName.equals("ROCAS")) {
                    s.setIntRocas(Integer.parseInt(value));
                }
                      if (columnName.equals("ESTRUCTURA")) {
                    s.setStrEstructura(value);
                }
                       if (columnName.equals("GRADO")) {
                    s.setStrGrado(value);
                }
                        if (columnName.equals("FOLIAR")) {
                    s.setStrFoliar(value);
                }
                         if (columnName.equals("OBSERVACIONES")) {
                    s.setStrObservaciones(value);
                }

            }
            ArrS.add(s);
            intIncremento = intIncremento + 1;
        }
        return ArrS;
    }
}
