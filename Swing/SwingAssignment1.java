import javax.swing.*;
import java.awt.*;

public class AS_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Jcheckbox  RadioButton JCombo Box");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(2, 2));

        JCheckBox checkBox = new JCheckBox("I agree to all terms and conditions");
        JRadioButton radioButton = new JRadioButton("Option A");
        JComboBox<String> comboBox = new JComboBox<>(new String[] {"Banana", "Apple", "Strawberry"});

        frame.add(checkBox);
        frame.add(radioButton);
        frame.add(comboBox);
        frame.add(new JButton("Submit"));

        frame.setVisible(true);
    }
}