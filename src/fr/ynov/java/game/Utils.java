package fr.ynov.java.game;

import java.util.Scanner;

import static fr.ynov.java.game.Choice.Choices.*;

public class Utils {

        // Method that will create a new player
    public static void newPlayer(Player player) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's your name ?");
        String name = input.nextLine();

        player.setName(name);
    }

        // Method that will check the choices of the player and the computer
            // Will return false if there's an equality, false if the computer wins and true if the player wins
    public static boolean checkRound(Choice.Choices playerChoice, Choice.Choices computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            System.out.println("Equality ! You gain 0 points");
            return false;
        } else if (playerChoice.equals(ROCK) && computerChoice.equals(PAPER) ||  playerChoice.equals(PAPER) && computerChoice.equals(SCISSOR) || playerChoice.equals(SCISSOR) && computerChoice.equals(ROCK)) {
            System.out.println("Computer win, you gain 0 points");
            return false;
        } else if (playerChoice.equals(ROCK) && computerChoice.equals(SCISSOR) || playerChoice.equals(PAPER) && computerChoice.equals(ROCK) || playerChoice.equals(SCISSOR) && computerChoice.equals(PAPER)) {
            System.out.println("You win, you gain 1 points");
            return true;
        }
        return false;
    }

        // Switch case that will ask if the player wants a revenge or not
            // If he wants it return true, false if he doesn't
    public static boolean revenge() {
        Scanner revengeCheck = new Scanner(System.in);
        System.out.println("Do you wan't another game ?\n1. Yes\n2. No");
        int check = revengeCheck.nextInt();

        switch (check) {
            case 1: return true;
            case 2: return false;
            default: System.out.println("Invalid choice. Try again");
        }
        return false;
    }

}
