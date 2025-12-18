import java.io.*;
import javax.swing.*; // for JFileChooser

public class MI3C_1211_HWK10_01 {
    public static void main(String[] args) throws Exception {
        String baseDir = "c:/Data";
        JFileChooser chooser = new JFileChooser(baseDir);
        
        chooser.setDialogTitle("Choose Source File");
        int srcCode=chooser.showOpenDialog(null);
        File srcFile;
        switch (srcCode) {
            case JFileChooser.APPROVE_OPTION:
                srcFile = chooser.getSelectedFile();
                System.out.println(srcFile);
                break;
            case JFileChooser.CANCEL_OPTION:
                System.out.println("Bye!");
                return;
            default:
                System.out.println("ERROR !");
                return;
        }
        
        chooser.setDialogTitle("Choose Destination File");
        int dstCode=chooser.showSaveDialog(null);
        File dstFile;
        switch (dstCode){
            case JFileChooser.APPROVE_OPTION:
                dstFile=chooser.getSelectedFile();
                System.out.println(dstFile);
                break;
            case JFileChooser.CANCEL_OPTION:
                System.out.println("bye!");
                return;
            default:
                System.out.println("ERROR !");
                return;
        }
        try(
            BufferedReader br=new BufferedReader(new FileReader(srcFile));
            BufferedWriter bw=new BufferedWriter(new FileWriter(dstFile))
            ){
            String aLine;
            while((aLine=br.readLine())!=null){
                bw.write(aLine);
                bw.newLine();
            }
        }
        System.out.println("Copy finished!");
        System.out.println("From: "+srcFile.getAbsolutePath());
        System.out.println("To  : "+dstFile.getAbsolutePath());
    }
}
