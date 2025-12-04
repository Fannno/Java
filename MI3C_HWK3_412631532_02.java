class Staff { // 員工
    int ID; String name ;    
    Staff() { this.ID=-1; this.name="XXX"; }
    Staff(int id, String n) { ID=id; name=n;}
}

class Fulltime extends Staff { // 全職員工
    double baseSalary; int lenOfService ; // 底薪與年資
    Fulltime(){
        super();
        baseSalary = -1 ; lenOfService = -1 ;
    }
    Fulltime(int id , String s , double b , int l){
        super(id,s);
        baseSalary = b ; lenOfService = l ;
    }
    // DIY here: 自行加入建構式與toString() 
    public String toString(){
        return "ID = "+ID+", name = "+name+", baseSalary = "+baseSalary+", lenOfService = "+lenOfService;
    }    
}
public class MI3C_HWK3_412631532_02 {
    public static void main(String[] args){
	Fulltime f1 = new Fulltime() ; // -1, XXX, -1, -1
	Fulltime f2 = new Fulltime(1001,"Peter",32000,5) ;
        System.out.println(f1+"\n"+f2) ;
    }
}
    

