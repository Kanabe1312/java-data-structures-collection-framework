package app.testingData.course.exceptions;

import app.testingData.Constants;

public class InvalidCourseNameException extends RuntimeException {

    public InvalidCourseNameException(String message) {
        super(Constants.INVALID_COURSE_NAME);
    }
}