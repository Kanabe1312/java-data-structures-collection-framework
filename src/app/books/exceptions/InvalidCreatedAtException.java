package app.books.exceptions;

import app.system.Constants;

public class InvalidCreatedAtException extends RuntimeException {
    public InvalidCreatedAtException() {
        super(Constants.INVALID_BOOK_CREATED);
    }
}
