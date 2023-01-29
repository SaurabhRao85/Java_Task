package DesignPattern_task;

public class Checkbank {

    // private static Checkbank chkbank = new Checkbank();

    // public static Checkbank getObject() {
    // return chkbank;
    // }

    public static void main(String[] args) {
        Bank obj = Bank.getObject();
        obj.getStatus(11);
    }

}
