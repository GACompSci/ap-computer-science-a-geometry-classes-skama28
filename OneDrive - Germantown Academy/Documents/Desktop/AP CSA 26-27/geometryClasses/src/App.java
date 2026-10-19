public class App {
    public static void main(String[] args) throws Exception {
        // Create your objects and call their method here
        System.out.println(MathTools.randInt(1, 10));

        System.out.println(MathTools.round(1.175, 2));

        Point a = new Point(3, 5);
        Point b = new Point(5, 9);
        System.out.println(MathTools.distance(a, b));
        System.out.println(MathTools.slope(a, b));
    }
}
