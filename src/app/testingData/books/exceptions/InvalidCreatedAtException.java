package app.testingData.books.exceptions;

import app.testingData.Constants;

public class InvalidCreatedAtException extends RuntimeException {
    public InvalidCreatedAtException() {
        super(Constants.INVALID_BOOK_CREATED);
    }
}
