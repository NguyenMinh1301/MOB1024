package src.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorHelper extends SQL_Server {
    
    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            throw new RuntimeException("Erorr: Driver for SQL Server not found: ", ex);
        }
    }

    public static Connection connection() throws SQLException {
        return DriverManager.getConnection(ConnectURL, SQL_User, SQL_Password);
    }
}
