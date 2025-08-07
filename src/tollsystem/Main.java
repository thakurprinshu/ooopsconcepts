package tollsystem;

public class Main {
    public static void main(String[] args) {
        TollBooth tollBooth = new TollBooth();

        Vehicle bike = new Bike("KA01AB1234", 10);
        Vehicle car = new Car("KA05CD5678", 20);
        Vehicle truck = new Truck("KA09EF9012", 45);

        tollBooth.processVehicle(bike);
        tollBooth.processVehicle(car);
        tollBooth.processVehicle(truck);
    }
}
