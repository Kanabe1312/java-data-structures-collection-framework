package app.testingData.users.exceptions;

import app.testingData.Constants;

public class UserAlreadyExistException extends RuntimeException {

    public UserAlreadyExistException() {
        super(Constants.USER_ALREADY_EXISTS);
    }
}
