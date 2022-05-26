package OtusProject;

import java.util.Scanner;

public class Logic {

    Scanner scanner = new Scanner(System.in);

    Counter counter = new Counter();

    public void logic(int answer) {
        while (!scanner.hasNextInt()) {
            System.out.println("Неверные данные. Введите число.");
            scanner.next();
        }
        int answer1 = scanner.nextInt();
        if (answer1 == answer) {
            System.out.println("Правильный ответ");
            counter.getPositiveAnswer();
            counter.positiveAnswer++;
        } else {
            System.out.println("Неправильный ответ");
            counter.getNegativeAnswer();
            counter.negativeAnswer++;
        }
    }

    public void finish() {
        System.out.println("Результат: Правильных ответов - " + counter.positiveAnswer + "  Неправильных ответов - " + counter.negativeAnswer);
    }
}