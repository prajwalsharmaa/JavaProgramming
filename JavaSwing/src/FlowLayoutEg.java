import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutEg {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("My Swing Application");

        // Set frame size
        jFrame.setSize(500, 400); // width, height

        // Close Operation
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout
        jFrame.setLayout(new FlowLayout());


        JButton button1 = new JButton("Submit");
//        button1.setBounds(160, 200, 100, 30);
        JButton button2 = new JButton("Submit");
//        button2.setBounds(160, 250, 100, 30);
        JButton button3 = new JButton("Submit");
//        button3.setBounds(160, 300, 100, 30);







        jFrame.add(button1);
        jFrame.add(button2);
        jFrame.add(button3);

        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent actionEvent){
                JOptionPane.showMessageDialog(jFrame,"Button Clicked");
            }
        });

        jFrame.setVisible(true);


    }
}
