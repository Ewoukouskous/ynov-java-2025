package fr.ynov.java.game;

import java.util.Random;
import java.util.Scanner;

public class Choice {

    public enum Choices {
        ROCK,
        PAPER,
        SCISSOR
    }

    public static Choices playerChoice() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an option \n1. rock \n2. paper \n3. scissor");
            int playerChoice = input.nextInt();

            switch (playerChoice) {
                case 1:
                    return Choices.ROCK;
                case 2:
                    return Choices.PAPER;
                case 3:
                    return Choices.SCISSOR;
                default:
                    System.out.println("Invalid choice, please try again Maître suprême.");
            }
        }
    }

    public static Choices computerChoice() {
        Choices[] choices = Choices.values();
        int randomIndex = new Random().nextInt(choices.length);
        return choices[randomIndex];
    }
}
