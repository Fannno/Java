import java.awt.Point ;
import java.util.HashSet;
import java.util.Set;
class Shape { 
    private Point p1 ; //形狀的左上角座標，或多邊形的第一個點
    protected void setP1(Point p) { this.p1 = p ;}//(#):繼承的類別都可使用
    protected Point getP1() { return p1 ; }
}

class Ellipse extends Shape{ // 請修改使其繼承Shape, 由左上角座標p1, 長寬為d1,d2的矩形所表示 
    // DIY: 變數宣告
    double d1 , d2 ;    
    public void set(Point upLeftPoint ,double d1, double d2){
        super.setP1(new Point(upLeftPoint));
        this.d1 = d1 ;
        this.d2 = d2 ;        
    }
    public double calArea(){        
        return Math.PI*(d1/2)*(d2/2) ;
    }

}
class Triangle extends Shape {  // 請修改使其繼承Shape, 使用p1做為三角形第一點,此處再新增p2, p3
    // DIY: 變數宣告    
    Point p2,p3 ;
    // DIY: 函數定義
    public void set(Point[] p){
        setP1(new Point(p[0]));
        p2 = new Point(p[1]) ;
        p3 = new Point(p[2]) ;
    }

    public double calArea(){
        double a = Math.sqrt((getP1().x-p2.x)*(getP1().x-p2.x)+(getP1().y-p2.y)*(getP1().y-p2.y));
        double b = Math.sqrt((p3.x-p2.x)*(p3.x-p2.x)+(p3.y-p2.y)*(p3.y-p2.y));
        double c = Math.sqrt((getP1().x-p3.x)*(getP1().x-p3.x)+(getP1().y-p3.y)*(getP1().y-p3.y));
        double s = (a+b+c)/2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }
    
}

public class MI3C_HWK3_412631532_01 {
    public static void main(String[] args) {
        Ellipse e = new Ellipse() ; // 橢圓形
        e.set(new Point(10,10), 12, 7) ;
        System.out.println("Ellipse Area="+ e.calArea());
        
        Triangle t = new Triangle() ; // 三角形
        Point[] ps = {new Point(-3,0), new Point(2,0), new Point(1,7)}; 
        t.set(ps) ;
        System.out.println("Triangle Area="+t.calArea());
    }
}
    

