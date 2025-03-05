package fr.ynov.java.game;

import java.util.Scanner;

import static fr.ynov.java.game.Choice.Choices.*;

public class Utils {

    public static void newPlayer(Player player) {
        Scanner input = new Scanner(System.in);

        System.out.println("What's your name ?");
        String name = input.nextLine();

        player.setName(name);
    }

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

}
