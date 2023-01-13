
import java.util.Scanner;

public class Users {

    public String EmpName;
    private String userid;
    public String company;
    public String place;
    private String position;

    public Users(String name, String userid1, String company, String Place, String pos) {
        this.EmpName = name;
        this.userid = userid1;
        this.company = company;
        this.place = Place;

        this.position = pos;
    }

    public Users() {
        this("name", "userid1", "company", "Place", "pos");
    }

    public void show() {

        System.out.println("enter employee name " + EmpName);
        System.out.println("enter user ID " + userid);
        System.out.println("enter company " + company);
        System.out.println("enter place " + place);

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

        System.out.println("enter position");
        String position = sc.next();
        Users u = new Users(EmpName, userid, company, place, position);

        u.show();
    }
}
