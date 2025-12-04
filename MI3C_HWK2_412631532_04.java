class MonthDay {
    int m, d; // 紀錄日期 month/day
    // DIY here: 根據main()中需求，撰寫成員函數
    MonthDay(int M , int D){
    this.d = D; this.m = M ;    
    }
    MonthDay(MonthDay D){
    this.d = D.d; this.m = D.m ;
}
    MonthDay(String s){
        String [] t = s.split("/");
        m = Integer.parseInt(t[0]);
        d = Integer.parseInt(t[1]);

    }
    void show(String header) {
        System.out.println(header + m + "/" + d);
    }
}

public class MI3C_HWK2_412631532_04 {
    public static void main(String[] args) {
        MonthDay d1 = new MonthDay(12, 5) , d2 = new MonthDay(d1);
        MonthDay d3 = new MonthDay("8/15");
        d1.show("d1=");
        d2.show("d2=");
        d3.show("d3=");
    }
}
    

