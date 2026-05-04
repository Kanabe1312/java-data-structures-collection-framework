package app.testingData.course.exceptions;

import app.testingData.Constants;

public class InvalidCourseIdException extends RuntimeException {

    public InvalidCourseIdException(String message) {
        super(Constants.INVALID_COURSE_ID);
    }
}