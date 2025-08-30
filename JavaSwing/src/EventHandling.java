import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandling {
    public static void main(String[] args) {

        JFrame jFrame = new JFrame("My Swing Application");

        // Set frame size
        jFrame.setSize(500, 400); // width, height

        // Close Operation
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout
        jFrame.setLayout(null);


        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(160, 200, 100, 30);






        jFrame.add(submitButton);

        submitButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent actionEvent){
                JOptionPane.showMessageDialog(jFrame,"Button Clicked");
            }
        });

        jFrame.setVisible(true);
    }
}
