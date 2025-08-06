package car;

public class electric_car  extends car {
    public electric_car(int speed, double batteryPercentage) {
        super(speed, batteryPercentage);
    }

    @Override
    public void drive(int hours) {
        double maxDistance = speed * hours;
        double batteryNeeded = maxDistance / 5;

        if (batteryNeeded <= fuel) {
            distanceTraveled += maxDistance;
            fuel -= batteryNeeded;
            System.out.println("Electric car.car drove " + maxDistance + " km in " + hours + " hours.");
        } else {
            double possibleDistance = fuel * 5;
            distanceTraveled += possibleDistance;
            System.out.println("Battery died after driving " + possibleDistance + " km.");
            fuel = 0;
        }
    }

    @Override
    public void printStatus() {
        System.out.println("Distance: " + distanceTraveled + " km, Battery: " + fuel + "%");
    }
}
