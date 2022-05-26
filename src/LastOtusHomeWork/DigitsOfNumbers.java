package LastOtusHomeWork;

public class DigitsOfNumbers {
    int units;
    int tens;
    int hundreds;
    int thousands;
    int tensThousands;
    int hundredsThousands;

    public void unitsClazz(int number) {
        units = number % 10;
        tens = number / 10 % 10;
        hundreds = number / 100 % 10;
        thousands = number / 1000 % 10;
        tensThousands = number / 10000 % 10;
        hundredsThousands = number / 100000 % 10;
    }
}//
