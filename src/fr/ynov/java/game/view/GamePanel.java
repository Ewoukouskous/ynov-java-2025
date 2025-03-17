package fr.ynov.java.game.view;

import fr.ynov.java.game.model.Choice;
import fr.ynov.java.game.model.GameLogic;
import fr.ynov.java.game.model.Player;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

public class GamePanel extends JPanel {
    private final GameLogic gameLogic;
    private final JLabel resultLabel;
    private final JLabel scoreLabel;
    private final JLabel computerChoiceLabel;
    private final JLabel playerChoiceLabel;
    private final JPanel choicesPanel;
    private final JPanel infoPanel;
    private final JButton exitButton;

    static final Font BOLD_FONT = new Font("Arial", Font.BOLD, 20);
    static final Font STANDARD_FONT = new Font("Arial", Font.PLAIN, 16);

    public GamePanel(final GameLogic gameLogic) {
        this.gameLogic = gameLogic;
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // Create and setup components
        resultLabel = new JLabel("Choose your move!", SwingConstants.CENTER);
        resultLabel.setFont(BOLD_FONT);

        scoreLabel = new JLabel("Score: 0 - 0", SwingConstants.CENTER);
        scoreLabel.setFont(STANDARD_FONT);

        computerChoiceLabel = new JLabel("Computer's choice: ", SwingConstants.CENTER);
        computerChoiceLabel.setFont(STANDARD_FONT);

        playerChoiceLabel = new JLabel("Your choice: ", SwingConstants.CENTER);
        playerChoiceLabel.setFont(STANDARD_FONT);

        // Create choice buttons
        choicesPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        for (Choice choice : Choice.values()) {
            ChoiceButton button = new ChoiceButton(choice);
            choicesPanel.add(button);
        }

        // Create info panel
        infoPanel = new JPanel(new GridLayout(4, 1, 5, 5));
        infoPanel.add(resultLabel);
        infoPanel.add(scoreLabel);
        infoPanel.add(computerChoiceLabel);
        infoPanel.add(playerChoiceLabel);

        // Create exit button
        exitButton = new JButton("Exit");
        exitButton.addActionListener(e -> {
            int choice = JOptionPane.showConfirmDialog(null,
                "Are you sure you want to exit the game?",
                "Exit Game",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

            if (choice == JOptionPane.YES_OPTION) {
                System.exit(0);
            }
        });

        // Add components to the panel
        add(infoPanel, BorderLayout.NORTH);
        add(choicesPanel, BorderLayout.CENTER);
        add(exitButton, BorderLayout.SOUTH);
    }

    public void updateScore() {
        Player human = gameLogic.getHumanPlayer();
        Player computer = gameLogic.getComputerPlayer();
        scoreLabel.setText(String.format("Score: %s %d - %d %s",
            human.getName(), human.getScore(),
            computer.getScore(), computer.getName()));
    }

    public void updateResult(final String result) {
        resultLabel.setText(result);
    }

    public void updateComputerChoice(final Choice choice) {
        computerChoiceLabel.setText("Computer's choice: " + choice.name());
    }

    public void updatePlayerChoice(final Choice choice) {
        playerChoiceLabel.setText("Your choice: " + choice.name());
    }

    public void addChoiceButtonListener(final ActionListener listener) {
        for (Component component : choicesPanel.getComponents()) {
            if (component instanceof ChoiceButton) {
                ((ChoiceButton) component).addActionListener(listener);
            }
        }
    }
}
