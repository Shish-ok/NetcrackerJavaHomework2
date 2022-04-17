package comm.netcracker.homework2.ch2;

public class Point {
    private final double x;
    private final double y;

    public Point() {
        x = 0;
        y = 0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point translate(double x, double y) {
        return new Point(this.x + x, this.y + y);
    }
    public Point scale(double factor) {
        return new Point(x * factor, y * factor);
    }
}