package app.testingData.books.exceptions;

import app.testingData.Constants;

public class InvalidIdException extends RuntimeException {
    public InvalidIdException() {
        super(Constants.INVALID_BOOK_ID);
    }
}
