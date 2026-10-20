public class Rectangle {
    private Point topLeft;
    private int length;
    private int width;

    public Rectangle(Point topLeft, int length, int width) {
        this.topLeft = topLeft;
        this.length = length;
        this.width = width;
    }

    public Point gettopLeft() {
        return topLeft;
    }

    public double getArea() {
        double area = (length * width);
        area = MathTools.round(area, 2);
        return area;
    }

}
