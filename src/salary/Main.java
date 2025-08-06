package salary;

public class Main {
    public static void main(String[] args) {
        Employee fullTime = new Fulltime("Alice", 101, 50000);
        Employee partTime = new Parttime("Bob", 102, 80, 300);
        Employee contractor = new Contract("Charlie", 103, 20, 1500);

        displaySalary(fullTime);
        displaySalary(partTime);
        displaySalary(contractor);
    }

    public static void displaySalary(Employee emp) {
        emp.printDetails();
        System.out.println("Salary: ₹" + emp.calculateSalary());
        System.out.println("----------------------");
    }
}
