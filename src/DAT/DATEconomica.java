/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAT;

import Clases.Componentes;
import Clases.Socio_Economica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dell_5437
 */
public class DATEconomica {
    DATConexion c = new DATConexion();
     public void AgregarEconomica(Socio_Economica s) throws ClassNotFoundException, SQLException {
        Connection st = c.AbrirConexion();
        // Parte de SQL de base de datos para guardar sentencias
        PreparedStatement ps = st.prepareStatement("INSERT INTO economica (idIn,Contratados,Hogar,Fertilizantes,Semillas,Trasnporte) VALUES (?,?,?,?,?,?)");
        ps.setInt(1, s.getId());
        ps.setDouble(2, s.getDblContrados());
        ps.setDouble(3, s.getDblHogar());
        ps.setDouble(4, s.getDblFertilizantes());
        ps.setDouble(5, s.getDblSemillas());
        ps.setDouble(6,s.getDblTransporte());
        //Ejecuta la  sentecia st determinada
        ps.executeUpdate();
    }
    public void ModificarEconomica(Socio_Economica e,int id) throws ClassNotFoundException, SQLException {
        Connection st = c.AbrirConexion();
        PreparedStatement ps = st.prepareStatement("UPDATE economica SET Contratados='" +e.getDblContrados() + "', Hogar='"+e.getDblHogar()+"',Fertilizantes='"+e.getDblFertilizantes()+"',Semillas='"+e.getDblSemillas()+"',Trasnporte='"+e.getDblTransporte()+"'WHERE idIn=" + id );
        ps.executeUpdate();
    }
     public ResultSet Consultar(int id) throws ClassNotFoundException, SQLException {
        //Objeto sirve para llamar a traves del objeto conexion el póder saber si hay como hacer esta operacion
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM economica WHERE idIn = " + id;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
}
