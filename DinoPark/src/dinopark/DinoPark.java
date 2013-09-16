/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dinopark;

/**
 *
 * @author NickCarlough
 */
public class DinoPark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BasicFrame frame = new BasicFrame();
        frame.setSize(800, 600); //TODO: Get rid of the "magic numbers"
        frame.setVisible(true);

        while(true) { //TODO: Update the loop to break out when appropriate
            //TODO: Execute app logic
            frame.repaint();
        }
    }
}
