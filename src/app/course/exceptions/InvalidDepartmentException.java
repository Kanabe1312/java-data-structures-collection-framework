package app.course.exceptions;

import app.system.Constants;

public class InvalidDepartmentException extends RuntimeException {

    public InvalidDepartmentException(String message) {
        super(Constants.INVALID_COURSE_DEPARTMENT);
    }
}