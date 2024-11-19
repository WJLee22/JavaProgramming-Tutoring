import javax.swing.*;
import java.awt.*;

class TimerThread extends Thread {
    private JLabel timerLabel;

    public TimerThread(JLabel timerLabel){
        this.timerLabel = timerLabel;
    }

    @Override
    public void run(){
        int n=0;
        while(true){
            timerLabel.setText(Integer.toString(n));
            n++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                return;
            }
        }
    }
}

public class TimerThreadEx extends JFrame {
    public TimerThreadEx() {
        setTitle("Thread를 상속받은 타이머 스레드 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        //타이머 값을 출력할 레이블 생성
        JLabel timerLabel = new JLabel();
        timerLabel.setFont(new Font("Gothic", Font.ITALIC,80));
        c.add(timerLabel);

        TimerThread th = new TimerThread(timerLabel);

        setSize(300,170);
        setVisible(true);

        th.start();
    }

    public static void main(String[] args) {
        new TimerThreadEx();
    }
}
