public class App {
    public static void main(String[] args) throws Exception {
        // Create your objects and call their method here
        System.out.println(MathTools.randInt(1, 10));

        //test comment

        System.out.println(MathTools.round(1.175, 2));

        Point a = new Point(MathTools.randInt(1, 10), MathTools.randInt(1, 10));
        Point b = new Point(MathTools.randInt(1, 10), MathTools.randInt(1, 10));
        System.out.println(MathTools.distance(a, b));
        System.out.println(MathTools.slope(a, b));

        // Not sure how to call Circle???
        Circle circ = new Circle(MathTools.randInt(1, 10), a);
        System.out.println(circ.getRadius());
        System.out.println(circ.getArea());

        Rectangle rect = new Rectangle(b, MathTools.randInt(1, 10), MathTools.randInt(1, 10));
        System.out.println(rect.getArea());

        Point point1 = new Point(MathTools.randInt(1, 10), MathTools.randInt(1, 10));
        Point point2 = new Point(MathTools.randInt(1, 10), MathTools.randInt(1, 10));
        Point point3 = new Point(MathTools.randInt(1, 10), MathTools.randInt(1, 10));
        Triangle tri = new Triangle(point1, point2, point3); 
        System.out.println(tri.getArea());
    }
}
