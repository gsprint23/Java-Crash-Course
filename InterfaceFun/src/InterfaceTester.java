import java.util.Arrays;
import java.util.Random;

public class InterfaceTester {
    public static void main(String[] args) {
        // code that tests out compareTo() and equals()
        System.out.println("Output 1: " + "zags".compareTo("apple"));
        System.out.println("Output 2: " + "zags".compareTo("Zags"));
        System.out.println("Output 3: " + "zags".compareTo("zigs"));
        System.out.println("Output 4: " + "zags".compareTo("zags"));
        System.out.println("Output 5: " + "zags".equals("zags"));
        System.out.println("Output 6: " + "zags".equals("Zags"));
        Circle myCircle = new Circle();
        System.out.println("Output 7: " + myCircle.equals(myCircle));
        System.out.println("Output 8: " + new Circle().equals(new Circle()));

        /*
        What does compareTo() return when invoked with a String?
            ascii value for a is 97
            ascii value for A is 65
            <0 the invoking object < the argument object
            >0 the invoking object > the argument object
            0 the invoking object is the same the argument
        When would you use compareTo()?
            sorting, ordering, ...
        What does equals() return when comparing Strings?
            boolean, true when both references refer to the same string
            false otherwise
            strings are immutable
        What does equals() return when comparing Circles?
            boolean, true if both references refer to the same circle
        In general, what is the purpose of equals()? (tricky)
            compare if two references refer to the same object
            this is the default behavior inherited from Object
        What happens when you try to run the following line of code (Output 9)?
        Any ideas for how to fix this so we can compare two Circle objects?

         */
        System.out.println("Output 9: " + myCircle.compareTo(myCircle));

        // interface: a set of methods that a class can promise to implement
        // an interface provides a reference type
        Comparable myComparable = myCircle; // polymorphism
        // Comparable interface, which has one method in it, int compareTo(T)

        // lets sort some circles!
        Circle[] myCircles = new Circle[5];
        Random rand = new Random();
        for (int i = 0; i < myCircles.length; i++) {
            myCircles[i] = new Circle(i, i, rand.nextDouble());
        }
        System.out.println(Arrays.toString(myCircles));
        Arrays.sort(myCircles);
        System.out.println(Arrays.toString(myCircles));

        // we can define our own interfaces!!
        Shape myShape = myCircle;

        Rectangle myRectangle = new Rectangle();
        System.out.println(myRectangle);

        Shape[] myShapes = new Shape[3];
        myShapes[0] = myCircle;
        myShapes[1] = myRectangle;
        // anonymous class example
        myShapes[2] = new Shape() {
            // 5x5 square
            @Override
            public double computePerimeter() {
                return 20;
            }

            @Override
            public double computeArea() {
                return 25;
            }
        };

        // polymorphism: same code, different behavior
        for (Shape shape : myShapes) {
            System.out.println(shape);
            System.out.println(shape.computePerimeter());
            System.out.println(shape.computeArea());
            System.out.println("************************");
        }


    }
}
