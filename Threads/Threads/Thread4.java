package Threads;

public class Thread4 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread1 : " + i);
        }
    }

}