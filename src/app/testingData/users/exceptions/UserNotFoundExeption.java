package app.testingData.users.exceptions;

import app.testingData.Constants;

public class UserNotFoundExeption extends RuntimeException {
    public UserNotFoundExeption() {
        super(Constants.USER_NOT_FOUND);
    }
}
