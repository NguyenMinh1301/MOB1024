package Bai1;

public class MyThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ": " + i);
            try {
                Thread.sleep(1000); //sleep 1s
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new MyThread();

        Thread thread1 = new Thread(runnable, "Thread1");
        Thread thread2 = new Thread(runnable, "Thread2");

        thread1.setPriority(Thread.MAX_PRIORITY); 
        thread2.setPriority(Thread.MIN_PRIORITY); 

        thread1.start();
        thread2.start();
    }
}
