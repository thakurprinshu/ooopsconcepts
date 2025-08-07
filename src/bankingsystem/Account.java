package bankingsystem;

public abstract class Account {
    private String accountNumber;
    protected double balance;
    private Customer customer;

    public Account(String accountNumber, Customer customer, double balance) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = balance;
    }

    public abstract void withdraw(double amount);
    public abstract double calculateInterest();

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }
}
