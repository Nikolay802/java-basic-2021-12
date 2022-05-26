package OtusException;

public class Animal {

    String name;
    String voice;

    public Animal(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

    public void sayName() {
        System.out.println(name);
    }

    public void showVoice() {
        System.out.println(voice);
    }
}
