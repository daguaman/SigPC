package DAT;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DATConexion {

    public static Connection con;

    public Connection getConnection() throws ClassNotFoundException {
        try {
            String driver = "com.mysql.jdbc.Driver";
            Class.forName(driver);
            //con = DriverManager.getConnection("jdbc:mysql://localhost:3306/morfologia", "root", "JONNY023");
//            con = DriverManager.getConnection("jdbc:mysql://localhost/proyecto", "root", "enrique952011");
            con = DriverManager.getConnection("jdbc:mysql://localhost/proyecto", "root", "enrique952011");
        } catch (SQLException e) {
            e.getErrorCode();
        }
        return con;
    }

    public Connection AbrirConexion() throws ClassNotFoundException, SQLException {
        con = getConnection();
        return con;
    }

    public void CerrarConexion() throws SQLException {
        con.close();

    }
}
