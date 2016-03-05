/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author junggue
 */
public class GameView extends JFrame {

    private GameController theGameCntroller;
    private GameUI theGameUI;
    private MainMenuUI theMainMenu;
    private Instructions theInstructions;
    private JPanel mainMenuPanel;
    private JPanel instructionsPanel;

    public GameView(GameController parentGameController) {
        theMainMenu = new MainMenuUI();
        theInstructions = new Instructions();
        theGameCntroller = parentGameController;
        theGameUI = new GameUI(parentGameController);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initCustomComponents();
    }
    
    public void initCustomComponents(){
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.add(theGameUI);
        
  

        
    }
    
//    public void switchToMainMenu(){
//        frame.removeAll();
//        frame.add(theMainMenu);
//        repaint();
//        revalidate();
//    }
//    
//    public void switchToInstructions(){
//        frame.removeAll();
//        frame.add(theInstructions);
//        repaint();
//        revalidate();
//    }
}
