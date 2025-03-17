package fr.ynov.java.game.view;

import fr.ynov.java.game.model.GameLogic;
import javax.swing.JFrame;

public class GameFrame extends JFrame {
    private final GamePanel gamePanel;


    public GameFrame(GameLogic gameLogic) {
        gamePanel = new GamePanel(gameLogic);
        setupFrame();
    }


    private void setupFrame() {
        setTitle("Rock, Paper, Scissors");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        add(gamePanel);
        pack();
    }

    public GamePanel getGamePanel() {
        return gamePanel;
    }
}
