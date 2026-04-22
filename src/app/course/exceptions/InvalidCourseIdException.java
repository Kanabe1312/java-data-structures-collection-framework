package app.course.exceptions;

import app.system.Constants;

import java.util.concurrent.ConcurrentSkipListMap;

public class InvalidCourseIdException extends RuntimeException {

    public InvalidCourseIdException(String message) {
        super(Constants.INVALID_COURSE_ID);
    }
}