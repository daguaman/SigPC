package BL;


import Clases.Parcelas1;
import Clases.Variedades;
import DAT.DATVariedades;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ruben
 */
public class BLParcela {
        DATVariedades ManejadorFinca= new DATVariedades();
     public void AgregarParcela(Parcelas1 f) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        ManejadorFinca.Agregar(f);
    }
     
     public void agregarVariedades(Variedades p) throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException{
         ManejadorFinca.AgregarPlantas(p);
     }
     public int encuentra_id() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        ResultSet rs;
        int value = 0;
        rs = ManejadorFinca.encuentraid();
        while (rs.next()) {
            value = rs.getInt(1);
        }
        return value;
    }
}
