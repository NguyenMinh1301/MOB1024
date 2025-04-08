package src.Service;

import org.mindrot.jbcrypt.BCrypt;

/*
    Hàm hashPassword

    Chức năng: Mã hoá mật khẩu người dùng vừa nhập
    Cơ chế: Dùng BCrypt.gensalt(8) để tạo salt ngẫu nhiên với chi phí log2 = 8
    Số càng cao → càng an toàn, nhưng càng chậm (thường dùng 8, 10 hoặc 12)
    Kết quả: trả về một chuỗi hash chứa cả salt bên trong
    -----------------------------------------------------------------------------------
    Hàm checkPassword

    Chức năng: Kiểm tra mật khẩu nhập vào (plainPassword) có khớp với mật khẩu đã mã hoá (hashedPassword) không
    Cơ chế: Tự động tách salt từ hashedPassword và hash lại mật khẩu để đối chiếu
*/


public class Service_BCrypt {
    
        public static String hashPassword(String plainPassword) {
            return BCrypt.hashpw(plainPassword, BCrypt.gensalt(8));
        }

        public static boolean checkPassword(String plainPassword, String hashedPassword) {
            return BCrypt.checkpw(plainPassword, hashedPassword);
        }
}
