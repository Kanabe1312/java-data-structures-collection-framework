package app.testingData.course.factory;

import app.testingData.course.model.Course;

public class CourseFactoryImpl implements CourseFactory {

    @Override
    public Course createFromText(String text)  {
        return new Course(text);
    }
    @Override
    public Course createCourse(String name, String department) {
        return new Course(name, department);
    }
}
