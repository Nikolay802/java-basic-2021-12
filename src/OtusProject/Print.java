package OtusProject;

public class Print {

    Question question = new Question("Сколько грамм содержится в килограмме?", "1. 900\n2. 1000\n3. 500\n");
    Question question1 = new Question("Сколько пальцев на руках у человека?", "1. 3\n2. 5\n3. 10\n4. 23");
    Question question2 = new Question("Какова частота ноты Ля второй октавы?", "1. 440\n2. 34\n3. 670\n4. 450\n5. 67");

    public void print() {
        System.out.println(question.getQuestion());
        System.out.println(question.getAnswer());

    }

    public void print1() {
        System.out.println(question1.getQuestion());
        System.out.println(question1.getAnswer());

    }

    public void print2() {
        System.out.println(question2.getQuestion());
        System.out.println(question2.getAnswer());

    }

}
