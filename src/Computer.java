public class Computer extends Player{

    public Computer() {
        super("Computer");
    }

    @Override
    public int getChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        int choice = (int) (Math.random() * choices.length);
        return choice;
    }

}
