package src.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import src.Connection.Connection_ConnectorHelper;
import src.Model.Model_User;
import static src.Service.Handle_Exception.HandleException;

/*
    Lớp Data Access Object dùng để giao tiếp với Database
    Sử dụng interface để các lớp khác implement (sử dụng default method mà không cần override)
*/

public interface DAO_Login {

    default String getHashedPasswordByUsername(String username) {
        String SQL = "SELECT password FROM USERS WHERE username = ?;";
        try (
                Connection conn = Connection_ConnectorHelper.connection(); 
                PreparedStatement prstm = conn.prepareStatement(SQL);
                
                ) {
            prstm.setString(1, username);
            ResultSet rs = prstm.executeQuery();
            if (rs.next()) {
                return rs.getString("password");
            }
        } catch (SQLException ex) {
            HandleException(ex);
        }
        return null;
    }

    default Model_User getUserByUsernameFull(String username) {
        String SQL = "SELECT * FROM USERS WHERE username = ?";
        try (
                Connection conn = Connection_ConnectorHelper.connection(); 
                PreparedStatement ps = conn.prepareStatement(SQL)) {
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String password = rs.getString("password");
                int role = rs.getInt("roleid");
                return new Model_User(username, password, role);
            }
        } catch (SQLException ex) {
            HandleException(ex);
        }
        return null;
    }

    default boolean isExistUser(String username) {
        String SQL = "SELECT username FROM USERS WHERE username = ?;";
        try (
                Connection conn = Connection_ConnectorHelper.connection(); 
                PreparedStatement prstm = conn.prepareStatement(SQL)) {
            prstm.setString(1, username);
            ResultSet rs = prstm.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            HandleException(ex);
        }
        return false;
    }

}
