package app.testingData.users.factory;

import app.testingData.users.models.Admin;
import app.testingData.users.models.Student;
import app.testingData.users.models.Teacher;
import app.testingData.users.models.User;

import java.time.LocalDate;

public class UserFactory {


    public static User createFromText(String text) {
        String[] parts = text.split(",");
        String type = parts[0];
        return switch (type) {
            case "STUDENT" -> new Student(text);
            case "TEACHER" -> new Teacher(text);
            case "ADMIN" -> new Admin(text);
            default -> null;
        };
    }


    public static User createStudent(String firstname, String lastname, LocalDate birthday,
                              String email, String password,  String level, int progress) {
        return new Student(firstname, lastname, birthday, email, password, level, progress);
    }

    public static  User createTeacher(String firstname, String lastname, LocalDate birthday,
                              String email, String password,  String subject,
                              boolean isDoctorat)  {
        return new Teacher(firstname, lastname, birthday, email, password,  subject, isDoctorat);
    }


    public static User createAdmin(String firstname, String lastname, LocalDate birthday,
                            String email, String password){
        return new Admin(firstname, lastname, birthday, email, password);
    }


}
