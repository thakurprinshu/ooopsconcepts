package restarauntmenu;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Java Restaurant!");
        System.out.println("Choose your item:");
        System.out.println("1. Pizza\n2. Burger\n3. Pasta");
        System.out.print("Enter choice: ");

        int choice = scanner.nextInt();
        Fooditem item = null;

        switch (choice) {
            case 1: item = new Pizza(); break;
            case 2: item = new Burger(); break;
            case 3: item = new Pasta(); break;
            default:
                System.out.println("Invalid choice!");
                System.exit(0);
        }

        System.out.println("\nOrder Details:");
        System.out.println("Item: " + item.getName());
        System.out.println("Price: ₹" + item.getPrice());
        System.out.println("Preparation Time: " + item.getPreparationTime() + " mins");
        item.prepare();
    }
}
