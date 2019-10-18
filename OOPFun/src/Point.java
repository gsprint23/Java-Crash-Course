public class Point {
    private int x;
    private int y;

    // DVC (default value constructor)
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    // EVC (explicit value constructor)
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
