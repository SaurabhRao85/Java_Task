package Daily_task.abcd;

import java.util.HashMap;
import java.util.Scanner;

public class MainClass {

  HashMap<Integer, Students> map = new HashMap<Integer, Students>();
  Scanner sc = new Scanner(System.in);

  public static void main(String args[]) {
    MainClass obj1 = new MainClass();
    System.out.println("Students Portal");
    while (true) {
      System.out.println("1: Add Students\n 2: Search Students\n 3:Delete Students\n 4:Update Students Details\n");
      System.out.println("Choice any one Case Above\n");

      int choice = obj1.sc.nextInt();
      switch (choice) {
        case 1:
          obj1.addstudents();
          break;
        case 2:
          obj1.searchstudents();
          break;
        case 3:
          obj1.deletestudents();
          break;
        case 4:
          obj1.updatestudents();
          break;
        case 5:
          System.exit(1);
          break;
        default:
          System.out.println("wrong choice \n");
      }

    }

  }

  void addstudents() {

    System.out.println("Enter the Students Details ");
    System.out.println("Enter roll no. ");
    int rollno = sc.nextInt();
    System.out.println("Enter student name ");
    String name = sc.next();
    System.out.println("Enter Student Branch ");
    String branch = sc.next();
    System.out.println("Enter the Student Semester ");
    int sem = sc.nextInt();
    System.out.println("Enter college name ");
    String college = sc.next();
    System.out.println("Enter the place ");
    String place = sc.next();
    while (this.map.containsKey(rollno)) {
      System.out.println("Roll No. is not unique");
      System.out.println("Enter New Roll No. ");
      int rollno = sc.nextInt();
    }

    Students std = new Students(name, rollno, branch, sem, college, place);
    this.map.put(rollno, std);

  }

  void searchstudents() {
    System.out.println("Enter the Student Roll No. to search ");
    int rollno = sc.nextInt();
    if (this.map.containsKey(rollno)) {
      this.map.get(rollno).display();
    } else {
      System.out.println("Roll No. is not present ");
    }
  }

  void deletestudents() {
    System.out.println("Enter the Student Roll No. to search ");
    int rollno = sc.nextInt();
    Students std = this.map.remove(rollno);
    if (std != null) {
      System.out.println("Deleted Student Details");
      std.display();
    } else {
      System.out.println("Roll No. not found");
    }
  }

  void updatestudents() {

    System.out.println("Enter the Student Roll No. to search ");
    int rollno = sc.nextInt();
    if (this.map.containsKey(rollno)) {
      this.map.get(rollno);
      std.updatestudents();
      this.map.replace(rollno, std);
    }

  }

}
