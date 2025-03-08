package fr.ynov.java.game;

import java.util.Random;
import java.util.Scanner;

public class Choice {

    public enum Choices {
        ROCK,
        PAPER,
        SCISSOR
    }

        // Big switch case that ask the player which option he wants
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

        // Will randomly choose the choice of the computer
    public static Choices computerChoice() {
        Choices[] choices = Choices.values();
        int randomIndex = new Random().nextInt(choices.length);
        return choices[randomIndex];
    }
}
