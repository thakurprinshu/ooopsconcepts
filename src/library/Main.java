package library;

public class Main {
    public static void main(String[] args) {
        // Creating individual book objects (No Collections)
        Fiction book1 = new Fiction("The Great Gatsby", "F. Scott Fitzgerald", "Classic");
        NonFiction book2 = new NonFiction("Sapiens", "Yuval Noah Harari", "History");
        Magazine book3 = new Magazine("National Geographic", "Various Authors", "August 2025");

        // Display book details
        book1.displayDetails();
        book2.displayDetails();
        book3.displayDetails();

        System.out.println("\n--- Issuing Books ---");
        book1.issueBook();
        book1.issueBook(); // Try issuing again
        book2.issueBook();

        System.out.println("\n--- Returning Books ---");
        book1.returnBook();
        book1.returnBook(); // Try returning again
    }
}
