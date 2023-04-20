package BankingApp;

public class CheckingAccount extends BankAccount {
    private double rate;

    public CheckingAccount(String name,
                           double balance) {
        // In this context super refers to
        // the constructor in the base/super class.
        super(name,balance);
        this.rate = .01; // 1%
    }

    public double getRate() {
        return rate;
    }
}
