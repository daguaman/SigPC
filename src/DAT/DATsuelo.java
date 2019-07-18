package DAT;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DATsuelo {
    
      DATConexion c= new DATConexion();
      
       public int Insertar(double dblUbicacionX, double dblUbicacionY, double dblUbicacionZ,String strUbicacionWP, String strCultivoAnterior, int intMuestra, int intProfundidad, int intNumeroMuestra, int intPendiente, int intRocas, String strEstructura, String strGrado, String strFoliar, String strObservaciones,int idFicha) throws SQLException, ClassNotFoundException{
        int intRetorno=0;
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "INSERT INTO suelo(ubicacion_x, ubicacion_y, ubicacion_z, ubicacion_wp, cultivo_anterior, muestra, profundidad, numero_muestra, pendiente, rocas, estructura, grado, foliar, observaciones,idFicha)"
                + " VALUES ("+dblUbicacionX+","+dblUbicacionY+","+dblUbicacionZ+",'"+strUbicacionWP+"','"+strCultivoAnterior+"',"+intMuestra+","+intProfundidad+","+intNumeroMuestra+","+intPendiente+","+intRocas+",'"+strEstructura+"','"+strGrado+"','"+strFoliar+"','"+strObservaciones+"'"+","+idFicha+");";
        intRetorno = st.executeUpdate(Sentencia);
        return intRetorno;
    }
       
        public ResultSet Consultar() throws ClassNotFoundException, SQLException
    {
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM suelo";
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }

    public int Actualizar(int id ,double dblUbicacionX, double dblUbicacionY, double dblUbicacionZ, String strUbicacionWP, String strCultivoAnterior, int intMuestra, int intProfundidad, int intNumeroMuestra, int intPendiente, int intRocas, String strEstructura, String strGrado, String strFoliar, String strObservaciones) throws SQLException, ClassNotFoundException{
        
        int intRetorno=0;
        Statement st= c.AbrirConexion().createStatement();
        String Sentencia= "UPDATE suelo SET ubicacion_x="+dblUbicacionX+","+"ubicacion_y="+dblUbicacionY+","+"ubicacion_z="+dblUbicacionZ+",ubicacion_wp='"+strUbicacionWP+"',cultivo_anterior='"+strCultivoAnterior+"',muestra="+intMuestra+",profundidad="+intProfundidad+",numero_muestra="+intNumeroMuestra+",pendiente="+intPendiente+",rocas="+intRocas+",estructura='"+strEstructura+"',grado='"+strGrado+"',foliar='"+strFoliar+"',observaciones='"+strObservaciones+"'"+"WHERE idFicha ="+id;
        
        intRetorno = st.executeUpdate(Sentencia);
        return intRetorno;   
    }   
    public ResultSet Consultar_Suelo(int id) throws ClassNotFoundException, SQLException {
        //Objeto sirve para llamar a traves del objeto conexion el póder saber si hay como hacer esta operacion
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM suelo WHERE idFicha = " + id;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
}