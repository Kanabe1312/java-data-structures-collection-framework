package app.testingData.course.services;

import app.testingData.course.model.Course;

import java.util.List;

public interface CourseQueryService {

    List<Course> getAllCourses();

    Course findById(int id);
}
