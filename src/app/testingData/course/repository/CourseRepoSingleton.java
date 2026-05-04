package app.testingData.course.repository;

public class CourseRepoSingleton {

    private static final CourseRepository instance = new CourseRepositoryImpl();

    public static CourseRepository getInstance() {
        return instance;
    }


}
