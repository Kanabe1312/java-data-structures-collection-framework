package app.testingData.users.exceptions;

import app.testingData.Constants;

public class InvalidLevelException extends RuntimeException {
    public InvalidLevelException() {
        super(Constants.INVALID_LEVEL);
    }
}
