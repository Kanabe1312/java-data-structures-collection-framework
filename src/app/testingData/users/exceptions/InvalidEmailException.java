package app.testingData.users.exceptions;

import app.testingData.Constants;

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException() {
        super(Constants.INVALID_EMAIL);
    }
}
