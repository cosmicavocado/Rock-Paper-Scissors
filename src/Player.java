public abstract class Player {
    protected String result;
    public String player;
    public String[] choices = {"rock", "paper", "scissors"};

    Player (String player) {
        this.player = player;
    }

    public abstract int getChoice();

    public String getResult (int p1, int p2) {
        // 0 = rock, 1 = paper, 2 = scissors
        if (p1 == p2) {
            result = "Tie!";
        }
        else if (p1 == 0 && p2 == 1
        || p1 == 1 && p2 == 2
        || p1 == 2 && p2 == 0) {
            result = "Player 2 wins!";
        }
        else if (p1 == 0 && p2 == 2
        || p1 == 1 && p2 == 0
        || p1 == 2 && p2 == 1) {
            result = "Player 1 wins!";
        }
        System.out.println("Player 1 used "+choices[p1]+" and Player 2 used "+choices[p2]+".\n"+result+"\n");
        return result;
    }
}
