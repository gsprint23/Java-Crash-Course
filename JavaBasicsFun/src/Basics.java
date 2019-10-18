import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * javadoc comment
 */

// single line comments

public class Basics {
    // every public type has to be in its own file
    // 1. public (accessible anywhere)
    // 2. package-private (accessible anywhere in the package)
    // 3. protected (package-private plus accessible from any subclass, even in a different package)
    // 4. private (accessible only from this class

    static final int NUM_FRIENDS = 4;

    public static void main(String[] args) {
        // static means class level (don't need an object to invoke)
        // static means no "this" reference
        // String[] is the data type for the parameter args
        // args is parameter to store command line arguments

        System.out.println(args.length);

        // VARIABLES
        // 8 primitives in java
        // 1. char
        char myChar = 'a';
        System.out.println("myChar: " + myChar);
        // 2. int
        // 3. double
        double myDouble = Math.PI;
        // the Math class in java.lang package, which you get imported for free
        System.out.println("myDouble: " + myDouble);
        // printf("%.2f", myDouble);
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println(df.format(myDouble));
        // 4. boolean
        boolean myBool = true; // false
        System.out.println("myBool: " + myBool);
        // 5. short 6. long 7. float 8. byte

        // STRINGS
        String myString = "hello";
        System.out.println("myString: " + myString);
        // because String is a class, we have access to several members of the String class
        System.out.println(myString.length());
        // equals() compareTo() trim() split() toCharArray() charAt()

        // ARRAYS
        // declare and initialize at the same time
        int[] myInts = {7, 4, 8, 3};
        System.out.println(myInts);
        // use the Arrays class and its static toString()
        System.out.println(Arrays.toString(myInts));

        // declare our array and initialize "later"
        // CONSTANTS... use MACRO_CASE
        // PascalCase used for types
        // camelCase used for identifiers

        String[] myFriends = new String[NUM_FRIENDS];
        myFriends[0] = "Phoebe";
        myFriends[1] = "Ross";
        myFriends[2] = "Monica";
        myFriends[3] = "Joey";

        System.out.println(Arrays.toString(myFriends));
        System.out.println(myFriends.length);
        System.out.println(myFriends[myFriends.length - 1]);

        // CONTROL FLOW
        int x = 5;
        if (x < 5) {
            System.out.println("x is less than 5");
        }
        else if (x > 5) {
            System.out.println("x is greater than 5");
        }
        else {
            // x is 5
            System.out.println("x is 5");
        }

        // loops... for, while, do-while
        // print out the first 20 even numbers
        // 2 4 6 ... 40
        for (int i = 2; i <= 40; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
        int i = 1;
        while (i <= 20) {
            System.out.print(i * 2 + " ");
            i++;
        }
        System.out.println();
        i = 2;
        do {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= 40);
        System.out.println();

        // for each loop (range based for loop)
        for (String friend : myFriends) { // for each string friend in myFriends
            System.out.println(friend);
        }

        // METHODS
        // static methods for class level methods (no access to an invoking object).. no this reference
        // non static methods for instance level methods (access to a this reference)
        // method that returns true if two strings have the same last character, false otherwise
        System.out.println(hasSameLastCharacter("hello", null));

        // RANDOM NUMBERS
        Random randRef = new Random();
        int randInt = randRef.nextInt(6); // [0, 6)
        System.out.println(randInt);

        // USER INPUT
        // use the Scanner class to "scan" from keyboard (System.in is standard input)
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your favorite number: ");
        int favNum = kb.nextInt(); // leaves the newline character in the buffer
        System.out.println("favNum: " + favNum);
        kb.nextLine(); // flush out the newline character in the buffer from nextInt()

        System.out.println("Enter your favorite place: ");
        String favPlace = kb.nextLine();
        System.out.println("favPlace: " + favPlace);

        // take a look at hasNext()
    }

    public static boolean hasSameLastCharacter(String first, String second) {
        // null refers to an invalid reference
        if (first != null && second != null) {
            // make sure each string has at least character
            if (first.length() > 0 && second.length() > 0) {
                // safe to access the last character
                return first.charAt(first.length() - 1) == second.charAt(second.length() - 1);
            }
        }
        return false;
    }

}


