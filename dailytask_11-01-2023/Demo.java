
import java.util.*;

public class Demo {

    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("abcd");
        list.add("dcef");
        list.add("fhgj");
        list.add("fghgfj");

        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
