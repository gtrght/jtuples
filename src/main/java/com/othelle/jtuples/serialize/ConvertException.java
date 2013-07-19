package com.othelle.jtuples.serialize;

/**
 * author: v.vlasov
 */
public class ConvertException extends RuntimeException {
    public ConvertException() {
    }

    public ConvertException(Throwable cause) {
        super(cause);
    }

    public ConvertException(String message) {
        super(message);
    }

    public ConvertException(String message, Throwable cause) {
        super(message, cause);
    }
}
