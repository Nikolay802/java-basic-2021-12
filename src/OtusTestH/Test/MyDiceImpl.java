package Test;

import OtusTest.Dice;

public class MyDiceImpl implements Dice {
    int count = 0;

    @Override
    public int roll() {
        if (count == 0) {
            count++;
            return 6;
        } else {
            return 1;
        }
    }
}
