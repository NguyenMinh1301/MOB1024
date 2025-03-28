package src.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import src.Connection.Connection_ConnectorHelper;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import static src.DAO.HandleException.HandleException;
import src.Model.Model_Students;

public interface DAO_Students {

    default List<Model_Students> getAllStudents() {
        List<Model_Students> studentsList = new ArrayList<>();
        String SQL = "SELECT * FROM STUDENTS";
        try (
                Connection conn = Connection_ConnectorHelper.connection(); Statement stm = conn.createStatement(); ResultSet rs = stm.executeQuery(SQL);) {
            while (rs.next()) {
                studentsList.add(new Model_Students(
                        rs.getString("IdStudent"),
                        rs.getString("Name"),
                        rs.getString("Email"),
                        rs.getString("Phone"),
                        rs.getBoolean("Gender"),
                        rs.getString("Address"),
                        rs.getString("Avatar")
                ));
            }

        } catch (SQLException ex) {
            HandleException(ex);
        }
        return studentsList;
    }

    default List<Model_Students> getAllStudentWithIdAndName() {
        List<Model_Students> studentsList = new ArrayList<>();
        String SQL = "SELECT IdStudent, Name FROM STUDENTS;";

        try (
                Connection conn = Connection_ConnectorHelper.connection(); Statement stm = conn.createStatement(); ResultSet rs = stm.executeQuery(SQL);) {
            while (rs.next()) {
                Model_Students studentList = new Model_Students();
                studentList.setId(rs.getString("IdStudent"));
                studentList.setName(rs.getString("Name"));
                studentsList.add(studentList);
            }
        } catch (SQLException ex) {
            HandleException(ex);
        }

        return studentsList;
    }

    default int addStudent(String id, String name, String email, String phone, int gender, String address, String avatar) {
        String SQL = "INSERT INTO STUDENTS ([IdStudent], [Name], [Email], [Phone], [Gender], [Address], [Avatar]) VALUES (?,?,?,?,?,?,?)";
        int check = 0;
        try (
                Connection conn = Connection_ConnectorHelper.connection(); PreparedStatement prstm = conn.prepareStatement(SQL);) {
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

    default boolean updateStudent(String id, String name, String email, String phone, int gender, String address, String avatar) {
        String SQL = "UPDATE STUDENTS SET Name = ?, Email = ?, Phone = ?, Gender = ?, Address = ?, Avatar = ? WHERE IdStudent = ?";
        try (
                Connection conn = Connection_ConnectorHelper.connection(); PreparedStatement prstm = conn.prepareStatement(SQL);) {
            prstm.setString(1, name);
            prstm.setString(2, email);
            prstm.setString(3, phone);
            prstm.setInt(4, gender);
            prstm.setString(5, address);
            prstm.setString(6, avatar);
            prstm.setString(7, id);

            int rows = prstm.executeUpdate();
            if (rows > 0) {
                DAO_Notification.announceInfo("<html>Successfully updated student <u>" + name + "</u> !</html>");
                return true;
            }
        } catch (SQLException ex) {
            HandleException(ex);
        }
        return false;
    }

    default boolean deleteStudent(String id) {
        String SQL = "DELETE FROM STUDENTS WHERE IdStudent = ?";
        try (
                Connection conn = Connection_ConnectorHelper.connection(); PreparedStatement prstm = conn.prepareStatement(SQL);) {
            prstm.setString(1, id);
            prstm.executeUpdate();
            return true;
        } catch (SQLException ex) {
            HandleException(ex);
        }
        return false;
    }

    default boolean isDuplicate(String id) {
        String SQL = "SELECT COUNT(*) FROM STUDENTS WHERE IdStudent = ?";
        try (
                Connection conn = Connection_ConnectorHelper.connection(); PreparedStatement prstm = conn.prepareStatement(SQL);) {
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
