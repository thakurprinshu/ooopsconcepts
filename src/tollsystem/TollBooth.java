package tollsystem;

public class TollBooth {
    public void processVehicle(Vehicle vehicle) {
        System.out.println("Processing vehicle with plate: " + vehicle.getPlateNumber());
        System.out.println("Stay Duration: " + vehicle.getStayDuration() + " minutes");
        System.out.println("Toll Amount: ₹" + vehicle.getTollAmount());
        System.out.println("-------------------------");
    }
}
