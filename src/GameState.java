import java.util.Objects;
import java.util.Optional;

public class GameState {
    private int mode;
    private Object player2;

    public static void mainMenu() {
        System.out.println("Let's Play Roshambo!");
        System.out.println("= = = = = = = = = = =");
        System.out.println("Select Game Mode:");
        System.out.println("1. Player vs. Computer");
        System.out.println("2. Player vs. Player");
        System.out.println("3. Game History");
        System.out.println("Enter 1, 2, or 3 for your menu option or q to quit.");
    }

    public void setMode(Optional<Integer> choice) {
        this.mode = mode;
    }

    public void gamePrompt() {
        System.out.println("\nMake your move!\n1 = rock, 2 = paper, 3 = scissors, q = quit");
    }

    public void onePlayer (Human p1, Computer p2) {
        while (true) {
            gamePrompt();
            int c1 = p1.getChoice();
            int c2 = p2.getChoice();
            p1.getResult(c1,c2);
        }
    }

    public void twoPlayer(Human p1, Human p2) {
        while (true) {
            gamePrompt();
            int c1 = p1.getChoice();
            System.out.println("\n\n");
            gamePrompt();
            int c2 = p2.getChoice();
            p1.getResult(c1,c2);
        }
    }

    public Object createGame(Optional<Integer> mode, Human p1){
        Object player = null;
        if (Objects.equals(mode, Optional.of(1))) {
            System.out.println("Starting 1 player game...");
            player2 = new Computer();
            onePlayer(p1, (Computer) player2);
            player = player2;
        } else if (Objects.equals(mode, Optional.of(2))) {
            System.out.println("Starting 2 player game...");
            player2 = new Human("player2");
            twoPlayer(p1, (Human) player2);
            player = player2;
        }
        return player;
    }

    // exit game function
    public static void exit(){
        System.out.println("Exiting...");
        System.exit(0);
    }
}