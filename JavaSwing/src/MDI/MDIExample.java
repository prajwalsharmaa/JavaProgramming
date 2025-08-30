package MDI;
//MDI (Multiple Document Interface)
import javax.swing.*;

public class MDIExample extends JFrame {
    private JDesktopPane desktopPane;
    public MDIExample(){
        setTitle("MDI Example using JDeskTopPane and JInternalFrame");
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Create thd desktop pane

        desktopPane = new JDesktopPane();
        add(desktopPane);

        //Create a menu bar

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Add a menu
        JMenu menu = new JMenu("File");
        menuBar.add(menu);

        //Add a menu item to create a new internal frame

        JMenuItem newItem = new JMenuItem("File");
        newItem.addActionListener(e -> createInternalFrame());
        menu.add(newItem);

        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(e -> System.exit(0));
        menu.add(exitItem);
    }

    private void createInternalFrame() {
        //create a new internal frame
        JInternalFrame internalFrame = new JInternalFrame("Internal Frame",true,true,true,true);
        internalFrame.setSize(300,200);
        internalFrame.setVisible(true);

        //Add it to the desktop pane
        desktopPane.add(internalFrame);

        try{
            internalFrame.setSelected(true);
        }catch (java.beans.PropertyVetoException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() ->{
            new MDIExample().setVisible(true);
        });
    }
    //JTable
    //JTextArea
}
