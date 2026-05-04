package app.testingData.course.repository;

import app.testingData.course.model.Course;

import java.util.List;

public interface CourseRepository {

    Course saveCourse(Course course);
    List<Course> getCourses();
    Course deleteCourse(Course course);
    Course findCourseById(int id);

}
