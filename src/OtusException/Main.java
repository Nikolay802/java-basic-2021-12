package OtusException;

public class Main {

    public static void main(String[] args) throws DogDoesNotWalkException {

        Cat cat = new Cat(); //Вывод ошибки при вводе в консоль чего-то кроме числа
        cat.sayName();
        cat.showVoice();
        cat.guessWeight();

        Monkey monkey = new Monkey();// Подавление исключения
        monkey.sayName();
        monkey.showVoice();
        monkey.tailLenght();

        Bird bird = new Bird();// Try-with-resourses
        bird.sayName();
        bird.showVoice();
        bird.bufferReader();

        Dog dog = new Dog();//Проброс исключения
        dog.sayName();
        dog.showVoice();
        dog.walk();


    }
}