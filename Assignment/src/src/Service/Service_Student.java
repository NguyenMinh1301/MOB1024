package src.Service;

import java.util.ArrayList;
import java.util.List;
import src.DAO.DAO_Students;
import src.Model.Model_Students;
import src.Service.Handle_Notification;

public class Service_Student implements DAO_Students {

    private List<Model_Students> studentsList = new ArrayList<>();

    public List<Model_Students> getStudentData() {
        return studentsList = getAllStudents();
    }

    public List<Model_Students> searchStudents(String keyword) {
        return searchStudent(keyword);
    }

    public List<Model_Students> getStudentIdAndName() {
        return getAllStudentWithIdAndName();
    }

    public String previewNextStudentId() {
        return getNextStudentIdPreview();
    }

    public boolean addCheck(String name, String email, String phone, int gender, String address, String avatar) {
        boolean b = false;

        try {
            if (name.length() <= 0) {
                Handle_Notification.announceWarning("<html>You have not entered <b>NAME</b></html>");
                return b;
            }

            if (email.length() <= 0) {
                Handle_Notification.announceWarning("<html>You have not entered <b>EMAIL</b></html>");
                return b;
            }
            try {
                if (phone.length() <= 0) {
                    Handle_Notification.announceWarning("<html>You have not entered <b>PHONE</b></html>");
                    return b;
                }
            } catch (Exception ex) {
                Handle_Notification.announceWarning("<html>Phone number must be a <b>NUMBER</b></html>");
            }

            if (!(gender == 1 || gender == 0)) {
                Handle_Notification.announceWarning("<html>You have not chosen <b>GENDER</b></html>");
                return b;
            }

            if (address.length() <= 0) {
                Handle_Notification.announceWarning("<html>You have not entered <b>ADDRESS</b></html>");
                return b;
            }

            String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
            String phoneRegex = "^(0|\\+84)(3[2-9]|5[6|8|9]|7[0|6-9]|8[1-5]|9[0-9])[0-9]{7}$";

            if (!email.matches(emailRegex)) {
                Handle_Notification.announceWarning("Entered wrong email format");
                return b;
            }

            if (!phone.matches(phoneRegex)) {
                Handle_Notification.announceWarning("Entered wrong phone number format");
                return b;
            }

        } catch (Exception ex) {
            Handle_Notification.announceError("An unknown error occurred!");
        }
        if (addStudent(name, email, phone, gender, address, avatar) == 1) {
            b = true;
        }

        return b;

    }

    public boolean updateCheck(String id, String name, String email, String phone, int gender, String address, String avatar) {
        boolean b = false;

        try {
            if (name.length() <= 0) {
                Handle_Notification.announceWarning("<html>You have not entered <b>NAME</b></html>");
                return b;
            }

            if (email.length() <= 0) {
                Handle_Notification.announceWarning("<html>You have not entered <b>EMAIL</b></html>");
                return b;
            }
            try {
                if (phone.length() <= 0) {
                    Handle_Notification.announceWarning("<html>You have not entered <b>PHONE</b></html>");
                    return b;
                }
            } catch (Exception ex) {
                Handle_Notification.announceWarning("<html>Phone number must be a <b>NUMBER</b></html>");
            }

            if (!(gender == 1 || gender == 0)) {
                Handle_Notification.announceWarning("<html>You have not chosen <b>GENDER</b></html>");
                return b;
            }

            if (address.length() <= 0) {
                Handle_Notification.announceWarning("<html>You have not entered <b>ADDRESS</b></html>");
                return b;
            }

            String phoneRegex = "^(0|\\+84)(3[2-9]|5[6|8|9]|7[0|6-9]|8[1-5]|9[0-9])[0-9]{7}$";
            String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";

            if (!phone.matches(phoneRegex)) {
                Handle_Notification.announceWarning("Entered wrong phone number format");
                return b;
            }

            if (!email.matches(emailRegex)) {
                Handle_Notification.announceWarning("Entered wrong email format");
                return b;
            }
        } catch (Exception ex) {
            Handle_Notification.announceError("An unknown error occurred!");
        }
        if (updateStudent(id, name, email, phone, gender, address, avatar) == true) {
            b = true;
        }

        return b;

    }

    public boolean deleteStudentById(String id) {
        return deleteStudent(id);
    }
}
