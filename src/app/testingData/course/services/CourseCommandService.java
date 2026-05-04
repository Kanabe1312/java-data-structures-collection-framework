package app.testingData.course.services;

import app.testingData.course.model.Course;

public interface CourseCommandService {
    Course addCourse(Course course);
    Course removeCourse(int id);




}
