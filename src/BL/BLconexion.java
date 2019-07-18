package BL;

import DAT.DATConexion;
import java.sql.SQLException;

public class BLconexion {
    DATConexion  ManejadorConexion= new DATConexion();
    
    public void CerrarConexion()throws SQLException{
        ManejadorConexion.CerrarConexion();
    }
   
}
