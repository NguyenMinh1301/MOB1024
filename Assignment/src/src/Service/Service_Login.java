package src.Service;

import static src.DAO.HandleNotification.announceWarning;
import static src.DAO.HandleNotification.announceError;
import src.DAO.DAO_Login;

public class Service_Login implements DAO_Login{
    public boolean checkLogin(String name, String pass) {
    if (name.length() <= 0) {
        announceWarning("You have not entered Username !");
        return false;
    }

    if (pass.length() <= 0) {
        announceWarning("You have not entered Password !");
        return false;
    }

    if (!isExistUser(name)) {
        announceWarning("Account does not exist !");
        return false;
    }

    String hashed = getHashedPasswordByUsername(name);
    if (hashed == null) {
        announceError("Unable to retrieve password from system.");
        return false;
    }

    if (!Service_BCrypt.BCryptUtils.checkPassword(pass, hashed)) {
        announceWarning("Wrong password !");
        return false;
    }

    return true;
}
}
