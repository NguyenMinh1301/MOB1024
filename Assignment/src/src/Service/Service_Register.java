package src.Service;

import static src.DAO.DAO_Notification.announceWarning;
import static src.DAO.DAO_Notification.announceError;
import static src.DAO.DAO_Notification.announceInfo;
import src.DAO.DAO_Register;

public class Service_Register implements DAO_Register {

    public boolean register(String username, String password, String confirmPassword) {
        boolean b = false;

        if (username.length() <= 0) {
            announceWarning("Name cannot be left blank");
            return b;
        }

        if (isExistUser(username)) {
            announceWarning("Username already exists");
            return b;
        }

        if (password.length() <= 0) {
            announceWarning("Password cannot be left blank");
            return b;
        }

        if (confirmPassword.length() <= 0) {
            announceWarning("Confirm password cannot be left blank");
            return b;
        }

        if (!password.equals(confirmPassword)) {
            announceWarning("Password does not match");
            return b;
        }

        String hashedPassword = Service_BCrypt.BCryptUtils.hashPassword(password);

        int roleId = getRoleIdByName("user");
        if (roleId == -1) {
            announceError("Cannot find role 'user' in database.");
            return b;
        }

        b = insertUser(username, hashedPassword, roleId);

        if (b == false) {
            announceError("Register failed !");
            return b;
        } else if (b == true) {
            announceInfo("Register success !");
            return b;
        }

        return b;
    }
}
