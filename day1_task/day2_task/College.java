public class College {
    String collegename;
    int collegeid;

    public College(String collegename, int collegeid) {
        this.collegename = "collegename";
        this.collegeid = collegeid;
    }

    void collegedetails() {
        System.out.println("College Name: " + collegename);

        System.out.println("College ID: " + collegeid);

    }
}
