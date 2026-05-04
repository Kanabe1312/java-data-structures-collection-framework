package app.testingData.course.services;
import app.testingData.course.model.Course;
import app.testingData.course.repository.CourseRepoSingleton;
import app.testingData.course.repository.CourseRepository;

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
