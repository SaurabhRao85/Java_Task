package Threads;

public class Thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Thread2 : " + i);

        }

    }
}