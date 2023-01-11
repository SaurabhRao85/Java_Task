
import java.util.Scanner;

public class Login {

    public static void main(String args[]) {

        Emaildata userdata = new Emaildata();
        Login loginobj = new Login();
        loginobj.userlogin(userdata);
        System.out.println("change password ");
        loginobj.changepassword(userdata);
    }

    void userlogin(Emaildata userdata) {
        System.out.println("enter the user name ");
        Scanner sc = new Scanner(System.in);
        String Username = sc.next();
        System.out.println("enter the password ");
        String password = sc.next();
        if (Username.equals(userdata.getUsername()) && password.equals(userdata.getpassword())) {
            System.out.println("user login successfully");
        }
        System.out.println(userdata.getpassword());
    }

    void changepassword(Emaildata userdata) {
        System.out.println("enter the user name ");
        Scanner sc = new Scanner(System.in);
        String Username = sc.next();
        System.out.println("enter the old user password  ");
        String password = sc.next();
        if (Username.equals(userdata.getUsername()) && password.equals(userdata.getpassword())) {
            System.out.println("enter the new password ");
            String newpassword = sc.next();
            userdata.setpassword(newpassword);
            System.out.println("password is updated");
        }
    }
}
