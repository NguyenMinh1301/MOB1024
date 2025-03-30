package src.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import src.Connection.Connection_ConnectorHelper;
import static src.Service.Handle_Exception.HandleException;
import src.Model.Model_Score;

public interface DAO_Sort {

    default List<Model_Score> getScoresSortById() {
        List<Model_Score> list = new ArrayList<>();
        String SQL = """
        SELECT S.IdStudent, ST.Name, S.English, S.Computer, S.Physical
            FROM SCORES S
            JOIN STUDENTS ST ON S.IdStudent = ST.IdStudent
            ORDER BY S.IdStudent ASC;
        """;
        try (
                Connection conn = Connection_ConnectorHelper.connection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(SQL);) {
            while (rs.next()) {
                list.add(new Model_Score(
                        rs.getString("IdStudent"),
                        rs.getString("Name"),
                        rs.getFloat("English"),
                        rs.getFloat("Computer"),
                        rs.getFloat("Physical")
                ));
            }
        } catch (SQLException e) {
            HandleException(e);
        }
        return list;
    }

    default List<Model_Score> getScoresSortByName() {
        List<Model_Score> list = new ArrayList<>();
        String SQL = """
            SELECT S.IdStudent, ST.Name, S.English, S.Computer, S.Physical
            FROM SCORES S
            JOIN STUDENTS ST ON S.IdStudent = ST.IdStudent
            ORDER BY ST.Name ASC;
        """;
        try (
                Connection conn = Connection_ConnectorHelper.connection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(SQL);) {
            while (rs.next()) {
                list.add(new Model_Score(
                        rs.getString("IdStudent"),
                        rs.getString("Name"),
                        rs.getFloat("English"),
                        rs.getFloat("Computer"),
                        rs.getFloat("Physical")
                ));
            }
        } catch (SQLException e) {
            HandleException(e);
        }
        return list;
    }

    default List<Model_Score> getScoresSortByTotal() {
        List<Model_Score> list = new ArrayList<>();
        String SQL = """
            SELECT S.IdStudent, ST.Name, S.English, S.Computer, S.Physical
            FROM SCORES S
            JOIN STUDENTS ST ON S.IdStudent = ST.IdStudent
            ORDER BY (S.English + S.Computer + S.Physical) DESC;
        """;
        try (
                Connection conn = Connection_ConnectorHelper.connection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(SQL);) {
            while (rs.next()) {
                list.add(new Model_Score(
                        rs.getString("IdStudent"),
                        rs.getString("Name"),
                        rs.getFloat("English"),
                        rs.getFloat("Computer"),
                        rs.getFloat("Physical")
                ));
            }
        } catch (SQLException e) {
            HandleException(e);
        }
        return list;
    }

    default List<Model_Score> getScoresSortByAverage() {
        List<Model_Score> list = new ArrayList<>();
        String SQL = """
            SELECT S.IdStudent, ST.Name, S.English, S.Computer, S.Physical,
                   (S.English + S.Computer + S.Physical)/3.0 AS AVG_SCORE
            FROM SCORES S
            JOIN STUDENTS ST ON S.IdStudent = ST.IdStudent
            ORDER BY AVG_SCORE DESC;
        """;
        try (
                Connection conn = Connection_ConnectorHelper.connection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(SQL);) {
            while (rs.next()) {
                list.add(new Model_Score(
                        rs.getString("IdStudent"),
                        rs.getString("Name"),
                        rs.getFloat("English"),
                        rs.getFloat("Computer"),
                        rs.getFloat("Physical")
                ));
            }
        } catch (SQLException e) {
            HandleException(e);
        }
        return list;
    }

    default List<Model_Score> getTop10English() {
        List<Model_Score> list = new ArrayList<>();
        String SQL = """
            SELECT TOP 10 S.IdStudent, ST.Name, S.English, S.Computer, S.Physical
            FROM SCORES S
            JOIN STUDENTS ST ON S.IdStudent = ST.IdStudent
            ORDER BY S.English DESC
        """;
        try (
                Connection conn = Connection_ConnectorHelper.connection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(SQL);) {
            while (rs.next()) {
                list.add(new Model_Score(
                        rs.getString("IdStudent"),
                        rs.getString("Name"),
                        rs.getFloat("English"),
                        rs.getFloat("Computer"),
                        rs.getFloat("Physical")
                ));
            }
        } catch (SQLException e) {
            HandleException(e);
        }
        return list;
    }

    default List<Model_Score> getTop10Computer() {
        List<Model_Score> list = new ArrayList<>();
        String SQL = """
            SELECT TOP 10 S.IdStudent, ST.Name, S.English, S.Computer, S.Physical
            FROM SCORES S
            JOIN STUDENTS ST ON S.IdStudent = ST.IdStudent
            ORDER BY S.Computer DESC
        """;
        try (
                Connection conn = Connection_ConnectorHelper.connection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(SQL);) {
            while (rs.next()) {
                list.add(new Model_Score(
                        rs.getString("IdStudent"),
                        rs.getString("Name"),
                        rs.getFloat("English"),
                        rs.getFloat("Computer"),
                        rs.getFloat("Physical")
                ));
            }
        } catch (SQLException e) {
            HandleException(e);
        }
        return list;
    }

    default List<Model_Score> getTop10Physical() {
        List<Model_Score> list = new ArrayList<>();
        String SQL = """
            SELECT TOP 10 S.IdStudent, ST.Name, S.English, S.Computer, S.Physical
            FROM SCORES S
            JOIN STUDENTS ST ON S.IdStudent = ST.IdStudent
            ORDER BY S.Physical DESC
        """;
        try (
                Connection conn = Connection_ConnectorHelper.connection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(SQL);) {
            while (rs.next()) {
                list.add(new Model_Score(
                        rs.getString("IdStudent"),
                        rs.getString("Name"),
                        rs.getFloat("English"),
                        rs.getFloat("Computer"),
                        rs.getFloat("Physical")
                ));
            }
        } catch (SQLException e) {
            HandleException(e);
        }
        return list;
    }

    default List<Model_Score> getTop10Average() {
        List<Model_Score> list = new ArrayList<>();
        String SQL = """
            SELECT TOP 10 S.IdStudent, ST.Name, S.English, S.Computer, S.Physical,
                (S.English + S.Computer + S.Physical)/3.0 AS AvgScore
            FROM SCORES S
            JOIN STUDENTS ST ON S.IdStudent = ST.IdStudent
            ORDER BY AvgScore DESC
        """;
        try (
                Connection conn = Connection_ConnectorHelper.connection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(SQL);) {
            while (rs.next()) {
                list.add(new Model_Score(
                        rs.getString("IdStudent"),
                        rs.getString("Name"),
                        rs.getFloat("English"),
                        rs.getFloat("Computer"),
                        rs.getFloat("Physical")
                ));
            }
        } catch (SQLException e) {
            HandleException(e);
        }
        return list;
    }

}
