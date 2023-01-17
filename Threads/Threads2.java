package Threads;

import java.lang.Thread;


public class Threads2 extends Thread {

    public static void main(String argvs[]) {

        try {
            for (int j = 0; j < 200; j++) {

                Thread.sleep(2000);

                // displaying the value of the variable
                System.out.println(j);
            }
        } catch (Exception expn) {
            // catching the exception
            System.out.println(expn);
        }
    }
}
