package javakeylistener;
import javax.swing.JFrame;
/**
 *
 * @author Emre Bektas
 */
public class JavaKeyListener {
    public static void main(String[] args) {
        myOwnKeyListener klavye = new myOwnKeyListener();
        JFrame frame = new JFrame();
        frame.setTitle("Java Key Listener Event_Emre Bektaş");
        frame.setSize(400, 200);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(klavye);
        frame.setVisible(true);
    }
}
