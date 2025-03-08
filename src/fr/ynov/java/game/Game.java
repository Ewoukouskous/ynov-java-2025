package fr.ynov.java.game;

public class Game {

    public static void game() {

        Player player = new Player("temp", 0);
        Utils.newPlayer(player);
        System.out.println("Welcome " +  player.getName());

        boolean revenge = true;

        while (revenge) {

            System.out.println("-=-=-=-=-=-=-=-=-=-=-");
            Choice.Choices playerChoice = Choice.playerChoice();

            Choice.Choices computerChoice = Choice.computerChoice();
            System.out.println("-=-=-=-=-=-=-=-=-=-=-");

            System.out.println("Your choice: " + playerChoice + "\nComputer choice: " + computerChoice);
            System.out.println("-=-=-=-=-=-=-=-=-=-=-");

            if (Utils.checkRound(playerChoice, computerChoice)) {
                player.addScore();
            }

            if (!Utils.revenge()) {
                revenge = false;
            }
        }
    }
}
