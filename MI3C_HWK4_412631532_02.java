class ID {
    private int id ; 
    ID(int a ) { this.id = a; }
    void reset()  {id=-1;}
    public String toString() {return id+""; }
}
class Score extends ID{ 
    private float gpa ;  
    
    Score(int a, float b) { super(a); this.gpa=b; }
    void reset() {  // DIY here
        super.reset(); gpa = -1 ;
    } 
    public String toString() { return "("+super.toString()+","+this.gpa;} // DIY: id,gpa
}
class Record extends Score { 
    private String comment ;  
    
    Record(int a,float b, String s) { super(a,b); this.comment= s; }
    void reset() { 
        super.reset(); comment = "XXX";
    } // DIY here
    public String toString() { return super.toString()+","+this.comment+")"; }
    
    Record(Record r){
        super(Integer.parseInt(r.toString().split("[(),]")[1]),Float.parseFloat(r.toString().split("[(),]")[2]));        
        this.comment = r.comment ;
    }
    
}

public class MI3C_HWK4_412631532_02 {
    public static void main(String[] args) {
        Record r1 = new Record(1001, 3.92f, "Good") ; 
        r1.reset() ; // id=-1,  gpa=-1,  comment="XXX"
        System.out.println("reset r1, r1="+r1) ; // 印出(-1, -1, XXX)
        
        Record r2 = new Record(1001, 3.92f, "Good") ; 
        r1 = new Record(r2) ; 
        System.out.println("copy from r2, r1="+r1) ; // 印出(1001. 3.92, Good)

    }
}

    

