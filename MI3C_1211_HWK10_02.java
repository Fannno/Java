import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;
public class MI3C_1211_HWK10_02 {
    public static void main(String[] args) throws Exception {
        System.out.println("<Dir Copy>");
        Scanner cin=new Scanner(System.in); 
        System.out.print("src dir:");
        String srcName=cin.next(), destiName = "c:/Data/desti";
        File srcDir = new File(srcName), destiDir = new File(destiName);
        if (!srcDir.exists()) {
            System.out.println(srcName + " error!");
            System.exit(0);
        }
        if (!destiDir.exists()) {
            destiDir.mkdirs();
        }
        System.out.print("file type:");
        String suffix=cin.next();
        dirCopy(srcDir, destiDir, suffix);
    }   

    public static void dirCopy(File srcDir, File destiDir, String suffix) throws Exception {
        if (srcDir.isFile() || destiDir.isFile()) {
            return;
        }
        File[] flist = srcDir.listFiles();
        // 過濾檔案可參考listFiles(FileFilter filter), listFiles(FilenameFilter filter)
        // --- DIY here, 使用FileInputStream+FileOutputStream複製檔案 ---
        if (flist==null) return;
        System.out.println(".... copy ....");
        
        for (File f:flist){
            if(!f.isFile()) continue;
            if(!f.getName().toLowerCase().endsWith("."+suffix.toLowerCase())) continue;;
            
            File destFile=new File(destiDir,f.getName());
            
            try(
                FileInputStream fis=new FileInputStream(f);
                FileOutputStream fos=new FileOutputStream(destFile)
                ){
                byte[] buf=new byte[1024];
                int len;
                while((len=fis.read(buf))!=-1){
                    fos.write(buf, 0, len);
                }
            }
            System.out.print(f.getName()+" ");
        }
        System.out.println("");
        System.out.println("<<< copy complete >>>");
    }
}
