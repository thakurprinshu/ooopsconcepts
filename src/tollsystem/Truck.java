package tollsystem;

public class Truck extends Vehicle {
    public Truck(String plateNumber, int stayDuration) {
        super(plateNumber, stayDuration);
    }

    @Override
    public double getTollAmount() {
        return 100.0;
    }
}
