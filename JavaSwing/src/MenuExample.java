import javax.swing.*;

public class MenuExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Example");
        frame.setSize(350,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        // Menu Bar
        JMenuBar menuBar = new JMenuBar();


        JMenu fileMenu = new JMenu("File");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");


        fileMenu.add(openItem);
        fileMenu.add(saveItem);
        menuBar.add(fileMenu);



        frame.setJMenuBar(menuBar);
        frame.setVisible(true);


    }
}
