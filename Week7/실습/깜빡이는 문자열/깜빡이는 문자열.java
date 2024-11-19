import javax.swing.*;
import java.awt.*;

class FlickeringLabel extends JLabel implements Runnable {

    private long delay;

    public FlickeringLabel(String text, long delay) {
        super(text); //JLabel 생성자 호출
        this.delay = delay;
        setOpaque(true); //배경색 변경 가능하도록 설정

        Thread th = new Thread(this);
        th.start();
    }


    @Override
    public void run() {
        int n=0;
        while (true) {
            if(n==0) {
                setBackground(Color.YELLOW);
            } else setBackground(Color.GREEN);

            if(n==0)    n=1;
            else n=0;

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
public class FlickeringLabelEx extends JFrame {

    public FlickeringLabelEx() {
        setTitle("FlickeringLabel 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        FlickeringLabel fl = new FlickeringLabel("깜빡", 500);
        JLabel la = new JLabel("안 깜빡");
        FlickeringLabel fl2 = new FlickeringLabel("여기도 깜빡", 300);

        c.add(fl);
        c.add(la);
        c.add(fl2);

        setSize(300,150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new FlickeringLabelEx();
    }
}
