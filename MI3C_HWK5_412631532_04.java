import java.util.Arrays;

abstract class CourseInfo {
    private double[] scores ; // 各科成績
    CourseInfo() {}
    CourseInfo(double[] scores) {
        this.scores = Arrays.copyOf(scores,scores.length) ;
    }
    double[] getScores() { return scores;} 
    abstract double avg() ; // 按照科目學分與分數計算總平均分數
    abstract boolean isHalfDismissal() ; // 是否被二一
}
class StudRecord extends CourseInfo {
    int[] credit ; // 各科的學分數
    // DIY: 加入建構式
    StudRecord(){}
    StudRecord(int [] c , double [] s){
        super(s);
        this.credit = c ; 
    }
    // DIY: Override avg(), isHalfDismissal()
    @Override
    double avg(){
        
        double a = 0;
        for (int i = 0; i < super.getScores().length; i++) {
            a+=super.getScores()[i]*credit[i]/10;
        }
        return a ;
    }

    @Override
    boolean isHalfDismissal() {
        int s = 0 ,c = 0;
        for (int i = 0; i < super.getScores().length; i++) {
            c+=credit[i];
            if(super.getScores()[i]<60){
                s+=credit[i] ;
            }
        }
        if(s>c/2){
        return true ;
        }
        return false ;
    }
}

public class MI3C_HWK5_412631532_04 {
    public static void main(String[] args) {
	// 學生修了四門課，學分與分數紀錄: (3, 45.5)(2,90)(2,72.3)(3,50)
        int[] credit = {3, 2, 2, 3} ;
        double[] scores = {45.5, 90, 72.3, 50} ;
        StudRecord sr = new StudRecord(credit, scores) ;
        
        System.out.println("sr.avg()="+sr.avg()) ;
        System.out.println("is half dismissal? "+sr.isHalfDismissal());
    }
}
/* [程式輸出]
sr.avg()=61.11
is half dismissal? true
*/
    
