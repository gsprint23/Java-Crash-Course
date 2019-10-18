import java.util.Arrays;

public class PointTester {
    public static void main(String[] args) {
        Point origin = new Point();
        Point p1 = new Point(3, -89);

        System.out.println(origin);
        System.out.println(p1);

        // array of reference
        Point[] points = new Point[5];
        // how many Point objects were just made???
        // 0!!.... 5 Point references were made (all null)
        for (int i = 0; i < points.length; i++) {
            points[i] = new Point(i, i); // actually making a Point object
        }

        System.out.println(Arrays.toString(points));
        // static means no this context (class level... shared amongst all objects of the class)
        // non-static means there is a this refernce (instance-level, need an object to invoke/access)
    }
}
