
package DAT;

import CLASES.PlagasYEnfermedades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// importas java.sql
public class DATEnfer {
    //llama a la clase que crea conexion con la  BDD
    DATConexion c = new DATConexion();
      public ResultSet Consultar(int id) throws ClassNotFoundException, SQLException {
        //Objeto sirve para llamar a traves del objeto conexion el póder saber si hay como hacer esta operacion
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM enfermedadplagas WHERE  id_ficha =" +id;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
      
    public void Agregar(PlagasYEnfermedades pe) throws ClassNotFoundException, SQLException{
      Connection st = c.AbrirConexion();
       // Parte de SQL de base de datos para guardar sentencias
      PreparedStatement ps = st .prepareStatement("INSERT INTO enfermedadplagas (TIPO,NOMBRE,INCIDENCIA,PRODUCTO,DOSIS,FRECUENCIA,MES,VARIERESIS,id_ficha) VALUES (?,?,?,?,?,?,?,?,?)");
      ps.setString(1, pe.getStrTipo().toUpperCase());
      ps.setString(2, pe.getStrNombre().toUpperCase());
      ps.setString(3, pe.getStrIncidencia().toUpperCase());
      ps.setString(4, pe.getStrProducto().toUpperCase());
      ps.setString(5, pe.getStrDosis().toUpperCase());
      ps.setString(6, pe.getStrFrecuencia().toUpperCase());
      ps.setString(7, pe.getStrMes().toUpperCase());
      ps.setString(8, pe.getStrVari().toLowerCase());
      ps.setInt(9, pe.getIntId());
      //Ejecuta la  sentecia st determinada
      ps.executeUpdate();
    } 

    public int Actualizar(int id,String strIncidencia ,String strProducto,String strDosis, String strFrecuencia,String strMes,String strVariedad) throws SQLException, ClassNotFoundException{
        
        int intRetorno=0;
        Statement st= c.AbrirConexion().createStatement();
        String Sentencia= "UPDATE enfermedadplagas SET INCIDENCIA='"+strIncidencia.toUpperCase()+"',"+"PRODUCTO='"+strProducto.toUpperCase()+"',"+"DOSIS='"+strDosis.toUpperCase()+"',FRECUENCIA='"+strFrecuencia.toUpperCase()+"',MES='"+strMes.toUpperCase()+"',VARIERESIS='"+strVariedad.toUpperCase()+"'"+"WHERE id="+id;
          intRetorno = st.executeUpdate(Sentencia);
        return intRetorno;
        
    }
    
}
