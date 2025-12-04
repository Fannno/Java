class Point{
    double x, y ; 
   
    void set(double a, double b) { this.x = a; this.y = b; }
    double dist(Point p2) {         
        return Math.sqrt((this.x-p2.x)*(this.x-p2.x)+(this.y-p2.y)*(this.y-p2.y)); // DIY 自行修改
    }
}

class Pentagon { // 五邊形
    // DIY: 完成以下程式
    
    Point[] points = new Point[5]; //記錄五個頂點
    void set(Point[] ps) { 
        points = ps; 
    }
    double boundary() {        
        double t = 0 ;
        for (int i = 0; i < this.points.length; i++) {
            Point p1 = this.points[i];
            Point p2 = this.points[(i+1)%this.points.length];// 下一個點，最後一點連回第一點
            t +=p1.dist(p2);
        }
        return t; // DIY 計算周長  
    }
      double area() { /* 計算多邊形面積*/
        double Area = 0 ;
        Point p0 = this.points[0];// 固定第一個點

    // 從第二個點開始，直到倒數第二個點
        for (int i = 1; i < this.points.length-1; i++) {
            Point p1 = this.points[i];
            Point p2 = this.points[i+1];
            double a = p0.dist(p1);
            double b = p1.dist(p2);
            double c = p2.dist(p0);
            double s = (a+b+c)/2 ;
            Area +=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        }
          return Area ;
    }
}
    
public class MI3C_HWK2_412631532_03 {
    public static void main(String[] args) {
        // 頂點(0,0) (4,0) (6, 2), (4, 4), (0, 4)
        Point[] ps = new Point[5];
        for (int i = 0; i < ps.length; i++) {
            ps[i] = new Point();
        }
        ps[0].set(0,0);
        ps[1].set(4,0);
        ps[2].set(6,2);
        ps[3].set(4,4);
        ps[4].set(0,4);
        Pentagon pen = new Pentagon() ;
        pen.set(ps) ;
        System.out.println("周長="+pen.boundary()) ;
        System.out.println("area="+pen.area()) ;
    }
}