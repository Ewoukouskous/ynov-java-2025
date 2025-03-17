package fr.ynov.java.game.model;

import java.util.Random;

public class GameLogic {
    private final Player humanPlayer;
    private final Player computerPlayer;
    private final Random random;
    private Choice computerChoice;

    public GameLogic(final String playerName) {
        this.humanPlayer = new Player(playerName);
        this.computerPlayer = new Player("Computer");
        this.random = new Random();
    }

    public void playRound(final Choice playerChoice) {
        computerChoice = Choice.values()[random.nextInt(Choice.values().length)];

        if (playerChoice.beats(computerChoice)) {
            humanPlayer.incrementScore();
        } else if (computerChoice.beats(playerChoice)) {
            computerPlayer.incrementScore();
        }
    }

    public String getResult(final Choice playerChoice) {
        if (playerChoice == computerChoice) {
            return "It's a tie!";
        } else if (playerChoice.beats(computerChoice)) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }

    public Choice getComputerChoice() {
        return computerChoice;
    }

    public Player getHumanPlayer() {
        return humanPlayer;
    }

    public Player getComputerPlayer() {
        return computerPlayer;
    }
}
