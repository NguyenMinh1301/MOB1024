package src.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import src.Connection.Connection_ConnectorHelper;
import static src.DAO.HandleException.HandleException;

public interface DAO_Login {

    default String getHashedPasswordByUsername(String username) {
        String SQL = "SELECT password FROM USERS WHERE username = ?;";
        try (
                Connection conn = Connection_ConnectorHelper.connection(); PreparedStatement prstm = conn.prepareStatement(SQL);) {
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

    default boolean isExistUser(String username) {
        String SQL = "SELECT username FROM USERS WHERE username = ?;";
        try (
                Connection conn = Connection_ConnectorHelper.connection(); PreparedStatement prstm = conn.prepareStatement(SQL)) {
            prstm.setString(1, username);
            ResultSet rs = prstm.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            HandleException(ex);
        }
        return false;
    }

}
