import java.util.Arrays;
/* Java 有一個內建的Comparable介面如下
public interface Comparable {
     int compareTo(Object obj) ; // 比較this與obj的大小
}
*/
class Student implements Comparable<Student>{ // 實作Comparable介面，以便可以使用Arrays.sort()功能
      int grade;  // 年級
      double gpa; 
      // 自行加入建構式與toString()
      Student(){}
      Student(int grade ,double gpa){
          this.grade = grade ; this.gpa = gpa ;
      }
      public String toString(){
       return "("+grade+","+gpa+")";   
      }
      public int compareTo(Student s){          
          if(this.grade!=s.grade){return s.grade - this.grade ;}
          return Double.compare(s.gpa, this.gpa) ;
      }
}
public class MI3C_HWK7_412631532_02 {
    public static void main(String[] args) {
        Student[] sts = {new Student(3, 3.9), new Student(4, 3.5) , new Student(2, 4.0), new Student(3, 3.85)} ;
        Arrays.sort(sts) ;
        System.out.println(Arrays.toString(sts)) ; // (4, 3.5)(3, 3.9)(3, 3.85)(2, 4.0)
    }
}
