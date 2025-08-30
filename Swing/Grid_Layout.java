import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Grid_Layout {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Grid Layout Example");
        jFrame.setSize(600,500);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        jFrame.setLayout(new GridLayout(2,3));

        for (int i = 1; i <= 10; i++) {
            jFrame.add(new JButton("Button" + i ));    
        }

        jFrame.setVisible(true);
    }
}
///Jcheckbox  RadioButton JCombo Box