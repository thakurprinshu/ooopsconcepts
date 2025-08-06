package salary;

public class Contract extends Employee{
    private int daysWorked;
    private double dailyRate;

    public Contract(String name, int id, int daysWorked, double dailyRate) {
        super(name, id);
        this.daysWorked = daysWorked;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateSalary() {
        return daysWorked * dailyRate;
    }
}
