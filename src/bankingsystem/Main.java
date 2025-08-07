package bankingsystem;

public class Main {
    public static void main(String[] args) {
        Customer cust1 = new Customer("Alice", "C001");

        Account savings = new SavingsAccount("SAV123", cust1, 10000);
        Account current = new CurrentAccount("CUR456", cust1, 2000);
        Account fixed = new FixedDeposit("FD789", cust1, 50000, 12);

        // Polymorphic behavior
        Account[] accounts = {savings, current, fixed};

        for (Account acc : accounts) {
            System.out.println("\nAccount Number: " + acc.getAccountNumber());
            System.out.println("Customer: " + acc.getCustomer().getName());
            System.out.println("Interest: " + acc.calculateInterest());
            acc.withdraw(1500);
        }
    }
}
