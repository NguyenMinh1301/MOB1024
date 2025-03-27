package src.DAO;

import java.sql.SQLException;

public interface HandleException {
    
    public static void HandleException(SQLException ex) {
        System.out.println("Erorr: " + ex);
        return;
    }
}
