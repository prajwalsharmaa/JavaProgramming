import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BoarderLayout {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Border Layout Example");
        jFrame.setSize(600,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        jFrame.setLayout(new BorderLayout());

        jFrame.add(new JButton("North"),BorderLayout.NORTH);
        jFrame.add(new JButton("South"),BorderLayout.SOUTH);
        jFrame.add(new JButton("East"),BorderLayout.EAST);
        jFrame.add(new JButton("West"),BorderLayout.WEST);
        jFrame.add(new JButton("Center"),BorderLayout.CENTER);

        jFrame.setVisible(true);        
    }
}