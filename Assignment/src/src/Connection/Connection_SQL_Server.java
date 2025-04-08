package src.Connection;

public class Connection_SQL_Server {

    public static String SQL_Url = "localhost";             //Địa chỉ Server
    public static String SQL_Port = "1433";                 //Port mặc định của SQL Server
    public static String SQL_Database = "QL_SINHVIEN";      //Tên database                    
    public static String SQL_User = "sa";                   //Username
    public static String SQL_Password = "123";              //Mật khẩu

    //Đường dẫn kết nối đến SQL Server
    static final String ConnectURL = "jdbc:sqlserver://" + SQL_Url + ":" + SQL_Port
            + ";databaseName=" + SQL_Database
            + ";encrypt=true;trustServerCertificate=true";

}
