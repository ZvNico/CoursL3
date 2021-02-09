package TD2;

import TD1.Point;

public class Segment {
    private Point point1;
    private Point point2;
    public Segment(int x1, int y1, int x2, int y2) {
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
    }
    public void print() {
        System.out.println(toString());
    }

    public String toString() {
        return "[" + point1.toString() + " " + point2.toString() + "]";
    }


}
