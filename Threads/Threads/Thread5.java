package Threads;

public class Thread5 extends Thread {
    public static void main(String args[]) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        Thread3 t3 = new Thread3();
        Thread4 t4 = new Thread4();
        // System.out.println(t1.getState());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

}