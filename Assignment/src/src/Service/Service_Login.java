package src.Service;

import static src.Service.Handle_Notification.announceWarning;
import static src.Service.Handle_Notification.announceError;
import src.DAO.DAO_Login;
import src.Model.Model_User;

/*
    Lớp Service_Login implements lớp DAO_Login
    Kiểm tra người dùng đã nhập đủ thông tin yêu cầu hay chưa
    Kiểm tra username và password (đã được mã hoá) có tồn tại trong database hay không
*/

public class Service_Login implements DAO_Login {
    
    public Model_User loginCheck(String username, String password) {
        Model_User user = getUserByUsernameFull(username);
        if (username.length() <= 0) {
            announceWarning("You have not entered Username !");
            return null;
        }

        if (password.length() <= 0) {
            announceWarning("You have not entered Password !");
            return null;
        }

        if (!isExistUser(username)) {
            announceWarning("<html>Wrong <b>Username</b> or <b>Password</b> !</html>");
            return null;
        }
        
        String hashed = getHashedPasswordByUsername(username);
        if (hashed == null) {
            announceError("Unable to retrieve password from system.");
            return null;
        }

        if (!Service_BCrypt.checkPassword(password, hashed)) {
            announceWarning("<html>Wrong <b>Username</b> or <b>Password</b> !</html>");
            return null;
        }

        return user;
    }
}
