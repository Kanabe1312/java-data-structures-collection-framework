package app.testingData.users.exceptions;

import app.testingData.Constants;

public class InvalidFirstNameException extends RuntimeException {
    public InvalidFirstNameException() {
        super(Constants.INVALID_FIRST_NAME);
    }
}
