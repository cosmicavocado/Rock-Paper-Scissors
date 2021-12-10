import java.util.Scanner;

public class Human extends Player{

    Human(String player) {
        super(player);
    }

    @Override
    public int getChoice() {
        int input = 0;
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        if (str.equals("1") || str.equals("2") || str.equals("3") && !str.isEmpty()) {
            input = Integer.parseInt(str);
        } else if (str.equals("q")) {
            GameState.exit();
        }
        else {
            System.out.println("Please enter valid input.");
        }
        return input;
    }

}
