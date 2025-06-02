import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;

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
}
