package app;

import app.liste.UserList;
import app.listeGenerice.*;
import app.listeGenerice.Comparatorss.Interval;
import app.users.comparators.UserBithdayComparer;
import app.users.comparators.UserFirstnameComparer;
import app.users.comparators.UserPermissionsComparer;
import app.users.models.Student;
import app.users.models.Teacher;
import app.books.model.Book;
import app.liste.BookList;
import app.course.model.Course;
import app.liste.CourseList;
import app.users.models.User;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String[] oameni = {"Ana","Bob","Carol","Dan","Eva"};
        String castigator = Coada.potato(oameni,3);
        System.out.println("Castigator: " + castigator);

        Coada<Integer> c = new Coada<>();

        c.enqueue(3);
        c.enqueue(1);
        c.enqueue(5);
        c.enqueue(12);
        c.enqueue(2);
        c.enqueue(11);
        c.enqueue(7);

        c.topK(3);
        c.display();
    }
}




