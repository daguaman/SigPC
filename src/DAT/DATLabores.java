package DAT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DATLabores 
{
    DATConexion c = new DATConexion();
    public int Insertar(  String strDetalle_labor,String strMes,int intIdPar) throws SQLException, ClassNotFoundException
    {
        int intRetorno=0;
        //Utilizando Statement
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "INSERT INTO labores(detalle_labores, mes, idParc)  VALUES ( '"+strDetalle_labor + "'," 
                +"'"+ strMes+"',"+intIdPar+ ");" ;
                intRetorno = st.executeUpdate(Sentencia);

        /* Utilizando JDBC PREPARE STATEMENT
        String Sentencia1;
        Sentencia1 = "INSERT INTO ESTUDIANTE (Nombres, Apellidos, Identificacion) VALUES (?,?,?)";
        //"UPDATE DBUSER SET USERNAME = ? WHERE USER_ID = ?";
        PreparedStatement ps = c.AbrirConexion().prepareStatement(Sentencia1);
        ps.setString(1, strNombres);
        ps.setString(2, strApellidos);
        ps.setInt(1, intIdentificacion);
        ps.executeUpdate();*/
        c.CerrarConexion();
        return intRetorno;
   }
    
   
     
     
    public ResultSet Consultar() throws ClassNotFoundException, SQLException
    {
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT id FROM parcela;";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
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
        String Sentencia = "SELECT id FROM parcela WHERE idFinca = " + id;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    
    public ResultSet Consultar_labores(int id) throws ClassNotFoundException, SQLException {
        //Objeto sirve para llamar a traves del objeto conexion el póder saber si hay como hacer esta operacion
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM labores WHERE idParc= " + id;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
   
}
