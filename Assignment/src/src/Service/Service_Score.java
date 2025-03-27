package src.Service;

import java.util.List;
import src.DAO.DAO_Score;
import src.Model.Model_Score;

public class Service_Score implements DAO_Score{
    public List<Model_Score> getScoreData() {
        return getAllScores();
    }
}
