package bankingsystem;

public class CurrentAccount extends Account{
    private final double overdraftLimit = 5000;

    public CurrentAccount(String accountNumber, Customer customer, double balance) {
        super(accountNumber, customer, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawal successful from Current Account. New balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    @Override
    public double calculateInterest() {
        return 0; // No interest on current accounts
    }
}
