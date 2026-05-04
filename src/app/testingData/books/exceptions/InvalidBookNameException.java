package app.testingData.books.exceptions;

import app.testingData.Constants;

public class InvalidBookNameException extends RuntimeException {
    public InvalidBookNameException() {
        super(Constants.INVALID_BOOK_NAME);
    }
}
