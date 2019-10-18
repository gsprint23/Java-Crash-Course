import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) /*throws FileNotFoundException*/ {
        // exception: an event that occurs during runtime
        // that disrupts the normal program instruction flow

        // 2 types of exceptions
        // 1. unchecked exception: errors and runtime exceptions
        // 2. checked exception: an exception that handle or acknowledge
        // handle -> try/catch
        // acknowledge -> throws on the method header

        // unchecked runtime exception
        try {
            int x = 5 / 0; // this compiles
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        openFile();
        getIntegerFromUser();

        System.out.println("Program continues...");

    }

    public static void getIntegerFromUser() {
        // we NEED an integer from the user
        Scanner kb = new Scanner(System.in);

        int myInt = 0;
        boolean valid = true;
        do {
            valid = true;
            System.out.print("Please enter an integer (or else!!): ");
            try {
                myInt = kb.nextInt(); // throws unchecked exceptions
            } catch (InputMismatchException e) {
                System.out.println("Hey, that's not an integer!! Try again.");
                valid = false;
                // on failure to get an int from nextInt()
                // whatever the user entered is STILL in the buffer
                // buffer: hi\n
            } finally {
                kb.nextLine(); // flush the buffer
                // why in finally?
                // buffer: 5\n -> \n
            }
        } while (!valid);
        System.out.println("myInt: " + myInt);
    }

    public static void openFile() /*throws FileNotFoundException*/ {
        // checked exception
        Scanner inFile = null;
        // try to open an input stream to read from a file
        // that doesn't exist
        try {
            inFile = new Scanner(new File("dne.txt"));
            System.out.println("Here");
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found");
        } finally {
            // executes no matter what happens in the try
            System.out.println("Hello from finally");
        }
    }
}
