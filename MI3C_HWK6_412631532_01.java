import java.awt.* ;
interface Shape {
    double area();
    void draw(Graphics g) ;
}
class Circle implements Shape {
	double r ;
	Circle(double r) { this.r = r; }
	public double area() { return Math.PI*r*r; }
	public void draw(Graphics g) { /* …. 畫出圓 */}
}
class Rect implements Shape {
	double w, h ;
	Rect(double w, double h) { this.w=w; this.h=h; }
	public double area() { return w*h; }
	public void draw(Graphics g) { /* 畫出方型….*/}
}
class PaintBoard { //繪圖板: 可儲存許多形狀
    Shape[] shapes = new Shape[100] ; //通用容器
    int cnt = 0;//紀錄已經儲存多少個圖形
    void add(Shape s) { shapes[cnt++]=s; }//將新圖形烙入陣列中
    double calTotalArea() { // DIY, 改寫
        double sum = 0;
        for (int i = 0; i < cnt; i++) {
            sum += shapes[i].area();
        }
        return sum;
    }
}
public class MI3C_HWK6_412631532_01 {
    public static void main(String[] args) {
        PaintBoard pb = new PaintBoard() ;
	pb.add(new Circle(3)) ;
	pb.add(new Rect(9, 4)) ;
	pb.add(new Circle(5.5)) ;
	System.out.println("Total area="+pb.calTotalArea()) ;
    }
}
    


