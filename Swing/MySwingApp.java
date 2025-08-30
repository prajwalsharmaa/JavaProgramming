import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class MySwingApp {
    public static void main(String[] args) {
        // Create a frame
        JFrame jFrame = new JFrame("My Swing Application");

        // Set frame size
        jFrame.setSize(500, 400); // width, height

        // Close Operation
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout
        jFrame.setLayout(null);

        // Username
        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 30, 100, 30);
        JTextField usernameField = new JTextField();
        usernameField.setBounds(160, 30, 200, 30);

        // Full Name
        JLabel nameLabel = new JLabel("Full Name:");
        nameLabel.setBounds(50, 70, 100, 30);
        JTextField nameField = new JTextField();
        nameField.setBounds(160, 70, 200, 30);

        // Phone Number
        JLabel phoneLabel = new JLabel("Phone Number:");
        phoneLabel.setBounds(50, 110, 100, 30);
        JTextField phoneField = new JTextField();
        phoneField.setBounds(160, 110, 200, 30);

        // Password
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 150, 100, 30);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(160, 150, 200, 30);

        // Submit Button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(160, 200, 100, 30);

        // Add components to frame
        jFrame.add(usernameLabel);
        jFrame.add(usernameField);
        jFrame.add(nameLabel);
        jFrame.add(nameField);
        jFrame.add(phoneLabel);
        jFrame.add(phoneField);
        jFrame.add(passwordLabel);
        jFrame.add(passwordField);
        jFrame.add(submitButton);

        // Set visibility
        jFrame.setVisible(true);
    }
}
