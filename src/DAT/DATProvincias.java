/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAT;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Dell_5437
 */
public class DATProvincias {
      //llama a la clase que crea conexion con la  BDD
    DATConexion c = new DATConexion();
    //Metodo con sentencias que permite obtener datos en la BD
    public ResultSet Consultar() throws ClassNotFoundException, SQLException {
        //Objeto sirve para llamar a traves del objeto conexion el póder saber si hay como hacer esta operacion
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM provincia ";
        //executeQuery significa que va a ejecutar la sentencia;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
      public ResultSet ConsultarCantones(String pro) throws ClassNotFoundException, SQLException
    {
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT provincia,Cantones FROM provincia P LEFT JOIN cantones C\n" +
        "ON  P.id = C.idP WHERE provincia='"+pro+"';";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }    
}
