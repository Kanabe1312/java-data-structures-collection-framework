package app.testingData.users.exceptions;

import app.testingData.Constants;

public class InvalidPasswordException extends RuntimeException {
    public InvalidPasswordException() {
        super(Constants.INVALID_PASSWORD);
    }
}
