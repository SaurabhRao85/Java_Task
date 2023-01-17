
import java.lang.Thread;

public class Threads4 extends Thread {

    public static void main(String argvs[]) {

        try {
            for (int j = 0; j < 400; j++) {

                Thread.sleep(4000);

                // displaying the value of the variable
                System.out.println(j);
            }
        } catch (Exception expn) {
            // catching the exception
            System.out.println(expn);
        }
    }
}
