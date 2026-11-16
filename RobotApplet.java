import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Draws a simple robot with AWT graphics.
 *
 * Runs as a classic applet (appletviewer) or as a normal desktop app:
 *   javac RobotApplet.java
 *   java RobotApplet
 */

public class RobotApplet extends Applet {
    
    @Override
    public void init() {
        setSize(400, 400);
        setBackground(Color.WHITE);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        // Draw a simple robot (rectangle for body and circle for head)
        g.setColor(Color.BLUE);
        g.fillRect(150, 200, 100, 150);  // Body
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(170, 130, 60, 70);    // Head
        
        g.setColor(Color.BLACK);
        g.fillOval(185, 150, 10, 10);    // Left Eye
        g.fillOval(205, 150, 10, 10);    // Right Eye
        
        g.setColor(Color.RED);
        g.fillRect(190, 210, 20, 10);    // Mouth
        
        // Draw arms and legs
        g.setColor(Color.GREEN);
        g.drawLine(150, 230, 120, 270);  // Left Arm
        g.drawLine(250, 230, 280, 270);  // Right Arm
        g.drawLine(170, 350, 170, 400);  // Left Leg
        g.drawLine(230, 350, 230, 400);  // Right Leg
    }

    /** Desktop entry point: shows the applet inside an AWT window. */
    public static void main(String[] args) {
        final RobotApplet applet = new RobotApplet();
        applet.setPreferredSize(new Dimension(400, 400));

        final Frame frame = new Frame("Robot Applet");
        frame.add(applet);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                applet.stop();
                applet.destroy();
                frame.dispose();
                System.exit(0);
            }
        });

        applet.init();
        frame.pack();
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        applet.start();
    }
}
