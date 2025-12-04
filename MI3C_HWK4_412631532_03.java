class Shape {
    int a,b ; 
    Shape() { }	
    double area() { return 0.0; } // 需被子類別覆蓋(override)
} 
class Rect extends Shape {
    Rect(int w, int h) { a = w; b=h;}
    double area() { return a*b;} 
}
class Circle extends Shape {
    int r ; 
    Circle(int w, int h, int r) { a = w; b=h; this.r = r ;}
    double area() { return Math.PI*r*r ; }
}
public class MI3C_HWK4_412631532_03 {
    public static void main(String[] args) {
	Shape[] ss = new Shape[10] ;
	int cnt = 0 ; 
	ss[cnt++] = new Circle(5,5,3) ;
	ss[cnt++] = new Rect(4,7) ;
	ss[cnt++] = new Rect(5,12) ;
        ss[cnt++] = new Circle(2,3,9) ;
	System.out.println("total area="+calTotalArea(ss)) ;
    }
    // DIY: 完成以下函數
     public static double calTotalArea( Shape [] s ) {
         double total = 0 ;
         for (int i = 0; i < s.length; i++) {            
            if(s[i]!= null) {
            total+=s[i].area();
            }                  
         }
         return total ;
     } 
}
    

