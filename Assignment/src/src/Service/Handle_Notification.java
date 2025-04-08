package src.Service;

import javax.swing.JOptionPane;

/*
    Lớp quản lý các thông báo hiện lên màn hình người dùng
    Sử dụng interface để các lớp khác implement (sử dụng public static method mà không cần override)
*/

public interface Handle_Notification {

    //Báo lỗi
    public static void announceError(String s) {
        JOptionPane.showMessageDialog(null, s, "Error", JOptionPane.ERROR_MESSAGE);
    }

    //Báo trạng thái
    public static void announceInfo(String s) {
        JOptionPane.showMessageDialog(null, s, "Error", JOptionPane.INFORMATION_MESSAGE);
    }

    //Cảnh báo
    public static void announceWarning(String s) {
        JOptionPane.showMessageDialog(null, s, "Warning", JOptionPane.WARNING_MESSAGE);
    }

    //Hỏi người dùng (YES_NO Option) 
    public static int announceConfirm(String s) {
        return JOptionPane.showConfirmDialog(null, s, "Asking Client", JOptionPane.YES_NO_CANCEL_OPTION);
    }

    //Thông báo mẫu dùng để custom thông tin
    public static void announceCustom(String s1, String s2, int type) {
        JOptionPane.showMessageDialog(null, s1, s2, type);
    }

}
