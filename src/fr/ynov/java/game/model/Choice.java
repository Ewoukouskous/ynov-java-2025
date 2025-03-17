package fr.ynov.java.game.model;

public enum Choice {
    ROCK,
    PAPER,
    SCISSORS;

    public boolean beats(Choice other) {
        return (this == ROCK && other == SCISSORS) ||
               (this == PAPER && other == ROCK) ||
               (this == SCISSORS && other == PAPER);
    }
} 