package domain;

public class IllegalTemperatureException extends RuntimeException {
    public IllegalTemperatureException(String message) {
        super(message);
    }
}
