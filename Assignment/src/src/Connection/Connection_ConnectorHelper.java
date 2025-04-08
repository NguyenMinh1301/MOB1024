package src.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*Lớp ConnectorHelper kế thừa Connection_SQL_Server để lấy thông tin của HQT CSDL
    + ConnectURL: Đường dẫn kết nối đến database
    + SQL_User: Username
    + SQL_Password: Mật khẩu
*/
public class Connection_ConnectorHelper extends Connection_SQL_Server {
    
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
