package model;

public class NotEnoughFormDataException extends RuntimeException {
    public NotEnoughFormDataException(String message) {
        super(message);
    }
}
