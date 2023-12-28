package src.lesson18.group1.thowPart;

public class InvalidAgeException extends RuntimeException {

    public InvalidAgeException() {
    }

    public InvalidAgeException(String message) {
        super(message);
    }
}
