package OtusException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Monkey extends Animal{

    public Monkey(){

        super("Джерри","Издает неизввестные звуки");
    }

    public void tailLenght(){

        int tail = 0;

        System.out.println("Задайте длину хвоста обезьяны в цифрах...");

        Scanner scanner = new Scanner(System.in);
        try{
             tail = scanner.nextInt();
        }catch (InputMismatchException e) {
        // Подавление исключения
        }
        if(tail < 1){
            System.out.println("Приемлемая длина хвоста");
        }else {
            System.out.println("Хвост слишком длинный!");
        }

    }
}
