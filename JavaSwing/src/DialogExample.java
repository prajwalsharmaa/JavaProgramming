import javax.swing.*;

public class DialogExample {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"This is a message dialog");

        int choice = JOptionPane.showConfirmDialog(null,"Do you want to continue?");

        if(choice == JOptionPane.YES_OPTION){
            String name = JOptionPane.showInputDialog("Enter Your Name");
            JOptionPane.showMessageDialog(null,"Hello " + name +"!");
        }
    }
}
