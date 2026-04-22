package app.course.exceptions;

import app.system.Constants;

public class InvalidCourseNameException extends RuntimeException {

    public InvalidCourseNameException(String message) {
        super(Constants.INVALID_COURSE_NAME);
    }
}