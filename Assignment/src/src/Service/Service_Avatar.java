package src.Service;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Service_Avatar {

    public static String processAvatar(File selectedFile, String studentId) {
        try {
            BufferedImage originalImage = ImageIO.read(selectedFile);

            int width = 300, height = 300;

            Image resized = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            BufferedImage outputImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2d = outputImage.createGraphics();
            g2d.drawImage(resized, 0, 0, null);
            g2d.dispose();

            String folder = "src/img/avatar";
            File outDir = new File(folder);
            if (!outDir.exists()) {
                outDir.mkdirs(); 
            }
            String fileName = studentId + ".png";
            File outputFile = new File(outDir, fileName);
            ImageIO.write(outputImage, "png", outputFile);


            return folder + "/" + fileName;
        } catch (IOException e) {
            Handle_Notification.announceWarning("Avatar processing failed");
            return "";
        }
    }
}
