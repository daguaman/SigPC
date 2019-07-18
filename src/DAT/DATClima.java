package DAT;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DATClima 
{
    DATConexion c = new DATConexion();
    
    public int Insertar( String strDetalle_clima,String strMes,int intIdPar) throws SQLException, ClassNotFoundException{
        int intRetorno=0;
        //Utilizando Statement
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "INSERT INTO clima (detalle_clima, mes, idParce)  VALUES ( '"+strDetalle_clima + "'," +"'"+ strMes+"',"+intIdPar+ ");" ;
        intRetorno = st.executeUpdate(Sentencia);
        c.CerrarConexion();
        return intRetorno;
    }
    
     public ResultSet Consultar_parcela(int id) throws ClassNotFoundException, SQLException
    {
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT id FROM parcela WHERE idFinca= "+id;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
     
     public ResultSet ConsultarIdParcela(int id) throws ClassNotFoundException, SQLException {
        //Objeto sirve para llamar a traves del objeto conexion el póder saber si hay como hacer esta operacion
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM parcela WHERE idFinca = " + id;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    
    public ResultSet Consultar_clima(int id) throws ClassNotFoundException, SQLException {
        //Objeto sirve para llamar a traves del objeto conexion el póder saber si hay como hacer esta operacion
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM clima WHERE idParce= " + id;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    
    
     public int Actualizar(String strDetalle_clima,String strMes,int intIdPar) throws SQLException, ClassNotFoundException{
        
        int intRetorno=0;
        Statement st= c.AbrirConexion().createStatement();
        String Sentencia= "UPDATE clima SET detalle_clima='"+strDetalle_clima+"',"+" mes='"+strMes +"WHERE idParce="+intIdPar;
        
        intRetorno = st.executeUpdate(Sentencia);
        return intRetorno;
        
    }
   
}
