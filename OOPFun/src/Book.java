public class Book {
    // class: a collection of state and behavior that completely describes something
    // state: fields (AKA attributes)
    // behavior: methods

    // object: instance of the class
    // class like a blueprint, and an object is a realization of that blueprint
    // members: fields, methods, constructors, nested classes, etc.

    // fields
    private String title;
    private String author;
    private int numPages;

    // constructors
    // we get a default value constructor for free
    // (DVC)

    // every class either directly or indirectly inherits from the Object class
    // we inherit a few methods from Object
    // one is called toString()

    // explicit value constructor (EVC)
    public Book(String title, String paramAuthor, int paramNumPages) {
        this.title = title; // shadowing... the parameter title is shadowing the field title
        // this refers to the invoking object
        // in a constructor this refers to the object being created
        author = paramAuthor;
        numPages = paramNumPages;
    }

    // once we define a constructor, we lose the free DVC
    // DVC
    public Book() {
        title = "BLANK TITLE";
        author = "BLANK AUTHOR";
        this.numPages = -1;
    }

    // override toString() to provide a better string representation of a Book
    // ANNOTATIONS
    // metadata or metainformation about your code used by the compiler and the IDE
    // @Deprecated @Override @SuppressWarnings

    @Override
    public String toString() { // instance level (non-static)
        // this refers to the invoking object
        // example in main() bookTwo.toString()
        // bookTwo refers to the invoking object
        // in this toString() method, this would also refer to the same object as bookTwo

        return title + " by " + author;
    }

    // getters and setters
    // expose state and behavior as needed
    // getter AKA accessor
    public String getTitle() {
        return title;
    }

    // setter AKA mutator
    public void setTitle(String newTitle) {
        title = newTitle;
    }

    // use Generate Code to write some code for you
    // windows alt + insert
    // mac cmd + N

    // override methods
    // ctrl + O


    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumPages() {
        return numPages;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    // task: create a Point class and a PointTester class
    // Point represents a point in 2D space
    // x and a y
    // toString() ex: (0, 0)

    // create a Circle class and a CircleTester class
    // Circle has a center (Point) and radius (double)
    // "has-a" relationship -> composition
    // "is-a" relationship -> inheritance
}
