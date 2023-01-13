
import java.util.Scanner;

public class Userinfor {

    public String EmpName;
    private String userid;
    public String company;
    public String place;
    protected int age;
    private String position;

    public void createuser() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Employee Name");
        EmpName = scan.nextLine();
        System.out.println("Enter the User id");
        userid = scan.nextLine();
        System.out.println("Enter the Company");
        company = scan.nextLine();
        System.out.println("Enter the Place");
        place = scan.nextLine();
        System.out.println("Enter the Employee Age");
        age = scan.nextInt();
        System.out.println("Enter the Position");
        position = scan.nextLine();

    }

    public void display() {

        System.out.println("Enter the Employee Name: " + EmpName);
        System.out.println("Enter the Userid: " + userid);
        System.out.println("Enter the Company: " + company);
        System.out.println("Enter the Place: " + place);
        System.out.println("Enter Employee Age: " + age);
        System.out.println("Enter the Position " + position);

    }

    public static void main(String[] args) {

        Userinfor u = new Userinfor();
        u.createuser();
        u.display();
    }

}
