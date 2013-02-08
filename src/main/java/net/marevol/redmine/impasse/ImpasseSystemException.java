package net.marevol.redmine.impasse;

public class ImpasseSystemException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ImpasseSystemException() {
    }

    public ImpasseSystemException(final String message) {
        super(message);
    }

    public ImpasseSystemException(final Throwable cause) {
        super(cause);
    }

    public ImpasseSystemException(final String message, final Throwable cause) {
        super(message, cause);
    }

}
