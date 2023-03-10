package org.sdnplatform.sync.error;
public class UnknownStoreException extends SyncException {
    private static final long serialVersionUID = 6633759330354187L;
    public UnknownStoreException() {
        super();
    }
    public UnknownStoreException(String message, Throwable cause) {
        super(message, cause);
    }
    public UnknownStoreException(String message) {
        super(message);
    }
    public UnknownStoreException(Throwable cause) {
        super(cause);
    }
    @Override
    public ErrorType getErrorType() {
        return ErrorType.UNKNOWN_STORE;
    }
}
