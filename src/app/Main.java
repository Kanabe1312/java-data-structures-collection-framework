package app;

import app.liste.UserList;
import app.listeGenerice.*;
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

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


       //Lista<Integer> lista = new Lista<>();
        //
        //lista.addEnd(38);
        //lista.addEnd(27);
        //lista.addEnd(43);
        //lista.addEnd(3);
        //lista.addEnd(9);
        //lista.addEnd(82);
        //lista.addEnd(10);
        //
        //System.out.println("Initial:");
        //lista.display();
        //
        //lista = lista.mergeSort();
        //
        //System.out.println("Sortat:");
        //lista.display();


        //todo EX9
        Lista<Integer> lista = new Lista<>();

        lista.addEnd(38);
        lista.addEnd(27);
        lista.addEnd(43);
        lista.addEnd(3);
        lista.addEnd(9);
        lista.addEnd(82);
        lista.addEnd(10);

        System.out.println("Initial:");
        lista.display();

        lista = lista.mergeSort();

        System.out.println("Sortat:");
        lista.display();


    }
}




