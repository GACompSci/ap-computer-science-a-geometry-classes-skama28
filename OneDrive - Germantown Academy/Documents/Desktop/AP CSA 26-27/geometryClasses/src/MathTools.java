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

    Point a = Point.Point(1, 2);
    Point b = Point.Point(2, 3);

    public static int distance(Point a, Point b) {
        int dis = Math.sqrt(Math.pow((a.xCoord - b.xCoord), 2.0) + Math.pow((a.yCoord - b.yCoord), 2.0));
        return dis;
    }

    public static double slope(Point a, Point b){
        int m = ((a.yCoord-b.yCoord)/(a.xCoord-b.xCoord))
        return m; 
    }

}
