class Rect { //矩形

    int x, y, w, h; // (x,y):左上角座標, w:寬, h:高
    // DIY: set(), draw(), toString()

    void set(int X, int Y, int W, int H) {
        this.x = X;
        this.y = Y;
        this.w = W;
        this.h = H;
    }

    String draw(String s) {
        for (int i = 0; i < this.h; i++) {
            for (int j = 0; j < this.w; j++) {
                if(j==0||j==w-1||i==0||i==h-1){
                System.out.print(s);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");    
        }
        return "";
    }

    public String toString() {
        return "(" + this.x + "," + this.y + "), w=" + this.w + ", h=" + this.h;

    }
    // DIY: double overlapArea(r2): 判別this與r2交集之面積
    double overlapArea(Rect r2){
        int a1 = this.x+this.w ;//r1右邊的x座標 5
        int b1 = this.y-this.h ;//r1右下y座標 1

        int a2 = r2.x+r2.w ;//r2右邊的x座標 7
        int b2 = r2.y-r2.h ;//r2右下y座標 2

        int l = Math.max(this.x, r2.x) ;//2 left
        int u = Math.min(this.y, r2.y) ;//4 up
        
        int r = Math.min(a1, a2) ;//5 right
        int d = Math.max(b1, b2) ;//2 down
        
        if( l<r && d<u ){
            return (r-l)*(u-d) ;
        }else{
        return 0 ;
        }
    }
    
}

public class MI3C_HWK2_412631532_02 {

    public static void main(String[] args) {
        Rect r1 = new Rect();
        r1.set(1, 4, 4, 3); // (x,y)=(1,4), w=4, h=3 
        System.out.println("r1=" + r1); // r1=(1,4), w=4, h=3
        r1.draw("@"); // 用@畫出空心r1

        Rect r2 = new Rect();
        r2.set(2, 7, 5, 5); // w=5, h=5
        double overlapArea = r1.overlapArea(r2);
        System.out.println("overlapArea=" + overlapArea);
    }
}

    

