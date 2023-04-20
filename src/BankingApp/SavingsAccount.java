package BankingApp;

public class SavingsAccount extends BankAccount {
    private String name;
    private double balance;

    public SavingsAccount(String name,
                          double balance) {
        super(name,balance);
    }

    public double getRate() {
        // TODO Make the numbers below
        // constants in the class.
        if (balance < 50000)
            return .02;
        else
            return .03;
    }

}
