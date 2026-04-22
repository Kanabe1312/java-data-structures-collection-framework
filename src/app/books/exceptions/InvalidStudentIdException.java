package app.books.exceptions;

import app.system.Constants;

public class InvalidStudentIdException extends RuntimeException {
    public InvalidStudentIdException() {
        super(Constants.INVALID_STUDENT_ID);
    }
}
