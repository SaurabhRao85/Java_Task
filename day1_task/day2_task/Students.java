
public class Students extends Branch {
    String studentname;
    String studentplace;
    int studentid;

    Students(String studentname, String studentplace, int studentid, String branchname, int branchid, int branchstaff,
            String collegename, int collegeid) {
        super(branchname, branchid, branchstaff, collegename, collegeid);
        this.studentname = "studentname";
        this.studentplace = "studentplace";
        this.studentid = studentid;
    }

    void studentsdetails() {

        System.out.println("Student Name: " + studentname);
        System.out.println("Student Place: " + studentplace);
        System.out.println("Student ID: " + studentid);

    }

    public static void main(String[] args) {
        Students s = new Students("aers", "nagpur", 12, "akfkl", 56, 55, "awrk", 15);
        s.collegedetails();
        s.branchdetails();
        s.studentsdetails();

    }
}
