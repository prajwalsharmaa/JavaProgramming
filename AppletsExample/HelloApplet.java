import java.applet.Applet;
import java.awt.*;

// Applet class must extend Applet
public class HelloApplet extends Applet {
    public void paint(Graphics g) {
        g.drawString("Hello, Applets!", 50, 50);
    }
}