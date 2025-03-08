package fr.ynov.java.game;

public class Game {

    public static void game() {

            // Create a new player at the start of the game
                // It will ask his name and display it with a "welcome" message
        Player player = new Player("temp", 0);
        Utils.newPlayer(player);
        System.out.println("Welcome " +  player.getName());

            // Loop that contain the logic of the game
                // It will first ask the player his choice
                // Then will randomly choose an option for the computer
                // It will display both of them
                // if the check condition return tha fact that the player win it will add a point for the player
                // else it'll do nothing
                // at the end of the round it will ask if the player want to play again ( revenge ) and restart the loop if he wants
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
