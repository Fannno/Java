class Point {

    double x, y;

    void set(double a, double b) {
        this.x = a;
        this.y = b;
    }

    double distOnLine(Point p2, Point p3) {
        // 如果this, p2, p3同在一直線，則回傳最遠二點距離
        // 如果不是，回傳-1
        if ((this.y - p2.y) / (this.x - p2.x) == (p2.y - p3.y) / (p2.x - p3.x)) {
            double a = Math.sqrt(((this.x - p2.x) * (this.x - p2.x) + (this.y - p2.y) * (this.y - p2.y)));
            double b = Math.sqrt(((this.x - p3.x) * (this.x - p3.x) + (this.y - p3.y) * (this.y - p3.y)));
            double c = Math.sqrt(((p3.x - p2.x) * (p3.x - p2.x) + (p3.y - p2.y) * (p3.y - p2.y)));
            return Math.max(Math.max(a, b), c);         
        }else{
            return -1;
        }
    }
}

public class MI3C_HWK2_412631532_01 {

    public static void main(String[] args) {
        Point p1 = new Point(), p2 = new Point(), p3 = new Point();
        p1.set(5, 3);
        p2.set(3, 0);
        p3.set(4, 1);
        System.out.println("length of line=" + p1.distOnLine(p2, p3));

        Point p4 = new Point();
        p4.set(1, 1);
        System.out.println("length of line=" + p1.distOnLine(p3, p4));
    }
}
    
