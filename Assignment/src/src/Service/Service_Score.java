package src.Service;

import java.util.List;
import src.DAO.DAO_Score;
import src.Model.Model_Score;
import src.Service.Handle_Notification;

public class Service_Score implements DAO_Score {

    public List<Model_Score> getScoreData() {
        return getAllScores();
    }

    public List<Model_Score> searchScore(String keyword) {
        return searchScoreFromDatabase(keyword);
    }

    public boolean addCheck(String idStudent, String name, String english, String computer, String physical) {
        boolean b = false;

        try {
            if (idStudent.length() <= 0) {
                Handle_Notification.announceWarning("<html>You have not entered <b>ID</b> score</html>");
                return b;
            }

            if (name.length() <= 0) {
                Handle_Notification.announceWarning("<html>You have not entered <b>Name</b> score</html>");
                return b;
            }

            if (english.length() <= 0) {
                Handle_Notification.announceWarning("<html>You have not entered <b>English</b> score</html>");
                return b;
            }

            if (computer.length() <= 0) {
                Handle_Notification.announceWarning("<html>You have not entered <b>Computer</b> score</html>");
                return b;
            }

            if (physical.length() <= 0) {
                Handle_Notification.announceWarning("<html>You have not entered <b>Physical</b> score</html>");
                return b;
            }

            float englishFloat, computerFloat, physicalFloat;
            try {
                englishFloat = Float.parseFloat(english);
            } catch (Exception ex) {
                Handle_Notification.announceWarning("<html>English score must be a <b>number</b></html>");
                return b;
            }

            try {
                computerFloat = Float.parseFloat(computer);
            } catch (Exception ex) {
                Handle_Notification.announceWarning("<html>Computer score must be a <b>number</b></html>");
                return b;
            }

            try {
                physicalFloat = Float.parseFloat(physical);
            } catch (Exception ex) {
                Handle_Notification.announceWarning("<html>Physical score must be a <b>number</b></html>");
                return b;
            }

            if (englishFloat < 0 || englishFloat > 10) {
                Handle_Notification.announceWarning("<html>English score must be <b>between 1 - 10</b></html>");
                return b;
            }

            if (computerFloat < 0 || computerFloat > 10) {
                Handle_Notification.announceWarning("<html>Computer score must be <b>between 1 - 10</b></html>");
                return b;
            }

            if (physicalFloat < 0 || physicalFloat > 10) {
                Handle_Notification.announceWarning("<html>Physical score must be <b>between 1 - 10</b></html>");
                return b;
            }

            if (addScore(idStudent, name, englishFloat, computerFloat, physicalFloat) == 1) {
                b = true;
            }

        } catch (Exception ex) {
            Handle_Notification.announceError("An unknown error occurred!");
        }

        return b;
    }

    public boolean updateCheck(String idStudent, String name, String english, String computer, String physical) {
        boolean b = false;
        try {
            if (english.length() <= 0) {
                Handle_Notification.announceWarning("<html>You have not entered <b>English</b> score</html>");
                return b;
            }

            if (computer.length() <= 0) {
                Handle_Notification.announceWarning("<html>You have not entered <b>Computer</b> score</html>");
                return b;
            }

            if (physical.length() <= 0) {
                Handle_Notification.announceWarning("<html>You have not entered <b>Physical</b> score</html>");
                return b;
            }

            float englishFloat, computerFloat, physicalFloat;
            try {
                englishFloat = Float.parseFloat(english);
            } catch (Exception ex) {
                Handle_Notification.announceWarning("<html>English score must be a <b>number</b></html>");
                return b;
            }

            try {
                computerFloat = Float.parseFloat(computer);
            } catch (Exception ex) {
                Handle_Notification.announceWarning("<html>Computer score must be a <b>number</b></html>");
                return b;
            }

            try {
                physicalFloat = Float.parseFloat(physical);
            } catch (Exception ex) {
                Handle_Notification.announceWarning("<html>Physical score must be a <b>number</b></html>");
                return b;
            }

            if (englishFloat < 0 || englishFloat > 10) {
                Handle_Notification.announceWarning("<html>English score must be <b>between 1 - 10</b></html>");
                return b;
            }

            if (computerFloat < 0 || computerFloat > 10) {
                Handle_Notification.announceWarning("<html>Computer score must be <b>between 1 - 10</b></html>");
                return b;
            }

            if (physicalFloat < 0 || physicalFloat > 10) {
                Handle_Notification.announceWarning("<html>Physical score must be <b>between 1 - 10</b></html>");
                return b;
            }

            if (updateScore(idStudent, name, englishFloat, computerFloat, physicalFloat)) {
                b = true;
            }
        } catch (Exception ex) {
            Handle_Notification.announceError("An unknown error occurred!");
        }
        return b;
    }

    public boolean deleteScoreById(String id) {
        return deleteScore(id);
    }

}
