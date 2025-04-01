package Bai4;

public class LotteryHelper {
    public static void startRandom(javax.swing.JTextField textField, javax.swing.JButton button) {
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    try {
                        int num = (int) Math.round(Math.random() * 9);
                        textField.setText(String.valueOf(num));
                        Thread.sleep(10);
                    } catch (InterruptedException ex) {
                        break;
                    }
                }
            }
        }.start();

        button.setEnabled(false);
    }
}
