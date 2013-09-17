package dinopark;

import javax.swing.JFrame;
import java.awt.Graphics;

public class BasicFrame extends JFrame {

    public BasicFrame(){
        super();
    }

    public void paint(Graphics g) {
        g.drawRect(100, 100, 100, 100);
    }
}
