import java.io.*;
public class MI3C_1204_HWK9_02 {
    public static void main(String []args)throws IOException  {
	String[] names = {"Peter", "Paul","Mary","Joe","Cathy","Samuel"};
	double[] scores = {88.5, 47.9, 90.3, 77.5, 65.8, 92.3} ;
	writeToBinaryFile("c:/Data/scores.bin", names, scores) ; 
	readFromBinaryFile("c:/Data/scores.bin");
    }
    public static void writeToBinaryFile(String fName, String[] ns, double[] ss) throws IOException {
	FileOutputStream fos = new FileOutputStream(fName);
	// DIY here, 透過fos依序將ns[i]、fs[i]內容寫入檔案(fName)
	// 記得throws Exception
        var dos = new DataOutputStream(fos);
        dos.writeInt(ns.length);//6
        for (int i = 0; i < ns.length; i++) {
            dos.writeUTF(ns[i]);
            dos.writeDouble(ss[i]);
        }
    }
    public static void readFromBinaryFile(String fName) throws IOException {
        FileInputStream fis = new FileInputStream(fName);
	// DIY, 透過fis讀取並印出檔案(fName)內容，格式 (name,score)
        var dis = new DataInputStream(fis);
        int a = dis.readInt();
        String name ; double score ;
        for (int i = 0; i < a; i++) {
            name = dis.readUTF();
            score = dis.readDouble();
            System.out.println("("+name+","+score+")");
        }
    }
}
/* [程式輸出]
(Peter, 88.5)
(Paul, 47.9)
... 
*/

