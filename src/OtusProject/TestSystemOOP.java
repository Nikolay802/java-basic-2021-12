package OtusProject;

public class TestSystemOOP {

    public static void main(String[] args) {

        Print print = new Print();
        RightAnswers right = new RightAnswers();
        Logic logic = new Logic();

        print.print();
        logic.logic(right.getAnswer1());

        print.print1();
        logic.logic(right.getAnswer2());

        print.print2();
        logic.logic(right.getAnswer3());

        logic.finish();

    }
}


  //  Question question1 = new Question("Сколько грамм содержится в килограмме?");
    //Answer answer1 = new Answer("1. 900\n2. 1000\n3. 500\n");

    //Question question2 = new Question("Сколько пальцев на руках у человека?");
    //Answer answer2 = new Answer("1. 3\n2. 5\n3. 10\n4. 23");

    //Question question3 = new Question("Какова частота ноты Ля второй октавы?");
    //Answer answer3 = new Answer("1. 440\n2. 34\n3. 670\n4. 450\n5. 67");