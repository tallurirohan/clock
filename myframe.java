import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.text.SimpleDateFormat;
public class myframe extends JFrame{
    Calendar calender;
    SimpleDateFormat timeformat;
    SimpleDateFormat dayformat;
    SimpleDateFormat dateformat;

    JLabel timelabel;
    JLabel daylabel;
    JLabel datelabel;
    String time;
    String day;
    String date;
    myframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("clock");
        this.setLayout(new FlowLayout());
        this.setSize(350,300);
        this.setResizable(true);
        timeformat = new SimpleDateFormat("hh:mm:ss a");
        dayformat = new SimpleDateFormat("EEEE");
        dateformat = new SimpleDateFormat("MMMMM dd,yyyy");
        timelabel = new JLabel();
        daylabel = new JLabel();
        datelabel = new JLabel();
        timelabel.setFont(new Font("verdana",Font.PLAIN,50));
        daylabel.setFont(new Font("Ink Free",Font.PLAIN,40));
        datelabel.setFont(new Font("Ink Free",Font.PLAIN,30));
        timelabel.setForeground(new Color(0x00FF00));
        timelabel.setBackground(Color.black);
        timelabel.setOpaque(true);
        this.add(timelabel);
        this.add(daylabel);
        this.add(datelabel);
        this.setVisible(true);

        setTime();

    }
    public void setTime(){
        while(true) {
            time = timeformat.format(Calendar.getInstance().getTime());
            timelabel.setText(time);
            day = dayformat.format(Calendar.getInstance().getTime());
            daylabel.setText(day);
            date = dateformat.format(Calendar.getInstance().getTime());
            datelabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
