import javax.swing.*;
import java.awt.Font;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Relogio {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Relógio");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);

        JLabel timeLabel = new JLabel("", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Serif", Font.BOLD, 36));

        frame.getContentPane().add(timeLabel);
        frame.setVisible(true);

        while (true) {
            Calendar cal = new GregorianCalendar();
            int hour = cal.get(Calendar.HOUR);
            int minute = cal.get(Calendar.MINUTE);
            int second = cal.get(Calendar.SECOND);

            String time = String.format("%02d:%02d:%02d", hour, minute, second);
            timeLabel.setText(time);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
