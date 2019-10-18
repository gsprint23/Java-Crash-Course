public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle() {
        length = 1.0;
        width = 1.0;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    @Override
    public double computePerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double computeArea() {
        return length * width;
    }
}
