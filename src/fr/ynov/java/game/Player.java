package fr.ynov.java.game;

public class Player {

    private String name;
    private int score;

        // CONSTRUCTOR

    public Player(String name, int score) {
        setName(name);
        setScore(score);
    }

        // METHODS

    public void addScore() {
        setScore(getScore() + 1);
    }

        // GETTERS

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

        // SETTERS

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
