package Test;

import OtusTest.Game;
import OtusTest.Player;

public class CorrectWinnerTest{
    MyGameWinnerConsolePrinter winner = new MyGameWinnerConsolePrinter();
    Game test2 = new Game(new MyDiceImpl(), winner);

    public void correctWinner(){
        Player expectedPlayer = new Player("Павел");
        test2.playGame(expectedPlayer, new Player("Евгений"));
        Player actualPlayer = winner.player;// почему возвращает null, если переместить эту переменную на первую строчку метода?
        if (actualPlayer != expectedPlayer) {
            throw new AssertionError(String.format("Expected %s = %s", expectedPlayer, actualPlayer));
        } else {
            System.out.println("Тест пройден");
        }
    }
}
