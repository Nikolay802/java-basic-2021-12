package OtusException;

public class DogDoesNotWalkException extends Exception {
    String message;
    public DogDoesNotWalkException(String message){
        super(message);

    }


}
