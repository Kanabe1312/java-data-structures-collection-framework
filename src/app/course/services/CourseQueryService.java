package app.course.services;

import app.course.model.Course;

import java.util.List;

public interface CourseQueryService {

    List<Course> getAllCourses();

    Course findById(int id);
}
