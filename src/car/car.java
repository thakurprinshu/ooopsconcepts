package car;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class car {
    protected int speed; // in km/h
    protected double fuel;
    protected double distanceTraveled;

    public car(int speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
        this.distanceTraveled = 0;
    }

    public void drive(int hours) {
        double maxDistance = speed * hours;
        double fuelNeeded = maxDistance / 15;

        if (fuelNeeded <= fuel) {
            distanceTraveled += maxDistance;
            fuel -= fuelNeeded;
            System.out.println("Car drove " + maxDistance + " km in " + hours + " hours.");
        } else {
            double possibleDistance = fuel * 15;
            distanceTraveled += possibleDistance;
            System.out.println("Car ran out of fuel after driving " + possibleDistance + " km.");
            fuel = 0;
        }
    }

    public void printStatus() {
        System.out.println("Distance: " + distanceTraveled + " km, Fuel: " + fuel + " liters");
    }



}