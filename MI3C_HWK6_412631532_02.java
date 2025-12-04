import java.util.Arrays;

interface Compare {
	// 如果this>obj, 回傳正數, this<obj, 回傳負數, 否則回傳0
	int compareTo(Object obj) ; 
}
class Sort { 
    public static void bubbleSort(Compare[] objs) {
        for (int i = objs.length-1; i>0 ; i--)
           for (int j = 0 ; j<i; j++) 
                 if (objs[j].compareTo(objs[j+1])>0) 
                     swap(objs, j, j+1) ;	
    }
    public static void swap(Object[] objs, int x, int y) {
        Object temp = objs[x] ;
        objs[x] = objs[y] ;
        objs[y] = temp ;
    }
}
// ========== clint side ================
class MyPoint implements Compare{ 
	int x, y ;
        MyPoint() {}
	MyPoint(int a, int b) { x = a; y=b; }
        public int compareTo(Object obj){return 0 ;}
	public String toString() { return "("+x+","+y+")" ; }
}
public class MI3C_HWK6_412631532_02 {
    public static void main(String[] args) {
        MyPoint[] mps = {
            new MyPoint(3,6), new MyPoint(0,4), 
            new MyPoint(7,5), new MyPoint(4,12),
            new MyPoint(2,9)
        } ;             
        Sort.bubbleSort(mps) ;
        System.out.println("mps[]="+Arrays.toString(mps));
        // … 自行用for印出msp
        for (int i = 0; i < mps.length; i++) {
            System.out.println("mps["+i+"]="+mps[i]);
        }
    }
}	


    

