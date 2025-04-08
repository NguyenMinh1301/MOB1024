package src.Service;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/*
    Xử lý hình ảnh khi người dùng chọn thêm avatar cho sinh viên
*/

public class Service_Avatar {

    public static String processAvatar(File selectedFile, String studentId) {
        try {
            //Đọc ảnh gốc từ người dùng
            BufferedImage originalImage = ImageIO.read(selectedFile);
            
            //Chiều rộng chiều cao tuỳ chỉnh (Mặc định 300x300)
            int width = 300, height = 300;

            //Resize ảnh gốc về kích thước tuỳ chỉnh. SCALE_SMOOTH Đảm bảo ảnh không bị vỡ
            Image resized = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            //Tạo ảnh mới dạng BufferedImage để lưu xuống file. TYPE_INT_ARGB hỗ trợ nền trong suốt (transparent background)
            BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = outputImage.createGraphics();
            g2d.drawImage(resized, 0, 0, null);
            g2d.dispose();

            //Lưu ảnh vào mục đã được xác định
            String folder = "src/img/avatar";
            File outDir = new File(folder);
            //Nếu không tìm thấy thư mục đã xác định tạo một thư mục mới
            if (!outDir.exists()) {
                outDir.mkdirs(); 
            }
            //Ghi ảnh ra file .png và thêm id của sinh viên (VD: TV00001.png)
            String fileName = studentId + ".png";
            File outputFile = new File(outDir, fileName);
            ImageIO.write(outputImage, "png", outputFile);
            //Trả về đường dẫn của avatar nếu xử lý thành công
            return folder + "/" + fileName;
            
        } catch (IOException e) {
            Handle_Notification.announceWarning("Avatar processing failed");
            return "";
        }
    }
}
