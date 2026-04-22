package app.course.repository;

import app.course.model.Course;

import java.util.List;

public interface CourseRepository {

    Course saveCourse(Course course);
    List<Course> getCourses();
    Course deleteCourse(Course course);
    Course findCourseById(int id);

}
