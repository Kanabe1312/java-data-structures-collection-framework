package app.course.services;

public class CourseCommandServiceSingleton {
    private static final CourseCommandService instance = new CourseCommandServiceImpl();
    public static CourseCommandService getInstance() {
        return instance;
    }
}
