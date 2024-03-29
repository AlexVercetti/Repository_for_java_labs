public class ObjectException extends Exception {
    public ObjectException() {
    }

    public ObjectException(String message) {
        super(message);
    }

    public ObjectException(String message, Throwable cause) {
        super(message, cause);
    }

    public ObjectException(Throwable cause) {
        super(cause);
    }

    public ObjectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
