import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppletControls extends Applet {
    TextField textfield;
    Button button;
    
    public void init() {
        textfield = new TextField(20);
        button = new Button("Click me");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textfield.setText("Button clicked!!");
            }
        });
        
        // Add components to the applet
        add(textfield);
        add(button);
}
}
