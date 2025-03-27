package src.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import src.Connection.Connection_ConnectorHelper;
import static src.DAO.HandleException.HandleException;

public interface DAO_Login {
    
    public static boolean checkLogin(String username, String password) {
        boolean b = false;
        try {
            Connection conn = Connection_ConnectorHelper.connection();
            String SQL = "SELECT username, password FROM USERS;";
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(SQL);
            while (rs.next()) {
                if ( username.equals(rs.getString("username")) ) {
                    if ( password.equals(rs.getString("password")) ) {
                        b = true;
                    }
                }
            }
            return b;
        } catch (SQLException ex) {
            HandleException(ex);
        }
        
        return b;
    }
    
}
