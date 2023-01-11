
public class Bankbranch extends Bank {
    public String bankbranchname;
    public int bankbranchid;
    public long banknranchphno;
    long bankbranchtotalfund;
    float bankbranchinterest;
    long bankbranchfund;

    public Bankbranch(String bankname, int bankid, long bankphno, long banktotalfund, float banktotalinterest,
            String bankbranchname, int bankbranchid, long banknranchphno, long bankbranchtotalfund,
            float bankbranchinterest) {
        super(bankname, bankid, bankphno, banktotalfund, banktotalinterest);
        this.bankbranchname = bankbranchname;
        this.bankbranchid = bankbranchid;
        this.banknranchphno = banknranchphno;
        this.bankbranchtotalfund = bankbranchtotalfund;
        this.bankbranchinterest = bankbranchinterest;
        this.bankbranchfund = bankbranchfund;
    }

}
