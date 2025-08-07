package tollsystem;

public class Bike extends Vehicle {
    public Bike(String plateNumber, int stayDuration) {
        super(plateNumber, stayDuration);
    }

    @Override
    public double getTollAmount() {
        return 20.0;
    }
}
