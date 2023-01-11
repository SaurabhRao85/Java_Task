package collection11;

import java.util.Scanner;

public class User {
    String username;
    int userid;
    long userphno;
    long userloan;
    int count;
    User arrayuser[];
    Scanner sc = new Scanner(System.in);

    void adduserforloan() {
        User us = new User();
        if (count < arrayuser.length) {
            System.out.println("enter the user name ");
            String name = sc.next();
            System.out.println("enter user id ");
            int userid = sc.nextInt();
            System.out.println("enter the user loan ");
            long loan = sc.nextLong();
            System.out.println("enter user phno ");
            long phno = sc.nextLong();
            arrayuser[count] = us;
            count++;
        } else {
            System.out.println("user cannot inserted");
        }

    }

    void displayuser() {
        for (User us : arrayuser) {
            User obj1 = new User();
            Bankbranch b = new Bankbranch("RBI", 12, 1123344, 121345465, 2, "subbank", 14, 123453456, 12345666,
                    2);
            Bank bk = new Bank("RBI", 12, 1123344, 121345465, 2);

            bk.checkloan(b.bankbranchfund, obj1.userloan);
            bk.banktotalinterest(b.bankbranchfund, obj1.userloan, b.bankbranchinterest);
            System.out.println("User Name " + us.username);
            System.out.println("User Id " + us.userid);
            System.out.println("User Loan " + us.userloan);
            System.out.println("User Phno " + us.userphno);

        }
    }

    public static void main(String args[]) {
        User obj = new User();
        System.out.println("Enter the size of array ");
        int n = obj.sc.nextInt();
        obj.arrayuser = new User[n];

        while (true) {
            System.out.println("Enter Case\n 1:adduserforloan\n 2:displayuser\n 3:exit ");
            int choice = obj.sc.nextInt();
            switch (choice) {
                case 1:
                    obj.adduserforloan();
                    break;
                case 2:
                    obj.displayuser();

                    break;
                case 3:
                    System.exit(1);
            }
        }
    }
}
