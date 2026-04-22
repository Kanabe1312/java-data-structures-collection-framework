package app.course.factory;

import app.course.model.Course;

public interface CourseFactory {


    Course createFromText(String text);
    Course createCourse(String name,String department);
}
