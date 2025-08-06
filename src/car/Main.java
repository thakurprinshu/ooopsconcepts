package car;

public class Main {
    public static void main(String[] args) {
        car petrolCar = new car(60, 10);
        car tesla = new electric_car(80, 100);

        System.out.println("=== Petrol Car ===");
        petrolCar.drive(2); // tries to drive 120 km
        petrolCar.printStatus();

        System.out.println("\n=== Electric Car ===");
        tesla.drive(2);
        tesla.printStatus();
    }
}
