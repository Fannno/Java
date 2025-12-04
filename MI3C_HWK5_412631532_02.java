class Point {
    private int x, y ; // 不可移除private

    Point() {}
    Point(int a, int b) { this.x=a; this.y=b;}

    // DIY: 自行加入equals(obj)
    public boolean equals(Object obj){
        if(this==obj)return true;
        if(!(obj instanceof Point))return false;
        Point p = (Point)obj;
        return this.x==p.x && this.y == p.y;
    }

    public String toString() {
        return "("+x+","+y+"" ;
    }
}
class Point3D extends Point {
    private int z ;

    Point3D() {}
    Point3D(int a, int b, int c) {
	// DIY here
        super(a,b); z=c ;
    }

    // DIY: 自行加入equals(obj) 
public boolean equals(Object obj){
    if(this==obj)return true;
    if(!(obj instanceof Point3D))return false;
    Point3D p = (Point3D)obj;
    return this.z==p.z;
}
    // DIY: 自行加入toString()
public String toString(){
    return super.toString()+","+z+")";
}
}


public class MI3C_HWK5_412631532_02 {
    public static void main(String[] args) {
        Point p1 = new Point(5,3), p2= new Point(5,3), p3=new Point(10,5) ;
        System.out.println(p1.equals(p2)); // true
        System.out.println(p1.equals(p3)); // true
        System.out.println(p1.equals("Hello")); // false

        System.out.println("-----------------------------------");
        Point pp1 = new Point3D(5,3,4), pp2= new Point3D(5,3,4), pp3=new Point3D(5,3,10) ;
        System.out.println(pp1+" "+pp2+" "+pp3) ;        
        System.out.println(pp1.equals(pp2)); // true
        System.out.println(pp1.equals(pp3)); // false
        System.out.println(pp1.equals(p1));  // false
        System.out.println(p1.equals(pp1));  // true 很奇怪????
    }
}
/* [程式輸出]
true
false
false
-----------------------------------
(5,3,4) (5,3,4) (5,3,10)
true
false
false
true
*/

    

