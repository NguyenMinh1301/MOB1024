package lab04;

import java.sql.*;

public class DataBaseConnect {

    private static final String host = "localhost:1433";          //Địa chỉ CSDL
    private static final String database = "QLSINHVIEN";        //Tên Database
    private static final String user = "sa";                    //Tên tài khoản SQL Server
    private static final String password = "123";    //Mật khẩu SQL Server
    private static final String url = "jdbc:sqlserver://" + host + ";databaseName=" + database + ";trustServerCertificate=true";

    //Phương thức kết nối database
    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); //Sử dụng cho những phiên bản thấp hơn
            return DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            throw new RuntimeException("Lỗi kết nối: " + e.getMessage(), e);
        }
    }
}
