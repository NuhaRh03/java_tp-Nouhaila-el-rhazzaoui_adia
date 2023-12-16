
public class TestPoint {
    public static void main(String[] args) {
        String y = "yoy";
        String y2 = "yoy";

        Point p = new Point(0, 0);
        p.setX(3);
        p.setY(4);
        Point f = p;
        System.out.println(p.getX());
        System.out.println(p.getY());
        p.Deplace(5, 7);
        System.out.println(p.getX());
        System.out.println(p.getY());
        p.reset();
        System.out.println(p.getX());
        System.out.println(p.getY());
        Point g = new Point(6, 8);
        Point t = new Point(1, 2);
        System.out.println("Distance: " + p.distance(g));
        System.out.println(p.distance(g, t));
        System.out.println(p.equals(f));
        System.out.println(y.equals(y2));
        System.out.println(f.Tostring());

    }
}
