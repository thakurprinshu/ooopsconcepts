package library;

abstract class Book {
    private String title;
    private String author;
    private boolean isIssued; // Encapsulation

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    // Abstract methods
    public abstract void displayDetails();

    // Encapsulated issue method
    public void issueBook() {
        if (!isIssued) {
            isIssued = true;
            System.out.println(title + " has been issued.");
        } else {
            System.out.println(title + " is already issued.");
        }
    }

    // Encapsulated return method
    public void returnBook() {
        if (isIssued) {
            isIssued = false;
            System.out.println(title + " has been returned.");
        } else {
            System.out.println(title + " was not issued.");
        }
    }

    // Protected getters for subclasses
    protected String getTitle() {
        return title;
    }

    protected String getAuthor() {
        return author;
    }

    protected boolean isIssued() {
        return isIssued;
    }
}

// Fiction subclass (Inheritance)
class Fiction extends Book {
    private String genre;

    public Fiction(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }

    @Override
    public void displayDetails() {
        System.out.println("Fiction Book: " + getTitle() + " by " + getAuthor() + " | Genre: " + genre);
    }
}

// NonFiction subclass (Inheritance)
class NonFiction extends Book {
    private String subject;

    public NonFiction(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    @Override
    public void displayDetails() {
        System.out.println("Non-Fiction Book: " + getTitle() + " by " + getAuthor() + " | Subject: " + subject);
    }
}

// Magazine subclass (Inheritance)
class Magazine extends Book {
    private String publicationMonth;

    public Magazine(String title, String author, String publicationMonth) {
        super(title, author);
        this.publicationMonth = publicationMonth;
    }

    @Override
    public void displayDetails() {
        System.out.println("Magazine: " + getTitle() + " by " + getAuthor() + " | Published: " + publicationMonth);
    }
}
