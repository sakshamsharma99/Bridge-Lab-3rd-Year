class Game {
    static int totalGames = 0;
    final String gameCode;
    String name;
    String type;

    Game(String gameCode, String name, String type) {
        this.gameCode = gameCode;
        this.name = name;
        this.type = type;
        totalGames++;
    }

    static void displayTotalGames() {
        System.out.println("Total Games: " + totalGames);
    }

    void displayGame() {
        if (this instanceof Game) {
            System.out.println("Code: " + gameCode + ", Name: " + name + ", Type: " + type);
        }
    }
}

public class Q9 {
    public static void main(String[] args) {
        Game g1 = new Game("G101", "Chess", "Board");
        Game g2 = new Game("G102", "Football", "Outdoor");
        Game.displayTotalGames();
        g1.displayGame();
        g2.displayGame();
    }
}
