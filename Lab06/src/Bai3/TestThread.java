package Bai3;

public class TestThread {
    public static void main(String[] args) {
        OddThread odd = new OddThread();
        EvenThread even = new EvenThread();

        odd.start();
        try {
            odd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        even.start();
    }
}
