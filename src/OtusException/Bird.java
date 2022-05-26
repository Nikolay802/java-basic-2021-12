package OtusException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bird extends Animal{
    public Bird(){

        super("Кеша","Чик-чирик");
    }
    public void bufferReader () throws IOException {


        BufferedReader reader = null;
        try {
            String fileName = "bird.txt";
            reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line + "\n");
            }
        } catch (IOException e) {
            System.out.println("Не удается найти файл");
        } finally {
            reader.close();
        }
    }

}
