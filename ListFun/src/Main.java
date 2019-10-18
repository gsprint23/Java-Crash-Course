import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List is an interface
        // Collections framework
        // ArrayList and LinkedList implement List

        List<String> myAutumnWords;

        myAutumnWords = new ArrayList<>(); // initially empty

        myAutumnWords.add("leaves");
        myAutumnWords.add("pumpkin");
        myAutumnWords.add("halloween");
        myAutumnWords.add("raking");

        System.out.println(myAutumnWords);
        System.out.println(myAutumnWords.size());
        System.out.println(myAutumnWords.get(0));

//        myAutumnWords.remove(0);
//        System.out.println(myAutumnWords);
//        myAutumnWords.remove("halloween");
//        System.out.println(myAutumnWords);

        Collections.sort(myAutumnWords);
        System.out.println(myAutumnWords);
        Collections.shuffle(myAutumnWords);
        System.out.println(myAutumnWords);

        // couldn't do List<int>
        // List<Integer>
        // autoboxing (unboxing) in Java
        // convert between Integer and int
        // task: declare a list of the first 10 square numbers
        // 1, 4, 9, ..., 100
        // print out the list in reverse order
        List<Integer> mySquares = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            mySquares.add(i * i);
        }
        System.out.println(mySquares);
        Collections.reverse(mySquares);
        System.out.println(mySquares);
    }
}
