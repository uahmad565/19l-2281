abstract class Player {
    String name;

    abstract public int next();
}

class HPlayer extends Player {

    public int next() {
        System.out.println("Next() called from Human Player.");
        return 1;
    }
}

abstract class NaiveAI extends Player {

    abstract public int next();
}

class BinaySAI extends NaiveAI {
    public int next() {
        System.out.println("Binary AI of Naive AI Player...");
        return 1;
    }
}

class SuperAI extends NaiveAI {
    public int next() {
        System.out.println("Super AI of Naive AI Player...");
        return 1;
    }
}

class Game {

    int secret_number;
    int high;
    int low;
    boolean win_flag;
    Player player;

    public Game(Player player) {
        this.player = player;
    }

    public void run() {
        player.next();
        high++;
    }

    public boolean hasWon() {
        return win_flag;
    }
}

class Q3 {
    public static void main(String arg[]) {

        Player humarPlayer = new HPlayer();
        Player binaryAI = new BinaySAI();
        Player superAI = new SuperAI();
        Game game1 = new Game(humarPlayer);
        Game game2 = new Game(binaryAI);
        Game game3 = new Game(superAI);

        game1.run();
        game2.run();
        game3.run();

    }
}
