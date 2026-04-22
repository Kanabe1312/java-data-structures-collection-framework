package app.course.services;

import app.course.model.Course;

import java.util.List;

public interface CourseCommandService {
    Course addCourse(Course course);
    Course removeCourse(int id);




}
