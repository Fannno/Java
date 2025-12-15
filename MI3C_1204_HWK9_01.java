import java.io.* ; 

public class MI3C_1204_HWK9_01 {
    public static void main(String[] args) throws IOException{
        String srcFile = "c:/Data/test1.jpg";
        String destFile = "c:/Data/test2.jpg";
        //String destFile2 = "/Users/fanrouyu/backup2.jpg";
        var fis = new FileInputStream(srcFile);
        var fos = new FileOutputStream(destFile);
        //var fos2 = new FileOutputStream(destFile2);
        while(true){
            int c = fis.read();//一次讀取一個byte -> int
            if(c==-1)break;
            fos.write(c);
            //fos2.write(c);
            //System.out.print(c);
        }
        CountByte(srcFile);
        fis.close();
        fos.close();
       
    }
    private static void CountByte(String s) throws IOException{
        File f = new File(s);
        long sbyte = f.length();     
        int a = (int)sbyte/1000 ;
        int b = (int)sbyte%1000;
        System.out.println(a+","+b+" bytes");
        
    }

}
