import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddSubtractGUI extends JFrame implements ActionListener {
    // Declare components
    JTextField num1Field, num2Field;
    JButton addButton, subtractButton;
    JLabel resultLabel;

    public AddSubtractGUI() {
        setTitle("Add & Subtract Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Set layout as 4 rows and 2 columns
        setLayout(new GridLayout(4, 2, 10, 10));

        // Initialize components
        add(new JLabel("First Number:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Second Number:"));
        num2Field = new JTextField();
        add(num2Field);

        addButton = new JButton("Add");
        subtractButton = new JButton("Subtract");
        add(addButton);
        add(subtractButton);

        add(new JLabel("Result:"));
        resultLabel = new JLabel("");
        add(resultLabel);

        // Register action listeners
        addButton.addActionListener(this);
        subtractButton.addActionListener(this);

        // Show frame
        setVisible(true);
    }

    // Handle button actions
    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());

            if (e.getSource() == addButton) {
                resultLabel.setText(Integer.toString(num1 + num2));
            } else if (e.getSource() == subtractButton) {
                resultLabel.setText(Integer.toString(num1 - num2));
            }
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input");
        }
    }

    public static void main(String[] args) {
        new AddSubtractGUI();
    }
}
