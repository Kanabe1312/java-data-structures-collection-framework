package app.testingData.users.exceptions;

import app.testingData.Constants;

public class InvalidIdException extends RuntimeException {
    public InvalidIdException() {
        super(Constants.INVALID_ID);
    }
}
