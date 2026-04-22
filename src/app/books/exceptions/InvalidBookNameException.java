package app.books.exceptions;

import app.system.Constants;

public class InvalidBookNameException extends RuntimeException {
    public InvalidBookNameException() {
        super(Constants.INVALID_BOOK_NAME);
    }
}
