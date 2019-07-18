package DAT;

import Clases.Campo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DATFicha {

    DATConexion c = new DATConexion();

    public void Agregar(Campo ca) throws ClassNotFoundException, SQLException {
        Connection st = c.AbrirConexion();
        
        // Parte de SQL de base de datos para guardar sentencias
        PreparedStatement ps = st.prepareStatement("INSERT INTO fichas (idA,Fecha,Responsable,Provincia,Canton,Codigo,parroquia,Localidad,nombres,apellidos,cedula,telefono,Observaciones) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
      
        ps.setInt(1, ca.getIdA());
        ps.setString(2, ca.getDtFecha());
        ps.setString(3, ca.getStrResponsable());      
        ps.setString(4, ca.getStrProvincia());
        ps.setString(5, ca.getStrCanton());
        ps.setString(6, ca.getStrCodigo());
        ps.setString(7, ca.getStrParroquia());
        ps.setString(8, ca.getStrLocalidad());
        ps.setString(9, ca.getStrNombres());
        ps.setString(10, ca.getStrApellidos());
        ps.setInt(11, ca.getIntIdentidad());
        ps.setInt(12, ca.getIntTelefono());
        ps.setString(13, ca.getStrObservaciones());
        //Ejecuta la  sentecia st determinada
        ps.executeUpdate();
        
    }
    public void AgregarAsociacion(String nombre) throws ClassNotFoundException, SQLException 
    {
        Connection st = c.AbrirConexion();
        // Parte de SQL de base de datos para guardar sentencias
        PreparedStatement ps = st.prepareStatement("INSERT INTO asociacion (Nombre) VALUES (?)");
      
        ps.setString(1, nombre);
        
        //Ejecuta la  sentecia st determinada
        ps.executeUpdate();
    }
    
    public ResultSet Consultar() throws ClassNotFoundException, SQLException {
        //Objeto sirve para llamar a traves del objeto conexion el póder saber si hay como hacer esta operacion
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM fichas ";
        //executeQuery significa que va a ejecutar la sentencia;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    
    public ResultSet ConsultarExiste(int idBusca) throws ClassNotFoundException, SQLException {
        //Objeto sirve para llamar a traves del objeto conexion el póder saber si hay como hacer esta operacion
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT count(*) FROM fichas where Id =" + idBusca;
        //executeQuery significa que va a ejecutar la sentencia;
        //ResultSet rs = st.executeQuery(Sentencia);
       ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
    
    public ResultSet Consultar(int id) throws ClassNotFoundException, SQLException {
        //Objeto sirve para llamar a traves del objeto conexion el póder saber si hay como hacer esta operacion
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM fichas WHERE Id = " + id;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
     public ResultSet ConsultarAsociacion() throws ClassNotFoundException, SQLException {
        //Objeto sirve para llamar a traves del objeto conexion el póder saber si hay como hacer esta operacion
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM asociacion ";
        //executeQuery significa que va a ejecutar la sentencia;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
      public ResultSet ConsultarAsociacion(int id) throws ClassNotFoundException, SQLException {
        //Objeto sirve para llamar a traves del objeto conexion el póder saber si hay como hacer esta operacion
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM asociacion WHERE id='"+id+"'";
        //executeQuery significa que va a ejecutar la sentencia;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
      public ResultSet ConsultarAsociacion(String nombre) throws ClassNotFoundException, SQLException {
        //Objeto sirve para llamar a traves del objeto conexion el póder saber si hay como hacer esta operacion
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM asociacion WHERE Nombre='"+nombre+"'";
        //executeQuery significa que va a ejecutar la sentencia;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
       public ResultSet ConsultarIdAsociacion(int id) throws ClassNotFoundException, SQLException {
        //Objeto sirve para llamar a traves del objeto conexion el póder saber si hay como hacer esta operacion
        Statement st = c.AbrirConexion().createStatement();
        String Sentencia = "SELECT * FROM asociacion WHERE id='"+id+"'";
        //executeQuery significa que va a ejecutar la sentencia;
        ResultSet rs = st.executeQuery(Sentencia);
        return rs;
    }
     public void Modificar(Campo ca,int id) throws ClassNotFoundException, SQLException {
        Connection st = c.AbrirConexion();
        PreparedStatement ps = st.prepareStatement("UPDATE fichas SET idA='"+ca.getIdA()+"',Fecha='" +ca.getDtFecha() + "', Responsable='"+ca.getStrResponsable()+"',Provincia='"+ca.getStrProvincia()+"',Canton='"+ca.getStrCanton()+"',Codigo='"+ca.getStrCodigo()+"',parroquia='"+ca.getStrParroquia()+"',Localidad='"+ca.getStrLocalidad()+"',nombres='"+ca.getStrNombres()+"',apellidos='"+ca.getStrApellidos()+"',cedula='"+ca.getIntIdentidad()+"',telefono='"+ca.getIntTelefono()+"',Observaciones='"+ca.getStrObservaciones()+"' WHERE id=" + id );
        ps.executeUpdate();
    }
     public ResultSet buscarFicha(String buscar) throws SQLException, ClassNotFoundException{
         Statement st= c.AbrirConexion().createStatement();
        String sentencia= "SELECT * FROM fichas WHERE Codigo like '%" + buscar + "%'";
        ResultSet rs= st.executeQuery(sentencia);
        return rs;
     }
}
