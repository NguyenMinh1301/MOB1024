package src.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import src.Connection.Connection_ConnectorHelper;
import static src.DAO.HandleException.HandleException;

public interface DAO_Register {

    default int getRoleIdByName(String roleName) {
        String SQL = "SELECT roleid FROM ROLES WHERE rolename = ?";
        try (
                Connection conn = Connection_ConnectorHelper.connection(); PreparedStatement prstm = conn.prepareStatement(SQL);) {
            prstm.setString(1, roleName);
            ResultSet rs = prstm.executeQuery();
            if (rs.next()) {
                return rs.getInt("roleid");
            }
        } catch (SQLException ex) {
            HandleException(ex);
        }
        return -1;
    }

    default boolean insertUser(String username, String hashedPassword, int roleid) {
        String SQL = "INSERT INTO USERS (username, password, roleid) VALUES (?, ?, ?);";
        try (
                Connection conn = Connection_ConnectorHelper.connection(); PreparedStatement prstm = conn.prepareStatement(SQL);) {
            prstm.setString(1, username);
            prstm.setString(2, hashedPassword);
            prstm.setInt(3, roleid);
            prstm.executeUpdate();
            return true;
        } catch (SQLException ex) {
            HandleException(ex);
        }
        return false;
    }

    default boolean isExistUser(String username) {
        String SQL = "SELECT username FROM USERS WHERE username = ?;";
        try (
                Connection conn = Connection_ConnectorHelper.connection(); PreparedStatement prstm = conn.prepareStatement(SQL);) {
            prstm.setString(1, username);
            ResultSet rs = prstm.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            HandleException(ex);
        }
        return false;
    }
}
