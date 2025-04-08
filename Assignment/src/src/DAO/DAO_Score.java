package src.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import src.Connection.Connection_ConnectorHelper;
import src.Model.Model_Score;
import static src.Service.Handle_Exception.HandleException;

/*
    Lớp Data Access Object dùng để giao tiếp với Database
    Sử dụng interface để các lớp khác implement (sử dụng default method mà không cần override)
*/

public interface DAO_Score {

    default List<Model_Score> getAllScores() {
        List<Model_Score> scoreList = new ArrayList<>();
        String SQL = "SELECT s.IdStudent, st.Name, s.English, s.Computer, s.Physical FROM SCORES s JOIN STUDENTS st ON s.IdStudent = st.IdStudent";

        try (
                Connection conn = Connection_ConnectorHelper.connection(); 
                Statement stm = conn.createStatement(); 
                ResultSet rs = stm.executeQuery(SQL)
                
                ) {
            while (rs.next()) {
                scoreList.add(new Model_Score(
                        rs.getString("IdStudent"),
                        rs.getString("Name"),
                        rs.getFloat("English"),
                        rs.getFloat("Computer"),
                        rs.getFloat("Physical")
                ));
            }
        } catch (SQLException ex) {
            HandleException(ex);
        }

        return scoreList;
    }

    default int addScore(String id, String name, float english, float computer, float physical) {
        String SQL = "INSERT INTO SCORES (IdStudent, English, Computer, Physical) VALUES (?, ?, ?, ?);";
        int check = 0;
        try (
                Connection conn = Connection_ConnectorHelper.connection(); 
                PreparedStatement prstm = conn.prepareStatement(SQL);
                
                ) {
            prstm.setString(1, id);
            prstm.setFloat(2, english);
            prstm.setFloat(3, computer);
            prstm.setFloat(4, physical);
            prstm.executeUpdate();
            check = 1;
            return check;
        } catch (SQLException ex) {
            HandleException(ex);
        }
        return check;
    }

    default boolean updateScore(String idStudent, String name, float english, float computer, float physical) {
        String SQL = "UPDATE SCORES SET English = ?, Computer = ?, Physical = ? WHERE IdStudent = ?;";
        try (
                Connection conn = Connection_ConnectorHelper.connection(); 
                PreparedStatement prstm = conn.prepareStatement(SQL);
                
                ) {
            prstm.setFloat(1, english);
            prstm.setFloat(2, computer);
            prstm.setFloat(3, physical);
            prstm.setString(4, idStudent);

            int rows = prstm.executeUpdate();
            if (rows > 0) {
                return true;
            }
        } catch (SQLException ex) {
            HandleException(ex);
        }
        return false;
    }

    default boolean deleteScore(String idStudent) {
        String SQL = "DELETE FROM SCORES WHERE IdStudent = ?";
        try (
                Connection conn = Connection_ConnectorHelper.connection(); 
                PreparedStatement prstm = conn.prepareStatement(SQL);
                
                ) {
            prstm.setString(1, idStudent);
            prstm.executeUpdate();
            return true;
        } catch (SQLException ex) {
            HandleException(ex);
        }
        return false;
    }

    default List<Model_Score> searchScoreFromDatabase(String keyword) {
        List<Model_Score> scoreList = new ArrayList<>();
        String SQL = "SELECT s.IdStudent, st.Name, s.English, s.Computer, s.Physical "
                + "FROM SCORES s JOIN STUDENTS st ON s.IdStudent = st.IdStudent "
                + "WHERE s.IdStudent LIKE ? OR st.Name LIKE ?";

        try (
                Connection conn = Connection_ConnectorHelper.connection(); 
                PreparedStatement prstm = conn.prepareStatement(SQL)
                
                ) {
            String key = "%" + keyword + "%";
            prstm.setString(1, key);
            prstm.setString(2, key);
            ResultSet rs = prstm.executeQuery();

            while (rs.next()) {
                scoreList.add(new Model_Score(
                        rs.getString("IdStudent"),
                        rs.getString("Name"),
                        rs.getFloat("English"),
                        rs.getFloat("Computer"),
                        rs.getFloat("Physical")
                ));
            }
        } catch (SQLException ex) {
            HandleException(ex);
        }

        return scoreList;
    }

}
