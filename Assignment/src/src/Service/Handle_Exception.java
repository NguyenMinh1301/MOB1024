package src.Service;

import java.sql.SQLException;

/*
    Lớp quản lý các lỗi liên quan đến CSDL (DAO)
    Sử dụng interface để các lớp khác implement (sử dụng public static method mà không cần override)
*/

public interface Handle_Exception {

    public static void HandleException(SQLException ex) {
        System.out.println("Error: " + ex);
        return;
    }
}
