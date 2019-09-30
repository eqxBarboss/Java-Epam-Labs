package exception;

public class CommandException extends Exception {
    public CommandException(String message, Exception e) {super(message, e);}
}
