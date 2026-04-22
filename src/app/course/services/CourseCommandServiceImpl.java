package app.course.services;
import app.course.model.Course;
import app.course.repository.CourseRepoSingleton;
import app.course.repository.CourseRepository;
import app.course.repository.CourseRepositoryImpl;

import app.course.repository.CourseRepository;

import java.util.List;

public class CourseCommandServiceImpl implements CourseCommandService {
    private final CourseRepository courseRepository;

    public CourseCommandServiceImpl() {
        this.courseRepository = CourseRepoSingleton.getInstance();
    }


    @Override
    public Course addCourse(Course course) {
        return courseRepository.saveCourse(course);
    }

    @Override
    public Course removeCourse(int id) {
        for (Course course : courseRepository.getCourses()) {
            if (course.getId() == id) {
                return courseRepository.deleteCourse(course);
            }
        }
        return null;
    }



}
