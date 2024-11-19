
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyLabel extends JLabel {
    private int barSize=0;
    private int maxBarSize;

    public MyLabel(int maxBarSize){
        this.maxBarSize=maxBarSize;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        int width=(int)(((double)(this.getWidth()))/maxBarSize*barSize);
        if(width==0)    return;
        g.fillRect(0,0, width, this.getHeight());
    }

    synchronized public void fill() {
        if(barSize == maxBarSize){
            try {
                wait();
            } catch(InterruptedException e) {
                return;
            }
        }

        barSize++;
        repaint();
        notify();
    }

    synchronized public void consume() {
        if(barSize == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                return;
            }
        }
        barSize--;
        repaint();
        notify();
    }
}

class ConsumerThread extends Thread {
    private MyLabel bar;

    public ConsumerThread(MyLabel bar) {
        this.bar=bar;
    }

    @Override
    public void run() {
        while (true){
            try{
                sleep(200);
                bar.consume();
            } catch (InterruptedException e){
                return;
            }
        }
    }
}

public class TabAndThreadEx extends JFrame {
    private MyLabel bar = new MyLabel(100);

    public TabAndThreadEx(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);
        bar.setBackground(Color.ORANGE);
        bar.setOpaque(true);
        bar.setLocation(30, 50);
        bar.setSize(350,20);
        c.add(bar);

        //컨텐트팬에 키 이벤트 핸들러 등록
        c.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                bar.fill();
            }
        });

        setSize(450,200);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
        ConsumerThread th = new ConsumerThread(bar);
        th.start();
    }

    public static void main(String[] args) {
        new TabAndThreadEx("아무거나 빨리 눌러 바 채우기");
    }
}
