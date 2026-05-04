package app.testingData.users.exceptions;

import app.testingData.Constants;

public class InvalidLastNameException extends RuntimeException {
    public InvalidLastNameException() {
        super(Constants.INVALID_LAST_NAME);
    }
}
