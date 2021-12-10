import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Human player1 = new Human("player1");
        GameState game = new GameState();

        // Menu
        game.mainMenu();
        Optional<Integer> choice = Optional.ofNullable(player1.getChoice());
        game.setMode(choice);

        // Create Game of Desired Game Mode
        game.createGame(choice, player1);
    }
}
