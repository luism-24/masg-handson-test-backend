package co.masg.handsontest.domain.exception;

public class ExternalApiConnectionException extends RuntimeException {

    public ExternalApiConnectionException(String message) {
        super(message);
    }

}
