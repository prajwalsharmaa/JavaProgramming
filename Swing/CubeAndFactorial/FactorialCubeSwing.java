import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FactorialCubeSwing extends JFrame implements MouseListener {
    // Declare components
    JTextField inputField;   // For input
    JLabel resultLabel;      // To display result
    JButton resultButton;    // Button to trigger operations

    public FactorialCubeSwing() {
        // Set up frame
        setTitle("Factorial and Cube Calculator");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Initialize components
        inputField = new JTextField(10);                      // Input text field
        resultButton = new JButton("Result");                 // Button
        resultLabel = new JLabel("Result will be shown here"); // Result label

        // Add components to the frame
        add(new JLabel("Enter a number:"));
        add(inputField);
        add(resultButton);
        add(resultLabel);

        // Add mouse listener to the button
        resultButton.addMouseListener(this);

        // Make the frame visible
        setVisible(true);
    }

    // Mouse Pressed: Calculate Factorial
    public void mousePressed(MouseEvent e) {
        try {
            int num = Integer.parseInt(inputField.getText());
            int fact = 1;
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            resultLabel.setText("Factorial: " + fact);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input!");
        }
    }

    // Mouse Released: Calculate Cube
    public void mouseReleased(MouseEvent e) {
        try {
            int num = Integer.parseInt(inputField.getText());
            int cube = num * num * num;
            resultLabel.setText("Cube: " + cube);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input!");
        }
    }

    // Unused MouseListener methods
    public void mouseClicked(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    // Main method to run the GUI
    public static void main(String[] args) {
        new FactorialCubeSwing();
    }
}
