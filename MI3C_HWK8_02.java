/*
<c:/Data/output.txt>: 欄位寬度10,10,13,10
Peter		Male		6215656
Mary		Female  	78236456		Note
Joe		Male		0800-092-000

*/
import java.io.* ; 
public class MI3C_HWK8_02 {
    public static void main(String[] args) throws IOException {
        String ipFilename = "c:/Data/Input.csv" ; 
        String opFilename = "c:/Data/output_transform.txt" ; 
        try ( BufferedReader br = new BufferedReader(new FileReader(ipFilename));
              BufferedWriter bw = new BufferedWriter(new FileWriter(opFilename))
        ) {
            String aLine = "";
            String [] s ;
            while((aLine = br.readLine())!=null){
                s = aLine.split(",");
                if(s.length==3){
                bw.write(String.format("%-10s%-10s%-13s",s[0],s[1],s[2]));
            }else{
                bw.write(String.format("%-10s%-10s%-13s%-10s",s[0],s[1],s[2],"Note"));
                }
                bw.newLine();
            }
        }
    }
}
