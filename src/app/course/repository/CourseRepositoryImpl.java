package app.course.repository;

import app.course.factory.CourseFactory;
import app.course.factory.CourseFactoryImpl;
import app.course.model.Course;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class CourseRepositoryImpl implements  CourseRepository {

    private final List<Course> courses;
    private final CourseFactory courseFactory;



    public CourseRepositoryImpl() {
        this.courses = new ArrayList<>();
        this.courseFactory = new CourseFactoryImpl();
        loadCourses();
    }

    private void loadCourses() {
        try{
            File file = new File("src/app/course/data/course.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();

                if (line.isEmpty()) continue;

                Course course = courseFactory.createFromText(line);
                courses.add(course);
            }
            scanner.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void saveCourses() {
        try {
            FileWriter fileWriter = new FileWriter("src/app/course/data/course.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println(this);

            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Course saveCourse(Course course) {
        course.setId(generateId());
        courses.add(course);
        saveCourses();
        return course;
    }
    @Override
    public List<Course> getCourses() {
        return courses;
    }
    @Override
    public Course deleteCourse(Course course) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getId() == course.getId()) {
                Course removed = courses.remove(i);
                saveCourses();
                return removed;
            }
        }
        return null;
    }
    @Override
    public Course findCourseById(int id) {
        for (Course course : courses) {
            if (course.getId() == id) {
                return course;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < courses.size() - 1; i++) {
            sb.append(courses.get(i).toString()).append("\n");
        }

        if (!courses.isEmpty()) {
            sb.append(courses.get(courses.size() - 1).toString());
        }

        return sb.toString();
    }


    private int randomInt() {
        Random random = new Random();
        return random.nextInt(10000);
    }
    private int generateId() {
        int id = randomInt();

        while (findCourseById(id) != null) {
            id = randomInt();
        }

        return id;
    }


}
