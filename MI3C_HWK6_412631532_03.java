import java.util.logging.Level;
import java.util.logging.Logger;

interface AlarmTimer { void alarm() ; }
class TimerTool {
public static void startTimer(AlarmTimer timer, int duration, int step) {
// 每隔 step 秒，timer 會 alarm 一次，持續 duration 秒
    for (int i = 0; i < duration; i+= step) { 
        timer.alarm();
        try {
            Thread.sleep(step*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(TimerTool.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
// ---- 以下二種產品，符合(實現了)AlarmTimer 的規格，可讓 TimerTool 來使用---
class BeepWatch implements AlarmTimer{ //此手錶的鬧鈴(alarm()函數)會發出一聲 Beep
    public void alarm(){
        java.awt.Toolkit.getDefaultToolkit().beep();
        System.out.println("Beep");
    }    
}
class EchoWatch implements AlarmTimer{ // 此手錶鬧鈴會在表面印出一次”醒過來”
    public void alarm(){
        System.out.println("醒過來");
    }
}
public class MI3C_HWK6_412631532_03 {
    public static void main(String[] args) {
        AlarmTimer bw = new BeepWatch() ;
        TimerTool.startTimer(bw, 20, 2) ; // 啟動 BeepWatch 的鬧鈴，間隔 2 秒, 持續 20 秒
        AlarmTimer ew = new EchoWatch() ;
        TimerTool.startTimer(ew, 10, 1) ; //啟動 EchoWatch 的鬧鈴，間隔 1 秒, 持續 10 秒
    }    
}
    

