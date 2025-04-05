package Bai1_2;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            String serverIP = "10.82.64.112";
            int port = 1234;

            Socket socket = new Socket(serverIP, port);
            System.out.println("Connected to chat server at " + serverIP + ":" + port);

            BufferedReader inputUser = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader inputServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Thread nhận tin nhắn từ server
            new Thread(() -> {
                String msgFromServer;
                try {
                    while ((msgFromServer = inputServer.readLine()) != null) {
                        System.out.println(">> " + msgFromServer);
                    }
                } catch (IOException e) {
                    System.out.println("Disconnected from server.");
                }
            }).start();

            // Gửi tin nhắn từ người dùng
            String msg;
            while ((msg = inputUser.readLine()) != null) {
                out.println(msg);
            }

            socket.close();

        } catch (IOException e) {
            System.out.println("Unable to connect to server: " + e.getMessage());
        }
    }
}
