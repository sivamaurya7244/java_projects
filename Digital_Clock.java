
import java.awt.Color;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Digital_Clock extends JFrame {

    JLabel l1, l2;
    SimpleDateFormat d1, d2;

    Digital_Clock(String s1) {
        super(s1);
    }

    Digital_Clock() {

    }

    void setComponents() {
        Font f1 = new Font("Verdana", Font.BOLD, 20);
        l1 = new JLabel();
        l1.setFont(f1);
        setLayout(null);
        add(l1);
        l1.setBounds(80, 50, 150, 50);

        d1 = new SimpleDateFormat("hh:mm:ss a");
        l1.setForeground(Color.blue);
        l1.setBackground(Color.BLACK);

        //@2nd part
        l2 = new JLabel();
        l2.setFont(f1);
        add(l2);
        l2.setBounds(80, 150, 150, 50);

        d2 = new SimpleDateFormat("EEEEE");
        l2.setForeground(Color.blue);
        l2.setBackground(Color.WHITE);
       // l2.setOpaque(true);

        while (true) {
            String time = d1.format(Calendar.getInstance().getTime());
            l1.setText(time);

            String day = d2.format(Calendar.getInstance().getTime());
            l2.setText(day);

            try {
                Thread.sleep(1000);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }

    public static void main(String[] args) {

        Digital_Clock k1 = new Digital_Clock("Time");
        k1.setVisible(true);
        k1.setSize(350, 350);
        k1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        k1.setComponents();

    }
}
