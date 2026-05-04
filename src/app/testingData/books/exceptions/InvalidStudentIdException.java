package app.testingData.books.exceptions;

import app.testingData.Constants;

public class InvalidStudentIdException extends RuntimeException {
    public InvalidStudentIdException() {
        super(Constants.INVALID_STUDENT_ID);
    }
}
