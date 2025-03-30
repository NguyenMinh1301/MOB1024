package src.Connection;

public class Connection_SQL_Server {

    public static String SQL_Url = "localhost";
    public static String SQL_Port = "1433";
    public static String SQL_Database = "QL_SINHVIEN";
    public static String SQL_User = "sa";
    public static String SQL_Password = "123";

    static final String ConnectURL = "jdbc:sqlserver://" + SQL_Url + ":" + SQL_Port
            + ";databaseName=" + SQL_Database
            + ";encrypt=true;trustServerCertificate=true";

}
