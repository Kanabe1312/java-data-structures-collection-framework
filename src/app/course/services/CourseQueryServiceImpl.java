package app.course.services;

import app.course.model.Course;
import app.course.repository.CourseRepoSingleton;
import app.course.repository.CourseRepository;

import java.util.List;

public class CourseQueryServiceImpl implements CourseQueryService {

    private final CourseRepository courseRepository;

    public CourseQueryServiceImpl() {
        this.courseRepository = CourseRepoSingleton.getInstance();
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.getCourses();
    }

    @Override
    public Course findById(int id) {
        for (Course course : courseRepository.getCourses()) {
            if (course.getId() == id) {
                return course;
            }
        }
        return null;
    }
}