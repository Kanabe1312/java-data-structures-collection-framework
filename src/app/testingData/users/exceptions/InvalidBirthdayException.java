package app.testingData.users.exceptions;

import app.testingData.Constants;

public class InvalidBirthdayException extends RuntimeException {

    public InvalidBirthdayException() {
        super(Constants.INVALID_BIRTHDAY);
    }
}
