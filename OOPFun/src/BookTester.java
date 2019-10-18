// import statements first

// javadoc block comment has to immediately precede class

/**
 * BookTester is a driver program for the Book class in Book.java
 *
 * @author gsprint
 * @version 1.0
 */
public class BookTester {
    // tester or driver program to exercise features of the Book class

    /**
     * main() runs the program and processes the command line arguments
     * @param args
     */
    public static void main(String[] args) {
        Book bookOne = new Book(); // DVC
        System.out.println(bookOne);

        Book bookTwo = new Book("Harry Potter 1", "JK Rowling", 275); // EVC
        System.out.println(bookTwo);
        System.out.println(bookTwo.getTitle());

        bookOne.setTitle("a new title");
        System.out.println(bookOne);
    }
}
