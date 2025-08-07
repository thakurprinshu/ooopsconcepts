package bankingsystem;

public class SavingsAccount extends Account {
    private final double interestRate = 0.04; // 4%

    public SavingsAccount(String accountNumber, Customer customer, double balance) {
        super(accountNumber, customer, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}
