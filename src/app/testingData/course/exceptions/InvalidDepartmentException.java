package app.testingData.course.exceptions;

import app.testingData.Constants;

public class InvalidDepartmentException extends RuntimeException {

    public InvalidDepartmentException(String message) {
        super(Constants.INVALID_COURSE_DEPARTMENT);
    }
}