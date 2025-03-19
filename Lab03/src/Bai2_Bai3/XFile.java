package Bai2_Bai3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class XFile {

    public static Object readObject(String path) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            Object object = ois.readObject();
            ois.close();
            return object;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }

    public static void writeObject(String path, Object object) {
        try {
            ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(path));
            oss.writeObject(object);
            oss.close();
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
}
