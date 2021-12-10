public abstract class Player {
    protected String result;
    protected int choice;
    public String player;

    Player (String player) {
        this.player = player;
    }

    public abstract int getChoice();

    public String getResult (int p1, int p2) {
        // 0 = rock, 1 = paper, 2 = scissors
        if (p1 == p2) {
            result = "Tie";
        }
        else if (p1 == 0 && p2 == 1
        || p1 == 1 && p2 == 2
        || p1 == 2 && p2 == 0) {
            result = "p2";
        }
        else if (p1 == 0 && p2 == 2
        || p1 == 1 && p2 == 0
        || p1 == 2 && p2 == 1) {
            result = "p1";
        }
        System.out.println(result+"\n");
        return result;
    }

}
