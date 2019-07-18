package DAT;
import Clases.Parcelas1;
import Clases.Variedades;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DATVariedades 
{
    DATConexion c = new DATConexion();
    public void Agregar(Parcelas1 f) throws ClassNotFoundException, SQLException 
    {
        Connection st = c.AbrirConexion();
        // Parte de SQL de base de datos para guardar sentencias
        PreparedStatement ps = st.prepareStatement("INSERT INTO parcela (superficie,numeroPlantas,marcoPlantacion,semilla,produccionAnual,razon,idFinca) VALUES (?,?,?,?,?,?,?)");
//      ps.setInt(1, f.getIntIdp());
        ps.setString(1, f.getStrSuperficie());
        ps.setInt(2, f.getIntNumeroPlantas());
        ps.setDouble(3, f.getIntMarcoPlantacion());
        ps.setString(4, f.getStrSemilla());
        ps.setString(5, f.getStrProduccionAnual());
        ps.setString(6, f.getStrRazonDeSiembra());
        ps.setInt(7, f.getIdFinca());
        //Ejecuta la  sentecia st determinada
        ps.executeUpdate();
    }
    
    public void AgregarPlantas(Variedades p) throws ClassNotFoundException, SQLException
    {
        Connection st = c.AbrirConexion();
        // Parte de SQL de base de datos para guardar sentencias
        PreparedStatement ps = st.prepareStatement("INSERT INTO variedad(Planta1,Edad1,tipoedad1,Planta2,Edad2,tipoedad2,Planta3,Edad3,tipoedad3,Planta4,Edad4,tipoedad4, idpar) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
        ps.setString(1, p.getStrVariedad1());
        ps.setInt(2, p.getIntEdadVariedad1());
        ps.setString(3, p.getStrOpcionEdad1());
        ps.setString(4, p.getStrVariedad2());
        ps.setInt(5, p.getIntEdadVariedad2());
        ps.setString(6, p.getStrOpcionEdad2());
        ps.setString(7, p.getStrVariedad3());
        ps.setInt(8, p.getIntEdadVariedad3());
        ps.setString(9, p.getStrOpcionEdad3());
        ps.setString(10, p.getStrVariedad4());
        ps.setInt(11, p.getIntEdadVariedad4());
        ps.setString(12, p.getStrOpcionEdad4());
        ps.setInt(13, p.getIntIdParcela());
        //Ejecuta la  sentecia st determinada
        ps.executeUpdate();
    }
  
    public ResultSet encuentraid() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException
    {
        Statement st = c.AbrirConexion().createStatement();
        String sentencia = "SELECT MAX(id) AS id FROM informacion";
        ResultSet rs = st.executeQuery(sentencia);
        return rs;
    }    
}