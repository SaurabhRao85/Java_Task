public class Mainbank {

    String bankname;
    int bankid;
    long bankphno;
    long loan;
    float subbankinterest;
    private long bankTotalfund;
    private float bankinterest;

    public Mainbank(String bankname, int bankid, long bankphno, long bankTotalfund, float bankinterest) {
        this.bankname = "bankname";
        this.bankid = bankid;
        this.bankphno = bankphno;
        this.bankTotalfund = bankTotalfund;
        this.bankinterest = bankinterest;
    }

    void checkloan(long loan) {
        if (loan < bankTotalfund) {
            System.out.println("your loan is sanctioned");
        } else {
            System.out.println("Your loan is not sanctioned");
        }
    }

    void totalinterest(long loan, float subbankinterest) {
        if (loan < bankTotalfund) {
            System.out.println("your total interest is " + (bankinterest + subbankinterest));
        } else {
            System.out.println(" ");
        }
    }

}
