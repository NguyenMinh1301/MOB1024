package src.Service;

import java.util.List;
import src.DAO.DAO_Sort;
import src.Model.Model_Score;

public class Service_Sort implements DAO_Sort {

    public List<Model_Score> sortById() {
        return getScoresSortById();
    }

    public List<Model_Score> sortByName() {
        return getScoresSortByName();
    }

    public List<Model_Score> sortByScore() {
        return getScoresSortByTotal();
    }

    public List<Model_Score> sortByAverage() {
        return getScoresSortByAverage();
    }

    public List<Model_Score> top10English() {
        return getTop10English();
    }

    public List<Model_Score> top10Computer() {
        return getTop10Computer();
    }

    public List<Model_Score> top10Physical() {
        return getTop10Physical();
    }

    public List<Model_Score> top10Average() {
        return getTop10Average();
    }
}
