/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ransanmoi;

import javax.swing.JFrame;

/**
 *
 * @author Admin
 */
public class FrameSceen extends JFrame{
    
    GameScreen gameScreen;
    
    public FrameSceen() {
        gameScreen = new GameScreen();
        add(gameScreen);
    }
    
    public static void main(String[] args) {
        FrameSceen frameSceen = new FrameSceen();
        frameSceen.setVisible(false);
        frameSceen.setSize(600, 600);
    }
}
