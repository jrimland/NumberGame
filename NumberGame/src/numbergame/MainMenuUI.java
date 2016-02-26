/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numbergame;

import java.awt.Container;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author laurenritter
 */
public class MainMenuUI extends JFrame{
    private JFrame mainFrame;
    private JPanel mainPanel;
    private JButton startButton;
    private GameView theGameView;
    
    MainMenuUI(){
        mainFrame = new JFrame();
        mainPanel = new JPanel();
        startButton = new JButton("Start Game!");
        
        initCustomComponents();
    }
    
    public void initCustomComponents(){
        this.setLocationRelativeTo(null);
        this.setSize(350, 400);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        mainFrame.add(mainPanel);
        mainPanel.add(startButton);
        
        startButton.addActionListener(new java.awt.event.ActionListener(){
            public void actionPerformed(ActionEvent e){
                startButtonActionPerformed(e);
            }
        });
        mainFrame.setVisible(true);
    }
    
    public void switchPanels(){
        getContentPane().removeAll();
        add(theGameView);
        invalidate();
        repaint();
    }
    
    public void startButtonActionPerformed(ActionEvent e){
        switchPanels();
    }
}
