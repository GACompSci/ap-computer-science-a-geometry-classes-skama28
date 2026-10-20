public class Circle {
    private int radius;
    private Point center;

    public Circle(double radius, Point center) {
        radius = MathTools.randInt(1, 10);
        center = new Point(MathTools.randInt(1, 10), MathTools.randInt(1, 10));
    }
    /*
     * Did I do this right bc I just put a bunch of random values?
     * Was I supposed to create the instance in App class??
     */

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }
    /*
     * Question for Mr. Baber = the instructions say int Radius but they want
     * it to be rounded to two decimal places in the method getRadius??
     */

    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2.0);
        area = MathTools.round(area, 2);
        return area;
    }

}
