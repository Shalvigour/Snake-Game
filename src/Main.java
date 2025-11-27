import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setBackground(Color.GREEN);


        // panel ko center mein daalo
        frame.add(panel, BorderLayout.CENTER);

        frame.setSize(600, 600);  // bas ek initial size
        frame.setVisible(true);
    }
}
