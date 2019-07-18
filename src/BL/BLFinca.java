/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BL;

import Clases.Asociaciones;
import Clases.Campo;
import Clases.Componentes;
import Clases.Finca;
import Clases.Plantaciones;
import DAT.DATFinca;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Dell_5437
 */
public class BLFinca {

    DATFinca ManejadorFinca = new DATFinca();
    ArrayList<Componentes> Arre;
    ArrayList<Finca> ArrF;
    ArrayList<Plantaciones> ArrP;

    public void AgregarFinca(Finca f) throws ClassNotFoundException, SQLException {
        ManejadorFinca.Agregar(f);
    }

    public void agregarProduccion(Componentes co) throws ClassNotFoundException, SQLException {
        ManejadorFinca.AgregarProduccion(co);
    }

    public void agregarPlantas(Plantaciones p) throws ClassNotFoundException, SQLException {
        ManejadorFinca.AgregarPlantas(p);
    }

    public void Modificar(Finca f, int id) throws ClassNotFoundException, SQLException {
        ManejadorFinca.Modificar(f, id);
    }

    public void ModificarProduccion(Componentes co, int id) throws ClassNotFoundException, SQLException {
        ManejadorFinca.ModificarProduccion(co, id);
    }

    public void ModificarPlantas(Plantaciones p, int id) throws ClassNotFoundException, SQLException {
        ManejadorFinca.ModificarPlantas(p, id);
    }

    public int exite_finca(int id) throws SQLException, ClassNotFoundException {
        ResultSet rs;
        int value = 0;
        rs = ManejadorFinca.Consultar(id);
        while (rs.next()) {
            value = rs.getInt(1);
        }
        return value;
    }

    public ArrayList<Componentes> Consultar(int id) throws ClassNotFoundException, SQLException {
        Arre = new ArrayList<Componentes>();
        int intIncremento = 0;
        ResultSet rs;
        rs = ManejadorFinca.Consultara(id);
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
            Componentes c = new Componentes();
            for (String columnName : columns) {
                String value = rs.getString(columnName);

                if (columnName.equals("Nombre")) {
                    c.setStrNombreFinca(value);
                }
                if (columnName.equals("SuperficieT")) {
                    c.setDblSuperficieT(Double.parseDouble(value));
                }
                if (columnName.equals("CultivoP")) {
                    c.setStrCultivo(value);
                }
                if (columnName.equals("CultivoS")) {
                    c.setDblSupcultivo(Double.parseDouble(value));
                }
                if (columnName.equals("SupCafe")) {
                    c.setDblSupCafe(Double.parseDouble(value));
                }
                if (columnName.equals("Parcela")) {
                    c.setDblParcela(Double.parseDouble(value));
                }
                if (columnName.equals("Renueva")) {
                    c.setStrRenueva(value);
                }
                if (columnName.equals("Causa")) {
                    c.setStrCausa(value);
                }
                if (columnName.equals("Cosechas")) {
                    c.setIntCosechas(Integer.parseInt(value));
                }
                if (columnName.equals("Produccion")) {
                    c.setStrProduccion(value);
                }
                if (columnName.equals("Equipos")) {
                    c.setStrEquipos(value);
                }
                if (columnName.equals("Acceso")) {
                    c.setStrAcceso(value);
                }
                if (columnName.equals("Tipo")) {
                    c.setStrTipos(value);
                }
                if (columnName.equals("Otro1")) {
                    c.setStrOtro1(value);
                }
                if (columnName.equals("Otro2")) {
                    c.setStrOtro2(value);
                }
                if (columnName.equals("Otro3")) {
                    c.setStrOtro3(value);
                }
                if (columnName.equals("Otro4")) {
                    c.setStrOtro4(value);
                }
                if (columnName.equals("Otro5")) {
                    c.setStrOtro5(value);
                }
                if (columnName.equals("Otro6")) {
                    c.setStrOtro6(value);
                }
                if (columnName.equals("Otro7")) {
                    c.setStrOtro7(value);
                }
                if (columnName.equals("Otro8")) {
                    c.setStrOtro8(value);
                }

            }
            Arre.add(c);
            intIncremento = intIncremento + 1;
        }
        return Arre;
    }

    public ArrayList<Plantaciones> ConsultarPlantaciones(int id) throws ClassNotFoundException, SQLException {
        ArrP = new ArrayList<Plantaciones>();
        int intIncremento = 0;
        ResultSet rs;
        rs = ManejadorFinca.ConsultarPlantaciones(id);
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
            Plantaciones p = new Plantaciones();
            for (String columnName : columns) {
                String value = rs.getString(columnName);

                if (columnName.equals("Planta1")) {
                    p.setStrplanta1(value);
                }
                if (columnName.equals("Edad1")) {
                    p.setIndEdad1(value);
                }
                if (columnName.equals("Planta2")) {
                    p.setStrplanta2(value);
                }
                if (columnName.equals("Edad2")) {
                    p.setIndEdad2(value);
                }
                if (columnName.equals("Planta3")) {
                    p.setStrplanta3(value);
                }
                if (columnName.equals("Edad4")) {
                    p.setIndEdad3(value);
                }
                if (columnName.equals("Planta4")) {
                    p.setStrplanta4(value);
                }
                if (columnName.equals("Edad4")) {
                    p.setIndEdad4(value);
                }

            }
            ArrP.add(p);
            intIncremento = intIncremento + 1;
        }
        return ArrP;
    }

}
