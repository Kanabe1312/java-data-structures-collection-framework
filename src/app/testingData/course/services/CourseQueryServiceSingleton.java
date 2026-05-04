package app.testingData.course.services;

public class CourseQueryServiceSingleton {
    private static final CourseQueryService instance = new CourseQueryServiceImpl();
    public static CourseQueryService getInstance() {
        return instance;
    }
}
