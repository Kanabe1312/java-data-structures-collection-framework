package app.testingData.users.exceptions;

import app.testingData.Constants;

public class InvalidSubjectException extends RuntimeException {
    public InvalidSubjectException() {
        super(Constants.INVALID_SUBJECT);
    }
}
