package Test;

import OtusTest.*;

public class RangeOfNumTest {
    Dice dice = new DiceImpl();

    public void rangeOfNumTest(){
        int actual = dice.roll();
        if(actual>=1 & actual<=6){
            System.out.println("Тест пройден");
        }else {
            System.out.println("Тест не пройден");
        }
    }
}
