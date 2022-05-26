package Test;

import OtusTest.*;

public class DrawGameTest {
    MyGameWinnerConsolePrinter winner = new MyGameWinnerConsolePrinter();
    Game game = new Game(new MyDiceImplDraw(), winner);

    public void drawGameTest() {
        Player player1 = new Player("Петя");
        Player player2 = new Player("Вова");
        game.playGame(player1, player2);
        Player winPlayer = winner.player;
        if (player2 == winPlayer) {
            System.out.println("Тест не пройден");
        } else {
            System.out.println("Тест пройден");
        }
    }
}
