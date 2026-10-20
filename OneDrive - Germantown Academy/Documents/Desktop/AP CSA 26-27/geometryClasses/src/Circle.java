public class Circle {
    private int radius;
    private Point center;

    public Circle(int radius, Point center) {
        this.radius = radius;
        this.center = center;
    }
    /*
     * Was I supposed to create the instance in App class??
     */

    public Point getCenter() {
        return center;
    }

    public int getRadius() {
        return radius;
    }

    public double getArea() {
        double area = Math.PI * Math.pow(radius, 2.0);
        area = MathTools.round(area, 2);
        return area;
    }

}
