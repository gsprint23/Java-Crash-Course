public class Main {
    public static void main(String[] args) {
        // args is a string array
        // it stores incoming arguments to our program

        // how to do this... 2 ways
        // 1. cmd line: java Main hello 5 -2.345
        // 2. IntelliJ: Run->Edit Configurations... Program Arguments

        // a great use case command line arguments
        // 2 string cmd line args
        // first for the input file name
        // second for the output file name

        System.out.println(args.length);

        if (args.length == 3) {
            String word = args[0];
            int number = Integer.parseInt(args[1]);
            double floatingPointNumber = Double.parseDouble(args[2]);
            System.out.println(word + " " + number + " " + floatingPointNumber);
        }
        else {
            System.out.println("Usage: string int double");
        }
    }
}
