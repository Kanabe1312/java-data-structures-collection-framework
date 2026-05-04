package app.testingData.users.exceptions;

import app.testingData.Constants;

public class InvalidUserTypeException extends RuntimeException {
    public InvalidUserTypeException() {
        super(Constants.INVALIDE_USER_TYPE);
    }
}
