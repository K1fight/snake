import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GraphicsTest extends JFrame {
    public GraphicsTest(){
        setTitle("Graphics Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add the custom drawing panel
        add(new DrawingPanel());
        requestFocusInWindow();
        setFocusable(true);
    }
}
 class DrawingPanel extends JPanel implements KeyListener {
//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);
//
//        // Draw text
//        g.drawString("Hello, Graphics!", 50, 250);
//    }

     @Override
     public void keyTyped(KeyEvent keyEvent) {

     }

     @Override
     public void keyPressed(KeyEvent keyEvent) {
        char key = keyEvent.getKeyChar();
        System.out.println(key);
     }

     @Override
     public void keyReleased(KeyEvent keyEvent) {

     }
 }
