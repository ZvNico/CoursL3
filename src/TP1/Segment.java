package TP1;

public class Segment {
    private final Point point1;
    private final Point point2;

    public Segment(final int x1, final int y1, final int x2, final int y2) {
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
    }

    public void print() {
        System.out.println(toString());
    }

    public double longueur() {
        return point1.distance(point2);
    }

    public String toString() {
        return "[" + point1.toString() + " " + point2.toString() + "]";
    }


}
