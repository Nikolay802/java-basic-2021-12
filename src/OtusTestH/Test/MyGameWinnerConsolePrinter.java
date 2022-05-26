package Test;

import OtusTest.GameWinnerPrinter;
import OtusTest.Player;

public class MyGameWinnerConsolePrinter implements GameWinnerPrinter {
    Player player;

    @Override
    public void printWinner(Player winner) {
            this.player = winner;
    }
}
