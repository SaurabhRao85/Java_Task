package dailytask_11-01-2023;

import java.util.Scanner;

public class Students {
    String name;
    int rollno;
    String branch;
    int sem;
    String college;
    String place;

    public Students(String name, int rollno, String branch, int sem, String college, String place) {
        this.name = name;
        this.rollno = rollno;
        this.branch = branch;
        this.sem = sem;
        this.college = college;
        this.place = place;
    }

    void display() {

        System.out.println("Studen Name: " + this.name);
        System.out.println("Studen Roll No.: " + this.rollno);
        System.out.println("Studen Branch: " + this.branch);
        System.out.println("Studen Semester : " + this.sem);
        System.out.println("Studen Place: " + this.place);
    }

    public void update() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Student Branch Name to update");
        this.branch = sc.next();
    }

}
