package by.bsuir.migration.exception;

public class ValidationException extends Exception {

    public ValidationException(String message) {
        super("Invalid xml met: " + message);
    }

}