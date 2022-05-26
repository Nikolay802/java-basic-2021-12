package Test;

import OtusTest.Game;
import OtusTest.Player;

public class NullTest {
    MyGameWinnerConsolePrinter winner = new MyGameWinnerConsolePrinter();
    Game test2 = new Game(new MyDiceImpl(), winner);

    public void nullTest(){
        Player expectedPlayer = new Player("Павел");
        test2.playGame(expectedPlayer, new Player("Евгений"));
        Player actualPlayer = winner.player;// почему возвращает null, если переместить эту переменную на первую строчку метода?
        if (actualPlayer==null | expectedPlayer==null){
            System.out.println("Тест не пройден");
        } else {
            System.out.println("Тест пройден");
        }
    }
}

