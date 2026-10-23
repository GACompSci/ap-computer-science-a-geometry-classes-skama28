public class Triangle {
    private Point point1;
    private Point point2;
    private Point point3; 

    public Triangle(Point point1, Point point2, Point point3){
        this.point1 = point1;
        this.point2 = point2; 
        this.point3 = point3;
    }

    public double getArea(){
        int x1 = point1.getX();
        int x2 = point2.getX(); 
        int x3 = point3.getX(); 

        int y1 = point1.getY();
        int y2 = point2.getY();
        int y3 = point3.getY();

        double area = Math.abs(0.5*(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2)));
        area = MathTools.round(area, 2);
        return area; 
    }


}
