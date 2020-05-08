package com.david.danjard.filmorama.exceptions;

public class FilmoramaException extends Exception {
    public FilmoramaException(String message) {
        super(message);
    }

    public FilmoramaException(String message, Throwable cause) {
        super(message, cause);
    }

    public FilmoramaException(Throwable cause) {
        super(cause);
    }
}
