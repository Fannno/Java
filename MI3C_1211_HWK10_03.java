import java.io.*;
import java.util.ArrayList;

class Staff {
    String name ; boolean gender; double salary ;
    Staff(String a, boolean b, double c) { 
        name=a; gender=b; salary=c;
    }
    // DIY, 自行加上toString(), 格式自訂
    public String toString(){
        return String.format("(name:%s,gender:%s,salary:%.2f)", name,(gender?"M":"F"),salary) ;
    }
} 
public class MI3C_1211_HWK10_03 {
    public static void main(String []args)throws IOException  {
        Staff[] recs= {new Staff("John", true, 38000.5), new Staff("Mary", false,125000.49) } ;
        String filename = "c:/Data/data.txt" ; 
        FileWriter fw = new FileWriter(filename);
//        PrintWriter pw = new PrintWriter(fw);
//          for(Staff stf:recs){
//              pw.printf("<%s><%s><%.1f>\n",stf.name,(stf.gender)?"Male":"Female",stf.salary);
//        }
//        pw.close();
        
        System.out.println("------ Write to text file -------");        
            PrintWriter pw = new PrintWriter(fw) ;
            writeStaffToText(pw, recs) ;
            System.out.println("Write over");
        
        System.out.println("------ Read from text file -------");
            ArrayList<Staff> staffList = readStaffFromText(filename) ;
            System.out.println(staffList);
    }
    
    public static void writeStaffToText(PrintWriter pw, Staff[] recs) { // 沒有例外丟出
        for (int i = 0 ; i< recs.length; i++)
            pw.printf("<%s><%s><%.2f>\n", recs[i].name,(recs[i].gender?"M":"F"), 
                        recs[i].salary) ;
        pw.close(); 
    } 
    public static ArrayList<Staff> readStaffFromText(String filename) throws IOException { 
        ArrayList<Staff> staffList = new ArrayList<>() ; 
        // DIY
        BufferedReader br = new BufferedReader(new FileReader(filename));
        String aLine = "" ;
        String [] s ;
        while((aLine = br.readLine())!=null){
        s = aLine.split("[<>]");
        
            String n = s[1].trim();
            boolean g = s[3].trim().equals("M");
            double sa = Double.parseDouble(s[5].trim());
            Staff a = new Staff(n,g,sa);
            staffList.add(a);
        
    }
        return staffList ; 
    }        
}
