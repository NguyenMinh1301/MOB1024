package src.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import src.Connection.ConnectorHelper;
import java.sql.ResultSet;
import static src.DAO.HandleException.HandleException;

public interface DAO_Students {

    default int addStudent(String id, String name, String email, String phone, int gender, String address, String avatar) {
        String SQL = "INSERT INTO STUDENTS ([IdStudent], [Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (?,?,?,?,?,?,?)";
        int check = 0;
        try (
                Connection conn = ConnectorHelper.connection(); PreparedStatement prstm = conn.prepareStatement(SQL);) {
            prstm.setString(1, id);
            prstm.setString(2, name);
            prstm.setString(3, email);
            prstm.setString(4, phone);
            prstm.setInt(5, gender);
            prstm.setString(6, address);
            prstm.setString(7, avatar);
            prstm.executeUpdate();
            check = 1;
            DAO_Notification.announceInfo("<html>Successfully added student <u>" + name + "</u> !</html>");
            return check;
        } catch (SQLException ex) {
            HandleException(ex);
        }
        return check;
    }

    default boolean isDuplicate(String id) {
        String SQL = "SELECT COUNT(*) FROM STUDENTS WHERE id = ?";
        try (
                Connection conn = ConnectorHelper.connection(); PreparedStatement prstm = conn.prepareStatement(SQL);) {
            prstm.setString(1, id);
            ResultSet rs = prstm.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException ex) {
            HandleException(ex);
        }
        return false;
    }
}
