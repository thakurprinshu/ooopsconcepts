package salary;

public abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();

    public void printDetails() {
        System.out.println("Name: " + name + ", ID: " + id);
    }
}
