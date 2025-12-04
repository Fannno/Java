import java.util.*;
class StudentRec{ 
	int id ; String name; int[] score ;
	StudentRec(int a, String b, int[] c) { this.id=a; this.name=b; this.score=c;}
	public boolean equals(Object obj) { 
            if(this == obj) return true ;
            if(!(obj instanceof StudentRec))return false;
            StudentRec s = (StudentRec)obj;
		return this.id==s.id&&this.name.equals(s.name)&&Arrays.equals(this.score, s.score); // DIY, 自行修改
	}
} 
public class MI3C_HWK5_412631532_01 {
	public static void main(String[] args) {
		int[] s1 = {77, 88, 99, 100}, s2={77,88,99,100}, s3={77,99,100} ;
		String n1 = new String("Peter"), n2=new String("Peter"), n3="Peter" ;
		StudentRec sr1 = new StudentRec(1001, n1, s1) ; 
		StudentRec sr2 = new StudentRec(1001, n2, s2) ; 
		StudentRec sr3 = new StudentRec(1001, n3, s3) ; 
		if (sr1.equals(sr2)) System.out.println("sr1 equals to sr2") ; // yes
		if (sr1.equals(sr3)) System.out.println("sr1 equals to sr3") ; // no
		if (sr1.equals(sr1)) System.out.println("sr1 equals to sr1") ; // yes
		if (sr1.equals("Peter")) System.out.println("sr1 equals to \"Peter\"") ; // no
	}
}

