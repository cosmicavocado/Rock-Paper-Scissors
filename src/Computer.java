public class Computer extends Player{

    public Computer(String player) {
        super(player);
    }

    public Computer() {
        super("Computer");
    }

    @Override
    public int getChoice() {
        int choice = (int) (Math.random() * choices.length);
        return choice;
    }

}
