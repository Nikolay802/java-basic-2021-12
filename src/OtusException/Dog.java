package OtusException;

import java.util.Scanner;

public class Dog extends Animal {


    public Dog() {
        super("Бобик", "Гав");
    }

    public void walk() throws DogDoesNotWalkException {

        System.out.println("Выведите собаку на прогулку, задав её скорость в цифрах...");

        Scanner scanner = new Scanner(System.in);
        int speedOfDog = scanner.nextInt();
        try {
            if (speedOfDog == 0) {
                throw new DogDoesNotWalkException("Собака не гуляет!");
            }
        } catch (Exception e) {
            throw new RuntimeException(e); //Проброс исключения
        } finally {
            if (speedOfDog > 0) {
                System.out.println("Собака Вам благодарна)");
            }

            }
        }
    }


