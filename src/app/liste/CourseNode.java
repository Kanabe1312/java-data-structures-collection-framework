package app.liste;

import app.course.model.Course;

import java.util.Objects;

public class CourseNode {

    private Course course;
    private CourseNode next;

    public CourseNode(Course course) {
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }

    public CourseNode getNext() {
        return next;
    }
    public void setNext(CourseNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "CourseNode{" +
                "course=" + course +
                ", next=" + next +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CourseNode that = (CourseNode) o;
        return Objects.equals(course, that.course) && Objects.equals(next, that.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, next);
    }
}
