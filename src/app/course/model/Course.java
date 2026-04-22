package app.course.model;

import app.course.exceptions.InvalidCourseIdException;
import app.course.exceptions.InvalidCourseNameException;
import app.course.exceptions.InvalidDepartmentException;
import app.system.Constants;

public class Course {

    private int id;
    private String name;
    private String department;


//cu id
public Course(String text) {
    String[] parts = text.split(",");
    int id = Integer.parseInt(parts[0].trim());
    setId(id);
    setName(parts[1]);
    setDepartment(parts[2]);
}
    //fara id
    public Course(String name, String department) {
       setName(name);
        setDepartment(department);
    }

    @Override
    public String toString() {
        return id + "," + name + "," + department;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) throws InvalidCourseIdException {
        if (id <= 0) {
            throw new InvalidCourseIdException(Constants.INVALID_COURSE_ID);
        }
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) throws InvalidCourseNameException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidCourseNameException(Constants.INVALID_COURSE_NAME);
        }
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) throws InvalidDepartmentException {
        if (department == null || department.trim().isEmpty()) {
            throw new InvalidDepartmentException(Constants.INVALID_COURSE_DEPARTMENT);
        }
        this.department = department;
    }


}