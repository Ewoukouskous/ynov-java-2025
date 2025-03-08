package fr.ynov.java.game;

public class Game {

    public static void game() {

        Player player = new Player("temp", 0);
        Utils.newPlayer(player);
        System.out.println("Welcome " +  player.getName());
        System.out.println("-=-=-=-=-=-=-=-=-=-=-");

        Choice.Choices playerChoice = Choice.playerChoice();
        System.out.println("-=-=-=-=-=-=-=-=-=-=-");

        Choice.Choices computerChoice = Choice.computerChoice();

        System.out.println("Your choice: " + playerChoice + "\nComputer choice: " + computerChoice);

        if (Utils.checkRound(playerChoice, computerChoice)) {
            player.addScore();
        }

    }

    // proposition de la revanche

}
