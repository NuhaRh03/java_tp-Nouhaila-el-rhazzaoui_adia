import java.util.*;

public class Point {
    private double x;
    private double y;

    public Point(double j, double i) {
        this.x = j;
        this.y = i;
    }

    public Point(double x) {
        this.x = 0;
    }

    // public Point( double y){this.y=0;}
    public Point() {
        this(0);
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return this.x;
    }

    public String Tostring() {
        return "(" + "x: " + x + " , y : " + y + ")";
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return this.y;
    }

    public void Deplace(double i,
            double j) {

        this.x = x + i;
        this.y = y + j;

    }

    public void reset() {
        this.x = 0;
        this.y = 0;

    }

    public double distance(Point b) {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public static double distance(Point a,
            Point b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    @Override
    public boolean equals(Object o) {
        return (this.x == ((Point) o).x && this.y == ((Point) o).y);
    }

    public boolean equals(Point a) {
        return (this.x == a.x && this.y == a.y);
    }
}
