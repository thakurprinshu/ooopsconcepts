package bankingsystem;

public class FixedDeposit extends Account{
    private final double interestRate = 0.08; // 8%
    private final int lockInPeriod = 12; // months
    private int monthsCompleted;

    public FixedDeposit(String accountNumber, Customer customer, double balance, int monthsCompleted) {
        super(accountNumber, customer, balance);
        this.monthsCompleted = monthsCompleted;
    }

    @Override
    public void withdraw(double amount) {
        if (monthsCompleted < lockInPeriod) {
            System.out.println("Cannot withdraw before lock-in period ends.");
        } else if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal from Fixed Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds in Fixed Deposit.");
        }
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}
