package DAT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DATUbicacion 
{
    DATConexion c= new DATConexion();
    public int Insertar(double dblUbicacionX, double dblUbicaciony, double dblUbicacionz, String strUbicacionwp,String strAsociacion1, String strAsociacion2, String strAsociacion3, String strAsociacion4, String strAsociacion5, String strDensidad1, String strDensidad2, String strDensidad3, String strDensidad4, String strDensidad5, String strPorque1, String strPorque2, String strPorque3, String strPorque4, String strPorque5, int idParcel) throws SQLException, ClassNotFoundException
    {
        int intRetorno=0;
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "INSERT INTO ubicacion(ubicacion_x, ubicacion_y, ubicacion_z, ubicacion_wp, asociacion1, asociacion2, asociacion3, asociacion4, asociacion5, densidad1, densidad2, densidad3, densidad4, densidad5, porque1, porque2, porque3, porque4, porque5 , idParcel)"
                + " VALUES ("+dblUbicacionX+","+ dblUbicaciony +","+dblUbicacionz+",'"+strUbicacionwp+"','"+strAsociacion1+"','"+ strAsociacion2+"','"+ strAsociacion3+"','"+ strAsociacion4+"','" +strAsociacion5 +"','"+strDensidad1+"','"+ strDensidad2+"','"+ strDensidad3+"','"+ strDensidad4+"','"+ strDensidad5+"','"+ strPorque1+"','"+ strPorque2+"','"+ strPorque3+"','"+ strPorque4+"','"+ strPorque5+"',"+idParcel+");";
        intRetorno = st.executeUpdate(Sentencia);
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
    
    public ResultSet Consultar_ubicacion(int id) throws ClassNotFoundException, SQLException {
        //Objeto sirve para llamar a traves del objeto conexion el póder saber si hay como hacer esta operacion
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM ubicacion WHERE idParcel= " + id;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
}