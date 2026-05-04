package app.testingData.course.factory;

import app.testingData.course.model.Course;

public interface CourseFactory {


    Course createFromText(String text);
    Course createCourse(String name,String department);
}
