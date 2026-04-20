package app;

import app.liste.UserList;
import app.listeGenerice.Lista;
import app.listeGenerice.Node;
import app.listeGenerice.Stiva;
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
        //comparatie
        User u1 = new Student("STUDENT,3336,Alex,Marcu,2000-10-10,alex@gmail.com,123456789,BACHELOR,39,READ_BOOK;WRITE_BOOK;READ_SCHEDULE;WRITE_SCHEDULE;READ_ENROLMENT;WRITE_ENROLMENT");
        User u2 = new Student("STUDENT,2002,Emma,Meyer,2001-11-05,emma.meyer@gmail.com,emma7777123,BACHELOR,60,READ_BOOK;WRITE_BOOK;READ_SCHEDULE;WRITE_SCHEDULE;READ_ENROLMENT;WRITE_ENROLMENT");
        System.out.println(u1.compareTo(u2));

        Lista<User> listaUsers= new Lista<>();
        listaUsers.addStart(new Student("STUDENT,2001,Ana,Doe,2000-04-10,johndoe@gmail.com,John127773,BACHELOR,45,READ_BOOK;WRITE_BOOK;READ_SCHEDULE;WRITE_SCHEDULE;READ_ENROLMENT;WRITE_ENROLMENT"));
        listaUsers.addStart(new Student("STUDENT,2003,Luca,Becker,2005-08-21,lukas.becker@gmail.com,luka7888s999,BACHELOR,30,READ_BOOK;WRITE_BOOK;READ_SCHEDULE;WRITE_SCHEDULE;READ_ENROLMENT;WRITE_ENROLMENT"));
        listaUsers.addStart(new Student("STUDENT,2123,Alexx,Marcu,2003-10-10,alexmarcu@gmail.com,12345678,BACHELOR,100,READ_ENROLMENT;WRITE_ENROLMENT;WRITE_BOOK;WRITE_STUDENT"));
        listaUsers.addStart(new Student("STUDENT,2123,Alexx,Marcu,2003-10-10,alexmarcu@gmail.com,12345678,BACHELOR,100,READ_ENROLMENT;WRITE_ENROLMENT;WRITE_BOOK;WRITE_STUDENT"));
        //listaUsers.display();
       // listaUsers.enqueue(u1);
        System.out.println("Dupa sortare:");
       // listaUsers.display();
        //todo STACK

       // listaUsers = listaUsers.removeDuplicates();--->ex2 lista noua

       // listaUsers.display();

        //todo EX3
        Lista<Integer> lista = new Lista<>();

       // lista.addEnd(3);
        //        lista.addEnd(7);
        //        lista.addEnd(1);
        //        lista.addEnd(9);
        //        lista.addEnd(-2);
        //        lista.addEnd(8);
        //
        //        lista.minMax();

        //todo EX4
       // lista.addEnd(1);
        //        lista.addEnd(2);
        //        lista.addEnd(3);
        //        lista.addEnd(2);
        //        lista.addEnd(1);
        //
        //        System.out.println(lista.isPalindrome());
        //todo EX5
        Lista<Integer> a = new Lista<>();
        a.addEnd(1);
        a.addEnd(3);
        a.addEnd(5);

        Lista<Integer> b = new Lista<>();
        b.addEnd(2);
        b.addEnd(4);
        b.addEnd(6);
        Lista<Integer> c = a.merge(b);

       // c.display();

        //todo EX6
        lista = new Lista<>();

        lista.addEnd(1);
        lista.addEnd(2);
        lista.addEnd(3);
        lista.addEnd(4);
        lista.addEnd(5);

        lista.rotateLeft(2);


        //todo EX5
        lista.addEnd(1);
        lista.addEnd(2);
        lista.addEnd(3);
        lista.addEnd(4);
        lista.addEnd(5);

        lista.rotateLeft(2);

       // lista.display();

        //todo EX7
        lista.addEnd(1);
        lista.addEnd(3);
        lista.addEnd(2);
        lista.addEnd(3);
        lista.addEnd(4);
        lista.addEnd(3);

        lista.removeAll(3);

        lista.display();




    }
}




