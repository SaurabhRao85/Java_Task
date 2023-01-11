
import java.util.Scanner;

public class Bank {
    public String bankname;
    public int bankid;
    public long bankphno;
    private long banktotalfund;
    protected float banktotalinterest;

    public Bank(String bankname, int bankid, long bankphno, long banktotalfund, float banktotalinterest) {
        this.bankname = bankname;
        this.bankid = bankid;
        this.bankphno = bankphno;
        this.banktotalfund = banktotalfund;
        this.banktotalinterest = banktotalinterest;
    }

    Scanner sc = new Scanner(System.in);

    void checkloan(long bankbranchtotalfund, long userloan) {

        if (userloan < banktotalfund) {
            System.out.println("Your loan is approved ");
        } else {
            System.out.println("Your loan cannot approved ");
        }
    }

    void banktotalinterest(long bankbranchfund, long userloan, float bankbranchinterest) {
        if (banktotalfund > userloan) {
            System.out.println("Your interest is " + (banktotalinterest + bankbranchinterest));
        } else {
            System.out.println(" ");
        }
    }

}
