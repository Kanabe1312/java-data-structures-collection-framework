package app.testingData.users.exceptions;

import app.testingData.Constants;

public class InvalidProgressException extends RuntimeException {
    public InvalidProgressException() {
        super(Constants.INVALIDE_PROGRESS);
    }
}
