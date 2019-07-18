/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAT;

import Clases.Campo;
import Clases.Componentes;
import Clases.Finca;
import Clases.Plantaciones;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dell_5437
 */
public class DATFinca {

    DATConexion c = new DATConexion();

    public void Agregar(Finca f) throws ClassNotFoundException, SQLException {
        Connection st = c.AbrirConexion();
        // Parte de SQL de base de datos para guardar sentencias
        PreparedStatement ps = st.prepareStatement("INSERT INTO fincas (idF,Nombre,SuperficieT,CultivoP,CultivoS,SupCafe,Parcela,Renueva,Causa,Cosechas) VALUES (?,?,?,?,?,?,?,?,?,?)");
        ps.setInt(1, f.getIdF());
        ps.setString(2, f.getStrNombreFinca());
        ps.setDouble(3, f.getDblSuperficieT());
        ps.setString(4, f.getStrCultivo());
        ps.setDouble(5, f.getDblSupcultivo());
        ps.setDouble(6, f.getDblSupCafe());
        ps.setDouble(7, f.getDblParcela());
        ps.setString(8, f.getStrRenueva());
        ps.setString(9, f.getStrCausa());
        ps.setInt(10, f.getIntCosechas());
        //Ejecuta la  sentecia st determinada
        ps.executeUpdate();
    }

    public void AgregarPlantas(Plantaciones p) throws ClassNotFoundException, SQLException {
        Connection st = c.AbrirConexion();
        // Parte de SQL de base de datos para guardar sentencias
        PreparedStatement ps = st.prepareStatement("INSERT INTO cosechas (idIn,Planta1,Edad1,Planta2,Edad2,Planta3,Edad3,Planta4,Edad4) VALUES (?,?,?,?,?,?,?,?,?)");
        ps.setInt(1, p.getIntId());
        ps.setString(2, p.getStrplanta1());
        ps.setString(3, p.getIndEdad1());
        ps.setString(4, p.getStrplanta2());
        ps.setString(5, p.getIndEdad2());
        ps.setString(6, p.getStrplanta3());
        ps.setString(7, p.getIndEdad3());
        ps.setString(8, p.getStrplanta4());
        ps.setString(9, p.getIndEdad4());

        //Ejecuta la  sentecia st determinada
        ps.executeUpdate();
    }

    public void AgregarProduccion(Componentes co) throws ClassNotFoundException, SQLException {
        Connection st = c.AbrirConexion();
        // Parte de SQL de base de datos para guardar sentencias
        PreparedStatement ps = st.prepareStatement("INSERT INTO componentes (idIn,Produccion,Equipos,Acceso,Tipo,Otro1,Otro2,Otro3,Otro4,Otro5,Otro6,Otro7,Otro8) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setInt(1, co.getId());
        ps.setString(2, co.getStrProduccion());
        ps.setString(3, co.getStrEquipos());
        ps.setString(4, co.getStrAcceso());
        ps.setString(5, co.getStrTipos());
        ps.setString(6, co.getStrOtro1());
        ps.setString(7, co.getStrOtro2());
        ps.setString(8, co.getStrOtro3());
        ps.setString(9, co.getStrOtro4());
        ps.setString(10, co.getStrOtro5());
        ps.setString(11, co.getStrOtro6());
        ps.setString(12, co.getStrOtro7());
        ps.setString(13, co.getStrOtro8());

        //Ejecuta la  sentecia st determinada
        ps.executeUpdate();
    }

    public void Modificar(Finca f, int id) throws ClassNotFoundException, SQLException {
        Connection st = c.AbrirConexion();
        PreparedStatement ps = st.prepareStatement("UPDATE fincas SET Nombre='" + f.getStrNombreFinca() + "', SuperficieT='" + f.getDblSuperficieT() + "',CultivoP='" + f.getStrCultivo() + "',CultivoS='" + f.getDblSupcultivo() + "',SupCafe='" + f.getDblSupCafe() + "',Parcela='" + f.getDblParcela() + "',Renueva='" + f.getStrRenueva() + "',Causa='" + f.getStrCausa() + "',Cosechas='" + f.getIntCosechas() + "' WHERE idF=" + id);
        ps.executeUpdate();
    }

    public void ModificarProduccion(Componentes co, int id) throws ClassNotFoundException, SQLException {
        Connection st = c.AbrirConexion();
        PreparedStatement ps = st.prepareStatement("UPDATE componentes SET Produccion='" + co.getStrProduccion() + "', Equipos='" + co.getStrEquipos() + "',Acceso='" + co.getStrAcceso() + "',Tipo='" + co.getStrTipos() + "',Otro1='" + co.getStrOtro1() + "',Otro2='" + co.getStrOtro2() + "',Otro3='" + co.getStrOtro3() + "',Otro4='" + co.getStrOtro4() + "',Otro5='" + co.getStrOtro5() + "',Otro6='" + co.getStrOtro6()+"',Otro7='" + co.getStrOtro7()+"',Otro8='" + co.getStrOtro8() + "' WHERE idIn=" + id);
        ps.executeUpdate();
    }

    public void ModificarPlantas(Plantaciones p, int id) throws ClassNotFoundException, SQLException {
        Connection st = c.AbrirConexion();
        PreparedStatement ps = st.prepareStatement("UPDATE cosechas SET Planta1='" + p.getStrplanta1() + "', Edad1='" + p.getIndEdad1() + "',Planta2='" + p.getStrplanta2() + "',Edad2='" + p.getIndEdad2() + "',Planta3='" + p.getStrplanta3() + "',Edad3='" + p.getIndEdad3() + "',Planta4='" + p.getStrplanta4() + "',Edad4='" + p.getIndEdad4() + "' WHERE idIn=" + id);
        ps.executeUpdate();
    }

    public ResultSet ConsultarPlantaciones(int id) throws ClassNotFoundException, SQLException {
        //Objeto sirve para llamar a traves del objeto conexion el póder saber si hay como hacer esta operacion
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM cosechas WHERE idIn = " + id;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }

    public ResultSet Consultar(int id) throws ClassNotFoundException, SQLException {
        //Objeto sirve para llamar a traves del objeto conexion el póder saber si hay como hacer esta operacion
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT id FROM fincas WHERE idF = " + id;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }

    public int ConsultaFichaExiste(int id) throws SQLException, ClassNotFoundException {
        int intResultado = 0;
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT id FROM fincas WHERE idF =" + id;
        return st.executeUpdate(Sentencia);

    }

    public ResultSet Consultara(int id) throws ClassNotFoundException, SQLException {
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT Nombre, SuperficieT, CultivoP, CultivoS, SupCafe,Parcela,Renueva,Causa,Cosechas,Produccion,Equipos,Acceso,Tipo,Otro1,Otro2,Otro3 FROM fincas F LEFT JOIN componentes C\n"
                + "ON  F.id = C.idIn WHERE idF=" + id;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }

}
