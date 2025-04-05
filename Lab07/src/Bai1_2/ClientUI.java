package Bai1_2;

import com.formdev.flatlaf.FlatLightLaf;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;
import javax.swing.JOptionPane;

public class ClientUI extends javax.swing.JFrame {

    private Socket socket;
    private BufferedReader inputServer;
    private PrintWriter out;
    private String username;

    public ClientUI() {
        initComponents();
        requestUsername();
        connectToServer();
        setupSendAction();
    }

    private void requestUsername() {
        username = JOptionPane.showInputDialog(this, "Nhập tên của bạn:", "Đăng nhập", JOptionPane.PLAIN_MESSAGE);
        if (username == null || username.trim().isEmpty()) {
            username = "Khách" + new Random().nextInt(1000);
        }
    }
    
    private void connectToServer() {
        try {
            String serverIP = "127.0.0.1";
            int port = 1234;

            socket = new Socket(serverIP, port);
            inputServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            txtChat.append("Đã kết nối tới máy chủ tại " + serverIP + ":" + port + "\n");

            new Thread(() -> {
                String msg;
                try {
                    while ((msg = inputServer.readLine()) != null) {
                        txtChat.append(msg + "\n");
                        scrollToBottom();
                    }
                } catch (IOException e) {
                    txtChat.append("Mất kết nối với server.\n");
                }
            }).start();

        } catch (IOException e) {
            txtChat.append("Không thể kết nối tới server: " + e.getMessage() + "\n");
        }
    }

    private void setupSendAction() {
        btnSend.addActionListener(e -> sendMessage());
        txtText.addActionListener(e -> sendMessage());
    }

    private void sendMessage() {
        String msg = txtText.getText().trim();
        if (!msg.isEmpty()) {
            String time = new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date());
            out.println("[" + time + "] " + username + ": " + msg);
            txtChat.append("[" + time + "] Bạn: " + msg + "\n");
            txtText.setText("");
            scrollToBottom();
        }
    }

    private void scrollToBottom() {
        txtChat.setCaretPosition(txtChat.getDocument().getLength());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtChat = new javax.swing.JTextArea();
        txtText = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtChat.setEditable(false);
        txtChat.setColumns(20);
        txtChat.setRows(5);
        jScrollPane1.setViewportView(txtChat);

        btnSend.setText("SEND");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtText, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSend)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtText)
                    .addComponent(btnSend, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        FlatLightLaf.setup();
        new ClientUI().setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtChat;
    private javax.swing.JTextField txtText;
    // End of variables declaration//GEN-END:variables
}
