/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dinopark;
/**
 *
 * @author NickCarlough
 */
import java.awt.Color;

public class Plant implements IBoardObject{

    @Override
    public Icon getIcon() {
        return new Icon('P',Color.GREEN);
    }

    @Override
    public Position getPosition() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
