package DesignPattern_task;

class Bank {

    private static final Bank singletonBank = new Bank();

    public Bank getStatus(int Time) {

        if (Time > 9 && Time < 18) {

            System.out.println("Bank is Open");

        } else {
            System.out.println("Bank is Closed");
        }
        return singletonBank;
    }

    public static Bank getObject() {
        return singletonBank;
    }

}
