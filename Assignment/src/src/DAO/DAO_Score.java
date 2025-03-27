package src.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import src.Connection.Connection_ConnectorHelper;
import src.Model.Model_Score;
import static src.DAO.HandleException.HandleException;

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
}
