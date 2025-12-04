class Time { // 以24小時進制儲存時間
    int h, m, s;
    // DIY: 請替class Time加上適當的建構式，以產生規定輸出。
    Time(int H , int M ,int S){
        this.h = H;this.m= M ; this.s = S ;
    }
    Time(String t){
        if(t.charAt(0)=='A'||t.charAt(0)=='P'){
            String[] p = t.split(" ");
            String a = p[0] ;
       
            String[] l = p[1].split(":");
            this.h = Integer.parseInt(l[0]);
            this.m = Integer.parseInt(l[1]);
            this.s = Integer.parseInt(l[2]);
       
       if(a.equals("PM")){
            this.h+=12;
       }else{
            this.h+=0;
       }
    }else{
        String[] l = t.split(":");
        this.h = Integer.parseInt(l[0]);
        this.m = Integer.parseInt(l[1]);
        this.s = Integer.parseInt(l[2]);           
        }
    }
    void show(String msg) { //可能需修改
        System.out.printf("%s%02d:%02d:%02d",msg,this.h,this.m,this.s);
        System.out.println("");
    } 
}

public class MI3C_HWK2_412631532_05 {

    public static void main(String[] args) {
        Time t1 = new Time(15, 30, 20);
        Time t2 = new Time("18:5:50");
        Time t3 = new Time("AM 8:20:50");
        Time t4 = new Time("PM 7:10:40");
        t1.show("t1=");
        t2.show("t2=");
        t3.show("t3=");
        t4.show("t4=");
    }
}
/*
[程式輸出]
15:30:20
18:05:50
08:20:50
19:10:40
 */

