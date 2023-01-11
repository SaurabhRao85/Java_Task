public class Branch extends College {
    String branchname;
    int branchid;
    int branchstaff;

    Branch(String branchname, int branchid, int branchstaff, String collegename, int collegeid) {
        super(collegename, collegeid);
        this.branchname = "branchname";
        this.branchid = branchid;
        this.branchstaff = branchstaff;
    }

    void branchdetails() {

        System.out.println("Branch Name: " + branchname);

        System.out.println("Branch ID: " + branchid);

        System.out.println("Branch Staff: " + branchstaff);

    }

}
