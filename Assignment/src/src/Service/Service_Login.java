package src.Service;
import static src.DAO.DAO_Notification.*;
        
public class Service_Login {
    public static boolean checkLogin(String name, String pass) {
        boolean b = false;
        
        //Check
        if ( name.length() <= 0 ) {
            announceWarning("You have not entered Username !");
            return b;
        }
        
        if ( pass.length() <= 0 ) {
            announceWarning("You have not entered Password !");
            return b;
        }
        
        //DAO
        b = checkLogin(name, pass);
        
        if ( b == false ) {
            announceError("Login failed !");
            return b;
        } else if ( b == true ) {
            announceInfo("Login success !");
            return b;
        }
        
        return b;
    }
}
