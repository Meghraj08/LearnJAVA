package Exceptions;

public class AgeInvalidException extends Exception {
    AgeInvalidException(String message) {
        super(message);
    }

    AgeInvalidException() {
        super("Age is Invalid");
    }
}
