public class MathTools {
    // Create the static MathTools methods in this file
    /*
     * randInt(int min, int max)
     * round(double num, int places)
     * distance(Point a, Point b)
     * slope(Point a, Point b)
     */
    public static int randInt(int min, int max) {
        int range = max - min + 1;
        int r = (int) (Math.random() * (range)) + min;
        return r;
    }

    public static double round(double num, int places) {
        double factor = Math.pow(10, places);
        num *= factor;
        num = (int) (num + 0.5);
        return num / factor;
    }

    public static double distance(Point a, Point b) {
        double dx = a.getX() - b.getX();
        double dy = a.getY() - b.getY();
        double dis = Math.sqrt(Math.pow(dx, 2.0) + Math.pow(dy, 2.0));
        dis = round(dis, 3);
        return dis;
    }

    public static double slope(Point a, Point b) {
        double m = ((double) (a.getY() - b.getY()) / (a.getX() - b.getX()));
        m = round(m, 3);
        return m;
    }

}
