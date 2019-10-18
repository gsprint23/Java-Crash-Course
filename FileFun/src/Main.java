import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // file processing template
        // 1. open the file
        // 2. process the file (read/write)
        // 3. close the file

        // file input (reading from a file)
        Scanner inFile = null;
        try {
            inFile = new Scanner(new File("words.txt")); // relative
            while (inFile.hasNextLine()) {
                String line = inFile.nextLine();
                System.out.println(line);
            }
            inFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

        // file output (writing to a file)
        try {
            PrintStream outFile = new PrintStream(new File("out.txt"));
            outFile.println("This is my first line in my output file");
            Random rand = new Random();
            for (int i = 0; i < 10; i++) {
                outFile.println(rand.nextInt(6) + 1);
            }
            outFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file for writing");
        }
    }
}
