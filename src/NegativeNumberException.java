public class NegativeNumberException extends Throwable {
    private static final String message = "Size can't be negative";
    public NegativeNumberException() {
        super(message);
    }
}
