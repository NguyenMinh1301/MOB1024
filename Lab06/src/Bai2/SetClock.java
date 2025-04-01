package Bai2;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JButton;

public class SetClock implements Runnable {
    private JButton btnClock; // Biến để lưu tham chiếu nút

    public SetClock(JButton btnClock) {
        this.btnClock = btnClock;
    }

    @Override
    public void run() {
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss aa");
        while (true) {
            try {
                Date now = new Date();
                String time = formatter.format(now);
                btnClock.setText(time); // Hiển thị lên nút
                Thread.sleep(1000);
            } catch (Exception e) {
                break;
            }
        }
    }
}
