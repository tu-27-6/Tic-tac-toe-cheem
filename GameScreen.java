/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ransanmoi;

import com.sun.prism.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class GameScreen extends JPanel{
    public GameScreen() {
        
    }

    @Override
    public void paint(java.awt.Graphics grphcs) {
        grphcs.fillRect(10, 10, 100, 100);
    }
    
    
}
