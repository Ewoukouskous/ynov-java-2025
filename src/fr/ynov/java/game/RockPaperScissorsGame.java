package fr.ynov.java.game;

import fr.ynov.java.game.model.Choice;
import fr.ynov.java.game.model.GameLogic;
import fr.ynov.java.game.view.ChoiceButton;
import fr.ynov.java.game.view.GameFrame;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class RockPaperScissorsGame {
    private final GameLogic gameLogic;
    private final GameFrame gameFrame;

    public RockPaperScissorsGame() {
        String playerName = JOptionPane.showInputDialog(null,
            "Enter your name:",
            "Welcome to Rock, Paper, Scissors!",
            JOptionPane.QUESTION_MESSAGE);

        if (playerName == null || playerName.trim().isEmpty()) {
            playerName = "Player";
        }

        this.gameLogic = new GameLogic(playerName);
        this.gameFrame = new GameFrame(gameLogic);
        setupGame();
    }

    private void setupGame() {
        // Add action listener to the choice buttons
        gameFrame.getGamePanel().addChoiceButtonListener(e -> {
            ChoiceButton button = (ChoiceButton) e.getSource();
            Choice playerChoice = button.getChoice();

            // Play the round
            gameLogic.playRound(playerChoice);

            // Update the UI
            gameFrame.getGamePanel().updateResult(gameLogic.getResult(playerChoice));
            gameFrame.getGamePanel().updateComputerChoice(gameLogic.getComputerChoice());
            gameFrame.getGamePanel().updatePlayerChoice(playerChoice);
            gameFrame.getGamePanel().updateScore();
        });
    }

    public void start() {
        gameFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            RockPaperScissorsGame game = new RockPaperScissorsGame();
            game.start();
        });
    }
}
