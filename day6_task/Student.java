package Daily_task.task.java.daily;

import java.util.Scanner;

public class Student {

    String name;
    int age;
    String place;
    String college;
    int count;

    Scanner sc = new Scanner(System.in);
    Student arrastudent[];

    void addstudents() {
        Student std = new Student();
        if (count < arrastudent.length) {

            System.out.println("Enter the student name:");
            std.name = sc.next();
            System.out.println("Enter the student age");
            std.age = sc.nextInt();
            System.out.println("Enter the place");
            std.place = sc.next();
            System.out.println("Enter the college");
            std.college = sc.next();
            arrastudent[count] = std;
            count++;
        } else {
            System.out.println("Student cannot be inserted ");
        }

    }

    void displaystudents() {

        for (Student std : arrastudent) {
            try {
                System.out.println("Student Name: " + std.name);
                System.out.println("Student Age: " + std.age);
                System.out.println("Student Place: " + std.place);
                System.out.println("Student College: " + std.college);
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String args[]) {
        Student obj = new Student();
        System.out.println("Enter the size of Array ");
        int n = obj.sc.nextInt();
        obj.arrastudent = new Student[n];

        while (true) {
            System.out.println("Enter Case\n 1:addStudent\n 2:Display\n 3:exit");
            int choice = obj.sc.nextInt();
            switch (choice) {
                case 1:
                    obj.addstudents();
                    break;
                case 2:
                    obj.displaystudents();
                    break;
                case 3:
                    System.exit(1);
            }
        }

    }

}