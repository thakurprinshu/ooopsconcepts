package tollsystem;

public class Car extends Vehicle{
    public Car(String plateNumber, int stayDuration) {
        super(plateNumber, stayDuration);
    }

    @Override
    public double getTollAmount() {
        return 50.0;
    }
}
