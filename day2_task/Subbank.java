
import java.util.Scanner;

public class Subbank extends Mainbank {
    String name;
    int id;
    long phno;
    long loan;
    private long subbankTotalfund;
    private float subbankinterest;

    Subbank(String name, int id, long phno, long subbankTotalfund, float subbankinterest, String bankname, int bankid,
            long bankphno, long bankTotalfund, float bankinterest) {
        super(bankname, bankid, bankphno, bankTotalfund, bankinterest);
        this.name = name;
        this.id = id;
        this.phno = phno;

        this.subbankTotalfund = subbankTotalfund;
        this.subbankinterest = subbankinterest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Subbank b = new Subbank("Axis", 1234, 766576588, 47656758, 1.2f, "RBI", 2345, 14356546, 566587463, 2.8f);
        System.out.println("enter loan amount");
        long loan = scan.nextLong();
        b.checkloan(loan);
        b.totalinterest(loan, b.subbankinterest);

    }

}
