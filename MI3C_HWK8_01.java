import java.io.*;

public class MI3C_HWK8_01 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fr = new FileReader("C:/Data/test.txt");
        FileWriter fw = new FileWriter("C:/Data/test_new.txt");
        int cnt_s = 0 , cnt_u = 0 ,cnt_l = 0 ;       
        while(true){
            int c = fr.read();
            if(c==-1)break;
            if(c==' '){
                cnt_s++;                
            }else if(c>='A'&&c<='Z'){
                cnt_u++;
            }else if(c>='a'&& c<='z'){
                cnt_l++;
            }       
        }
        System.out.printf("#space=%d, #upper=%d, #lower=%d\n",cnt_s,cnt_u,cnt_l);
        fr = new FileReader("/Users/fanrouyu/test.txt");
        boolean i = false ;// 是否正在一串空白之中
        boolean l = true;// 用來判斷是否在行首
        while(true){
            int c = fr.read();
            if(c==-1)break;
            if(c=='\n'){
                fw.write('\n');
                l = true ;// 換行後下一個字元視為行首
                i = false ;
                System.out.println("");
            }else if(c==' '){
                if(l)continue;// 行首空白不寫
                if(!i){// 一串空白只寫一次
                    fw.write(' ');
                    i = true ;
                    System.out.print(" ");
                }
            }else{
                fw.write(c);
                i = false;
                l = false;
                System.out.print((char)c);
            }            
        }
        fr.close();
        fw.close();
}
}
