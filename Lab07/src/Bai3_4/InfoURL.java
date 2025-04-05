package Bai3_4;

import java.net.MalformedURLException;
import java.net.URL;

public class InfoURL {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://vnexpress.net:80");
            System.out.println("Protocal: "+url.getProtocol());
            System.out.println("Host: "+url.getHost());
            System.out.println("Port: "+url.getPort());
            System.out.println("Path: "+url.getPath());
            System.out.println("File: "+url.getFile());
            System.out.println("Query: "+url.getQuery());
            System.out.println("Ref: "+url.getRef());
        }catch (MalformedURLException ex) {
                ex.printStackTrace();
        }
    }
}
