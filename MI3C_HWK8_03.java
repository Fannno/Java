import java.io.* ; 

public class MI3C_HWK8_03 {
     public static void main(String[] args) throws IOException {
        String ipFilename = "c:/Data/output_transform.txt" ; 
        String opFilename = "c:/Data/output-2.txt" ; 
        try ( BufferedReader br = new BufferedReader(new FileReader(ipFilename));
              BufferedWriter bw = new BufferedWriter(new FileWriter(opFilename))
        ) {
            String aLine = "";
            String [] s ;
            while((aLine = br.readLine())!=null){
                s = aLine.trim().split("\\s+");
                if(s.length==3){
                bw.write(String.format("%s,%s,%s,",s[0],s[1],s[2]));
            }else{
                bw.write(String.format("%s,%s,%s,%s",s[0],s[1],s[2],"maternity leave"));
                }
                bw.newLine();
            }
        }
    }
}