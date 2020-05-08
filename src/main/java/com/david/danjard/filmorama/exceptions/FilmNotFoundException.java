package com.david.danjard.filmorama.exceptions;

public class FilmNotFoundException extends FilmoramaException {
    public FilmNotFoundException(String message) {
        super(message);
    }

    public FilmNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public FilmNotFoundException(Throwable cause) {
        super(cause);
    }
}
