package src.Service;

import javax.swing.JOptionPane;

public interface Handle_Notification {

    public static void announceError(String s) {
        JOptionPane.showMessageDialog(null, s, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public static void announceInfo(String s) {
        JOptionPane.showMessageDialog(null, s, "Error", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void announceWarning(String s) {
        JOptionPane.showMessageDialog(null, s, "Warning", JOptionPane.WARNING_MESSAGE);
    }

    public static int announceConfirm(String s) {
        return JOptionPane.showConfirmDialog(null, s, "Asking Client", JOptionPane.YES_NO_CANCEL_OPTION);
    }

    public static void announceCustom(String s1, String s2, int type) {
        JOptionPane.showMessageDialog(null, s1, s2, type);
    }

}
