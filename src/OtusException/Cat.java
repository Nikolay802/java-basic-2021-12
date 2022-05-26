

package OtusException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Cat extends Animal {

    public Cat() {
        super("Барсик", "Мяу");
    }

    public void guessWeight() {

        System.out.println("Попробуйте угадать вес кота.Введите цифру...");

        Scanner scanner = new Scanner(System.in);
        int weight = 0;
        try {
            weight = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Пользователь ввел что-то отличное от числа");//Вывод ошибки
        } finally {
            if (weight == 5) {
                System.out.println("Вы угадали вес кота!");
            } else {
                System.out.println("Вы не угадали вес кота!");
            }
        }
    }
}

