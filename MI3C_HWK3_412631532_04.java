class IntNum { // 儲存分數
    private int num ; 
    void set(int x) { num = x; }
    int getNum() { return num; }
}
class Score extends IntNum {
    // 把父類別中的整數n做為學生的id之用     
    private float gpa ;  
    /*DIY, 加入set(id,gpa), getGPA()*/
    void set(int id , float gpa){
        set(id); this.gpa = gpa ;
    }
    float getGPA(){ return gpa ;}
 }
class Record extends Score { 
    private String comment ;  
    /*DIY, 加入set(id,gpa,comment), getComment(), toString()*/ 
    public void set(int id , float gpa , String comment){
        set(id,gpa); this.comment = comment ;
    }
    String getComment(){ return comment ;}
    public String toString(){
        return "id="+getNum()+",gpa="+getGPA()+",comment="+getComment();
    }
}
public class MI3C_HWK3_412631532_04 {
    public static void main(String[] args) {
        Record r = new Record() ;
        r.set(1001, 3.14f, "Good") ; // 設定r之a,gpa,comment 
        System.out.println(r) ;  // 覆寫toString()函數
    }
}

    

