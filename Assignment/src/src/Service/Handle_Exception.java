package src.Service;

import java.sql.SQLException;

public interface Handle_Exception {

    public static void HandleException(SQLException ex) {
        System.out.println("Error: " + ex);
        return;
    }
}
