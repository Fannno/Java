
class PointX {

    double x, y;
 // 平面上的一點 (x,y)

//class PointMethod { // classPoint的操作函式
// 依照main()中的需求，完成 set(double x, double y), distance(Point p2), print(Point p)
     void set(double x,double y){
        this.x = x;
        this.y = y;
    }
    void print(){
        System.out.println("("+(int)this.x+","+(int)this.y+")");
    }
    double dist(PointX p){
        return Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y)) ;
    }
}

public class MI3C_HWK1_412631532_02 {

    public static void main(String[] args) {
        PointX p1 = new PointX(), p2 = new PointX();
        p1.set(5, 3); // let p1 be (5,3), p2 be (-3,2) 
        p2.set(-3, 2);
        p1.print(); // 印出(5,3)
        double dist = p1.dist(p2);
        System.out.println("distance of p1 and p2 is " + dist);
    }
}
