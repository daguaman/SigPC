package DAT;
import Clases.Variedad1;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class DATMorfologia 
{
    DATConexion c =new DATConexion();
    public int Insertar (Variedad1 v) throws ClassNotFoundException, SQLException
    {
        String sentencia;
        sentencia = null;        
        sentencia ="INSERT INTO VARIEDADES (IdVariedad,VARIEDAD,MES_FLORECE,DURACION_FLORACION,MES_FRUCTIFICA,"
          + "DURACION_FRUCTIFICA,MES_COSECHA,DURACION_COSECHA,TIPO_COSECHA,"
          + "NUMERO_DIAS_COSECHA_FLORACION,EDAD_CAFETAL,COLOR_FLOR,COLOR_FRUTO,CARACTERISTICAS_VARIEDAD,"
          + "TAMANIO_CEREZA,idParcela) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";        
        PreparedStatement pst = c.AbrirConexion().prepareStatement(sentencia);
        pst.setInt(1, v.getVariedad());
        pst.setString(2, v.getStrVariedad1());
        pst.setString(3, v.getStrMesFlorece1());
        pst.setInt(4, v.getIntDuracionFloracion1());
        pst.setString (5, v.getStrMesfructifica1());
        pst.setInt(6, v.getIntDuracionFructacion1());        
        pst.setString(7, v.getStrMesCosecha1());
        pst.setString(8, v.getStrDuracionCosecha1());
        pst.setString(9, v.getStrComoCosecha1());
        pst.setString(10, v.getStrDiaFloracion1());
        pst.setInt(11, v.getIntEdadCafetal1());
        pst.setString(12, v.getStrColorFlor1());
        pst.setString(13, v.getStrColorFruto1());
        pst.setString(14, v.getStrCaracteristicas1());
        pst.setString(15, v.getStrTamanoCereza1());
        pst.setInt(16, v.getIdParcela());
        return pst.executeUpdate();        
    }
    
    public ResultSet Consultar() throws ClassNotFoundException, SQLException
    {
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM VARIEDADES";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    
    public ResultSet Consultar(int id) throws ClassNotFoundException, SQLException
    {
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM variedades WHERE ID = '" + id + "'";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
      public ResultSet ConsultarIdMorfologia(int id) throws ClassNotFoundException, SQLException {
        //Objeto sirve para llamar a traves del objeto conexion el póder saber si hay como hacer esta operacion
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT ID FROM variedades WHERE idParcela="+id;
        //executeQuery significa que va a ejecutar la sentencia;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
      public ResultSet ConsultarVariedadMorfologia(int id) throws ClassNotFoundException, SQLException {
        //Objeto sirve para llamar a traves del objeto conexion el póder saber si hay como hacer esta operacion
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT IdVariedad FROM variedades WHERE idParcela="+id;
        //executeQuery significa que va a ejecutar la sentencia;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
       public ResultSet ConsultarVariedades(int id) throws ClassNotFoundException, SQLException
    {
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM variedades WHERE idParcela ="+id;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
      
} 