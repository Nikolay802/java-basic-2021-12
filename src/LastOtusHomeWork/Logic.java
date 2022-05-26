package LastOtusHomeWork;

import java.util.Scanner;

public class Logic {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();

        DigitsOfNumbers digits = new DigitsOfNumbers();
        Words words = new Words();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            int number = scanner.nextInt();
            digits.unitsClazz(number);

            if (digits.hundredsThousands > 0 && digits.hundredsThousands < 10 && digits.thousands == 0) {
                switch (digits.hundredsThousands) {
                    case 1 -> builder.append(words.hundredsW[1] + " " + words.thousandsW[3] + " ");
                    case 2 -> builder.append(words.hundredsW[2] + " " + words.thousandsW[3] + " ");
                    case 3 -> builder.append(words.hundredsW[3] + " " + words.thousandsW[3] + " ");
                    case 4 -> builder.append(words.hundredsW[4] + " " + words.thousandsW[3] + " ");
                    case 5 -> builder.append(words.hundredsW[5] + " " + words.thousandsW[3] + " ");
                    case 6 -> builder.append(words.hundredsW[6] + " " + words.thousandsW[3] + " ");
                    case 7 -> builder.append(words.hundredsW[7] + " " + words.thousandsW[3] + " ");
                    case 8 -> builder.append(words.hundredsW[8] + " " + words.thousandsW[3] + " ");
                    case 9 -> builder.append(words.hundredsW[9] + " " + words.thousandsW[3] + " ");
                }
            } else {
                switch (digits.hundredsThousands) {
                    case 1 -> builder.append(words.hundredsW[1] + " ");
                    case 2 -> builder.append(words.hundredsW[2] + " ");
                    case 3 -> builder.append(words.hundredsW[3] + " ");
                    case 4 -> builder.append(words.hundredsW[4] + " ");
                    case 5 -> builder.append(words.hundredsW[5] + " ");
                    case 6 -> builder.append(words.hundredsW[6] + " ");
                    case 7 -> builder.append(words.hundredsW[7] + " ");
                    case 8 -> builder.append(words.hundredsW[8] + " ");
                    case 9 -> builder.append(words.hundredsW[9] + " ");
                }
            }
            if (digits.tensThousands >= 0 && digits.tensThousands < 10 && digits.thousands == 0) {
                switch (digits.tensThousands) {
                    case 2 -> builder.append(words.tensW[2] + " " + words.thousandsW[3] + " ");
                    case 3 -> builder.append(words.tensW[3] + " " + words.thousandsW[3] + " ");
                    case 4 -> builder.append(words.tensW[4] + " " + words.thousandsW[3] + " ");
                    case 5 -> builder.append(words.tensW[5] + " " + words.thousandsW[3] + " ");
                    case 6 -> builder.append(words.tensW[6] + " " + words.thousandsW[3] + " ");
                    case 7 -> builder.append(words.tensW[7] + " " + words.thousandsW[3] + " ");
                    case 8 -> builder.append(words.tensW[8] + " " + words.thousandsW[3] + " ");
                    case 9 -> builder.append(words.tensW[9] + " " + words.thousandsW[3] + " ");
                }
            } else {
                switch (digits.tensThousands) {
                    case 2 -> builder.append(words.tensW[2] + " ");
                    case 3 -> builder.append(words.tensW[3] + " ");
                    case 4 -> builder.append(words.tensW[4] + " ");
                    case 5 -> builder.append(words.tensW[5] + " ");
                    case 6 -> builder.append(words.tensW[6] + " ");
                    case 7 -> builder.append(words.tensW[7] + " ");
                    case 8 -> builder.append(words.tensW[8] + " ");
                    case 9 -> builder.append(words.tensW[9] + " ");
                }
            }
            if (digits.tensThousands == 1 && digits.thousands >= 0 && digits.thousands < 10) {
                switch (digits.thousands) {
                    case 0 -> builder.append(words.tensW[1] + " " + words.thousandsW[3] + " ");
                    case 1 -> builder.append(words.excTensW[1] + " " + words.thousandsW[3] + " ");
                    case 2 -> builder.append(words.excTensW[2] + " " + words.thousandsW[3] + " ");
                    case 3 -> builder.append(words.excTensW[3] + " " + words.thousandsW[3] + " ");
                    case 4 -> builder.append(words.excTensW[4] + " " + words.thousandsW[3] + " ");
                    case 5 -> builder.append(words.excTensW[5] + " " + words.thousandsW[3] + " ");
                    case 6 -> builder.append(words.excTensW[6] + " " + words.thousandsW[3] + " ");
                    case 7 -> builder.append(words.excTensW[7] + " " + words.thousandsW[3] + " ");
                    case 8 -> builder.append(words.excTensW[8] + " " + words.thousandsW[3] + " ");
                    case 9 -> builder.append(words.excTensW[9] + " " + words.thousandsW[3] + " ");
                }
            }
            if (digits.thousands > 0 && digits.thousands < 10 && digits.tensThousands != 1) {
                switch (digits.thousands) {
                    case 1 -> builder.append(words.femaleUnits[1] + " " + words.thousandsW[1] + " ");
                    case 2 -> builder.append(words.femaleUnits[2] + " " + words.thousandsW[2] + " ");
                    case 3 -> builder.append(words.unitsW[3] + " " + words.thousandsW[2] + " ");
                    case 4 -> builder.append(words.unitsW[4] + " " + words.thousandsW[2] + " ");
                    case 5 -> builder.append(words.unitsW[5] + " " + words.thousandsW[3] + " ");
                    case 6 -> builder.append(words.unitsW[6] + " " + words.thousandsW[3] + " ");
                    case 7 -> builder.append(words.unitsW[7] + " " + words.thousandsW[3] + " ");
                    case 8 -> builder.append(words.unitsW[8] + " " + words.thousandsW[3] + " ");
                    case 9 -> builder.append(words.unitsW[9] + " " + words.thousandsW[3] + " ");
                }
            }
            if (digits.hundreds > 0 && digits.hundreds < 10) {
                switch (digits.hundreds) {
                    case 1 -> builder.append(words.hundredsW[1] + " ");
                    case 2 -> builder.append(words.hundredsW[2] + " ");
                    case 3 -> builder.append(words.hundredsW[3] + " ");
                    case 4 -> builder.append(words.hundredsW[4] + " ");
                    case 5 -> builder.append(words.hundredsW[5] + " ");
                    case 6 -> builder.append(words.hundredsW[6] + " ");
                    case 7 -> builder.append(words.hundredsW[7] + " ");
                    case 8 -> builder.append(words.hundredsW[8] + " ");
                    case 9 -> builder.append(words.hundredsW[9] + " ");
                }
            }
            if (digits.tens < 10 && digits.tens > 1) {
                switch (digits.tens) {
                    case 2 -> builder.append(words.tensW[2] + " ");
                    case 3 -> builder.append(words.tensW[3] + " ");
                    case 4 -> builder.append(words.tensW[4] + " ");
                    case 5 -> builder.append(words.tensW[5] + " ");
                    case 6 -> builder.append(words.tensW[6] + " ");
                    case 7 -> builder.append(words.tensW[7] + " ");
                    case 8 -> builder.append(words.tensW[8] + " ");
                    case 9 -> builder.append(words.tensW[9] + " ");
                }
            }
            if (digits.tens == 1) {
                switch (digits.units) {
                    case 0 -> builder.append(words.tensW[1] + " " + words.currency[3]);
                    case 1 -> builder.append(words.excTensW[1] + " " + words.currency[3]);
                    case 2 -> builder.append(words.excTensW[2] + " " + words.currency[3]);
                    case 3 -> builder.append(words.excTensW[3] + " " + words.currency[3]);
                    case 4 -> builder.append(words.excTensW[4] + " " + words.currency[3]);
                    case 5 -> builder.append(words.excTensW[5] + " " + words.currency[3]);
                    case 6 -> builder.append(words.excTensW[6] + " " + words.currency[3]);
                    case 7 -> builder.append(words.excTensW[7] + " " + words.currency[3]);
                    case 8 -> builder.append(words.excTensW[8] + " " + words.currency[3]);
                    case 9 -> builder.append(words.excTensW[9] + " " + words.currency[3]);
                }
            }
            if (digits.tens != 1) {
                switch (digits.units) {
                    case 0 -> builder.append(words.currency[3]);
                    case 1 -> builder.append(words.unitsW[1] + " " + words.currency[1]);
                    case 2 -> builder.append(words.unitsW[2] + " " + words.currency[2]);
                    case 3 -> builder.append(words.unitsW[3] + " " + words.currency[2]);
                    case 4 -> builder.append(words.unitsW[4] + " " + words.currency[2]);
                    case 5 -> builder.append(words.unitsW[5] + " " + words.currency[3]);
                    case 6 -> builder.append(words.unitsW[6] + " " + words.currency[3]);
                    case 7 -> builder.append(words.unitsW[7] + " " + words.currency[3]);
                    case 8 -> builder.append(words.unitsW[8] + " " + words.currency[3]);
                    case 9 -> builder.append(words.unitsW[9] + " " + words.currency[3]);
                }
            }
            String res = builder.toString();
            System.out.println(res);
            builder.setLength(0);
        }
    }
}


