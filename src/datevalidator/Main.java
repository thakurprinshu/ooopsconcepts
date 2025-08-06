package datevalidator;

public class Main {
    public static void main(String[] args) {
        MyDate date = new MyDate(28, 2, 2024); // Leap year test

        System.out.println("Original Date: " + date.formatDate());

        if (date.isValidDate()) {
            date.incrementDate();
            System.out.println("Next Day: " + date.formatDate());
        } else {
            System.out.println("Invalid date entered.");
        }
    }
}
