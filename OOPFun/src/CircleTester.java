public class CircleTester {
    public static void main(String[] args) {
        Circle c1 = new Circle(); // DVC
        System.out.println(c1);

        // standard EVC
        Circle c2 = new Circle(5.5, new Point(1, 1));
        System.out.println(c2);

        // convenience EVC
        Circle c3 = new Circle(75.35, -1, 7);
        System.out.println(c3);
    }
}
