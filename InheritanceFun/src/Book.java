public class Book extends Publication {
    // book specific fields
    protected String author;

    // Book has three parts to it now
    // Object part
    // Publication part
    // Book part

    // constructors
    public Book() {
        // java calls your DVC for publication (super class) constructor implicitly
        super(); // call to super DVC
        author = "BLANK AUTHOR";
    }

    public Book(String author) {
        this.author = author;
    }

    public Book(String title, String publisher, int numPages, double price, String author) {
        super(title, publisher, numPages, price); // call to super EVC
        this.author = author;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + author;
    }

    @Override
    public String generateCopyright() {
        return "TODO: generate Book's copyright";
    }
}
