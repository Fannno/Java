
class Car {
    String brand ; // 汽車型號
    double gas, eff ; // gas: 剩餘油料(L), eff: 每公升可跑幾公里
    // 依照main()中的說明，完成set(), print()函數
    void set(String b,double g , double e){
        this.brand = b;
        this.gas = g ;
        this.eff = e ;
    }
    void print(){
        System.out.println("("+'"'+this.brand+'"'+","+this.gas+","+(int)this.eff+")");
    }
    // 完成LongerMileage()函數
    boolean longerMileage(Car c2) {
        // 判斷本車(this)剩餘油料能跑的距離是否比c2更遠
        return this.gas*this.eff>c2.gas*c2.eff;
    }
}
public class MI3C_HWK1_412631532_03 {
    public static void main(String[] args) {
        Car c1 = new Car(), c2 = new Car();
        // 用set()設定c1, c2，內容分別是 ("C320", 43.5, 12) ("Vios",30.8, 16)
        c1.set("C320", 43.5, 12); c2.set("Vios",30.8,16);
        // 用print()印出c1, c2, 格式:(C320, gas=43.5, eff=12) (Vios,gas=30.8,eff=16)
        c1.print() ; c2.print();
        System.out.println("c1.longerMileage(c2)=" + c1.longerMileage(c2)); // true
    }
}
