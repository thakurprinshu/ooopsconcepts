package tollsystem;

public abstract class Vehicle {
    private String plateNumber;
    private int stayDuration;

    public Vehicle(String plateNumber, int stayDuration) {
        this.plateNumber = plateNumber;
        this.stayDuration = stayDuration;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public int getStayDuration() {
        return stayDuration;
    }

    public abstract double getTollAmount();
}
