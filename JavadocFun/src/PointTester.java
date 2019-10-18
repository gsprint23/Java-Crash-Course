// import statement


// javadoc is a tool for generating documentation from your source code
// a bunch of html files that together that together create a website

// javadoc is like javac but for your comments

// a javadoc comment has two parts separated by a newline
// part 1: description
// part 2: tag list

// how to run javadoc
// 1. cmd line: javadoc -d doc src/*
// 2. IntelliJ IDEA IDE: Tools->Generate Javadoc

/**
 * PointTester tests the Point class in Point.java. This is a second sentence.
 *
 * @author gsprint
 * @version 1.0
 * @see Point
 */
public class PointTester {
    /**
     * this is the main() method for the driver program.
     *
     * @param args stores the incoming command line arguments for the program.
     */
    public static void main(String[] args) {
        Point origin = new Point();
        System.out.println(origin);
    }
}
