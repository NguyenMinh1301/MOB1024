package src.DAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import src.Connection.Connection_ConnectorHelper;
import static src.Service.Handle_Exception.HandleException;

public interface DAO_Chart {

    default List<String> getGenderList() {
        List<String> list = new ArrayList<>();
        String SQL = "SELECT Gender FROM STUDENTS;";
        try (
                Connection conn = Connection_ConnectorHelper.connection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(SQL);) {
            while (rs.next()) {
                boolean gender = rs.getBoolean("Gender");
                list.add(gender ? "Female" : "Male");
            }
        } catch (SQLException ex) {
            HandleException(ex);
        }
        return list;
    }

    default List<String> getLocationList() {
        List<String> list = new ArrayList<>();
        String SQL = "SELECT Address FROM STUDENTS;";
        try (
                Connection conn = Connection_ConnectorHelper.connection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(SQL);) {
            while (rs.next()) {
                String address = rs.getString("Address");
                list.add(address != null ? address.trim() : "Không rõ");
            }
        } catch (SQLException ex) {
            HandleException(ex);
        }
        return list;
    }

    default List<String> getEnglishScores() {
        List<String> list = new ArrayList<>();
        String SQL = "SELECT ENGLISH FROM SCORES";
        try (
                Connection conn = Connection_ConnectorHelper.connection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(SQL);) {
            while (rs.next()) {
                float score = rs.getFloat("ENGLISH");
                list.add(String.format("%.1f", score));
            }
        } catch (SQLException ex) {
            HandleException(ex);
        }
        return list;
    }

    default List<String> getComputerScores() {
        List<String> list = new ArrayList<>();
        String SQL = "SELECT COMPUTER FROM SCORES";
        try (
                Connection conn = Connection_ConnectorHelper.connection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(SQL);) {
            while (rs.next()) {
                float score = rs.getFloat("COMPUTER");
                list.add(String.format("%.1f", score));
            }
        } catch (SQLException ex) {
            HandleException(ex);
        }
        return list;
    }

    default List<String> getPhysicalScores() {
        List<String> list = new ArrayList<>();
        String SQL = "SELECT PHYSICAL FROM SCORES";
        try (
                Connection conn = Connection_ConnectorHelper.connection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(SQL);) {
            while (rs.next()) {
                float score = rs.getFloat("PHYSICAL");
                list.add(String.format("%.1f", score));
            }
        } catch (SQLException ex) {
            HandleException(ex);
        }
        return list;
    }

    default List<String> getAverageScores() {
        List<String> list = new ArrayList<>();
        String SQL = "SELECT (English + Computer + Physical)/3.0 AS AVG FROM SCORES";
        try (
                Connection conn = Connection_ConnectorHelper.connection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(SQL);) {
            while (rs.next()) {
                float avg = rs.getFloat("AVG");
                list.add(classifyScore(avg));
            }
        } catch (SQLException ex) {
            HandleException(ex);
        }
        return list;
    }

    private String classifyScore(float score) {
        if (score < 5) {
            return "Weak (<5)";
        }
        if (score < 7) {
            return "Average (5–7)";
        }
        if (score < 8.5) {
            return "Good (7–8.5)";
        }
        return "Excellent (>8.5)";
    }

}
