public class Circle {
    private double radius;
    private Point center; // composition

    public Circle() {
        radius = 1.0;
        center = new Point(); // origin
    }

    public Circle(double radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    public Circle(double radius, int x, int y) {
        this.radius = radius;
        this.center = new Point(x, y);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
