
class Point {

    double x, y;
} // 平面上的一點 (x,y)

class PointMethod { // classPoint的操作函式
// 依照main()中的需求，完成 set(double x, double y), distance(Point p2), print(Point p)
    static void set(Point p ,double x,double y){
        p.x = x;
        p.y = y;
    }
    static void print(Point p){
        System.out.println("("+(int)p.x+","+(int)p.y+")");
    }
    static double dist(Point p1,Point p2){
        return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y)) ;
    }
}

public class MI3C_HWK1_412631532_01 {

    public static void main(String[] args) {
        Point p1 = new Point(), p2 = new Point();
        PointMethod.set(p1, 5, 3); // let p1 be (5,3), p2 be (-3,2) 
        PointMethod.set(p2, -3, 2);
        PointMethod.print(p1); // 印出(5,3)
        double dist = PointMethod.dist(p1, p2);
        System.out.println("distance of p1 and p2 is " + dist);
    }
}
