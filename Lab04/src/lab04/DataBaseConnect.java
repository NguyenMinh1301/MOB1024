package lab04;

import java.sql.*;

public class DataBaseConnect {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=QLSINHVIEN;trustServerCertificate=true";
    private static final String USER = "sa";
    private static final String PASSWORD = "123";
    
    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    public static void main(String[] args) {
        getConnection();
    }
}
