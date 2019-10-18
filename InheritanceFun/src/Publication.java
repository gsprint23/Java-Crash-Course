// inheritance: a relationship between two classes
// one class includes ("inherits") state AND behavior from the other class
// preview of interfaces... interfaces only work with behavior, not state

// inheritance hierarchy
// Object <- Publication <- Book
// Object <- Publication <- Magazine
// "is-a" relationship
// Animal <- Dog
// Animal <- Cat

// subclass AKA derived class AKA child class
// superclass AKA base class AKA parent class

// extends: establishes a inheritance relationship
// abstract: class or method
// abstract class: cannot be instantiated
// example: Publication is too general to be instantiated
// abstract method: a method without a body that must be implemented in the subclass
// super: keyword for the super class type (super is not a reference to an object)
public abstract class Publication {
    // fields
    protected String title;
    protected String publisher;
    protected int numPages;
    protected double price;

    // DVC - default value costructor
    public Publication() {
        title = "BLANK TITLE";
        publisher = "BLANK PUBLISHER";
        numPages = 0;
        price = 0.0;
    }

    // EVC - explicit value constructor
    public Publication(String title, String publisher, int numPages, double price) {
        this.title = title;
        this.publisher = publisher;
        this.numPages = numPages;
        this.price = price;
    }

    @Override
    public String toString() {
        return title + ", " + publisher + ", " + numPages + ", " + price;
    }

    // abstract method
    public abstract String generateCopyright();
}
