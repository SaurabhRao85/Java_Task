
import java.util.Scanner;

public class Userdetails {

    public String EmpName;
    private String userid;
    public String company;
    public String place;
    protected int age;
    private String position;

    public Userdetails(String name, String userid1, String company, String Place, int Age, String pos) {
        this.EmpName = name;
        this.userid = userid1;
        this.company = company;
        this.place = Place;
        this.age = Age;
        this.position = pos;
    }

    void show() {
        System.out.println("enter employee name " + EmpName);
        System.out.println("enter user ID " + userid);
        System.out.println("enter company " + company);
        System.out.println("enter place " + place);
        System.out.println("enter employee age " + age);
        System.out.println("enter employee position " + position);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter emp name");
        String EmpName = sc.next();
        System.out.println("enter userid");
        String userid = sc.next();
        System.out.println("enter company");
        String company = sc.next();
        System.out.println("enter place");
        String place = sc.next();
        System.out.println("enter age");
        int age = sc.nextInt();
        System.out.println("enter position");
        String position = sc.next();

        Userdetails u = new Userdetails(EmpName, userid, company, place, age, position);
        u.show();

    }

}
