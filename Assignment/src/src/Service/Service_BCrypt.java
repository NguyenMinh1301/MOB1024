package src.Service;

import org.mindrot.jbcrypt.BCrypt;

public class Service_BCrypt {

    public class BCryptUtils {

        public static String hashPassword(String plainPassword) {
            return BCrypt.hashpw(plainPassword, BCrypt.gensalt(16));
        }

        public static boolean checkPassword(String plainPassword, String hashedPassword) {
            return BCrypt.checkpw(plainPassword, hashedPassword);
        }
    }
}
