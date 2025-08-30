import javax.swing.*;

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

        submitButton.addActionListner()

        jFrame.setVisible(true);
    }
}
