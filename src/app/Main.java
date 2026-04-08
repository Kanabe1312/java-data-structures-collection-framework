package app;

import app.liste.UserList;
import app.liste.UserNode;
import app.users.factory.UserFactory;
import app.users.models.User;

public class Main {
    public static void main(String[] args) {


        User  user=UserFactory.createFromText("ADMIN,9999,Kanabe,Boss,2000-01-01,admin@gmail.com,12345678,READ_STUDENT;WRITE_STUDENT;READ_TEACHER;WRITE_TEACHER;READ_COURSE;WRITE_COURSE;READ_BOOK;WRITE_BOOK;READ_SCHEDULE;WRITE_SCHEDULE;READ_ENROLMENT;WRITE_ENROLMENT;READ_PERMISSIONS;WRITE_PERMISSIONS");
        User  user1 = UserFactory.createFromText("TEACHER,1001,Anna,Schmidt,1980-05-12,anna.schmidt@gmail.com,pass123444,Math,false,READ_STUDENT;WRITE_STUDENT;READ_TEACHER;WRITE_TEACHER;READ_COURSE;WRITE_COURSE");
        User user2 = UserFactory.createFromText("TEACHER,1002,Markus,Fischer,1975-09-23,markus.fischer@gmail.com,mark9877777,Physics,false,READ_STUDENT;WRITE_STUDENT;READ_TEACHER;WRITE_TEACHER;READ_COURSE;WRITE_COURSE");
        User user3 = UserFactory.createFromText("STUDENT,2001,John,Doe,2002-04-10,johndoe@gmail.com,John127773,BACHELOR,45,READ_BOOK;WRITE_BOOK;READ_SCHEDULE;WRITE_SCHEDULE;READ_ENROLMENT;WRITE_ENROLMENT");
        User user4 = UserFactory.createFromText("STUDENT,2002,Emma,Meyer,2001-11-05,emma.meyer@gmail.com,emma7777123,BACHELOR,60,READ_BOOK;WRITE_BOOK;READ_SCHEDULE;WRITE_SCHEDULE;READ_ENROLMENT;WRITE_ENROLMENT");
        User user5 = UserFactory.createFromText("STUDENT,2003,Lukas,Becker,2000-08-21,lukas.becker@gmail.com,luka7888s999,BACHELOR,30,READ_BOOK;WRITE_BOOK;READ_SCHEDULE;WRITE_SCHEDULE;READ_ENROLMENT;WRITE_ENROLMENT");

        UserNode head;//gol
        UserNode node = new UserNode(user);//500
        head=node;//head devine 500


        UserNode node2 = new UserNode(user1);//434
        node2.setNext(head);// next se pune pe 500
        head=node2;// head devine 434

        UserNode node3 = new UserNode(user2);//533
        node3.setNext(head);//next se pune 434
        head=node3;// head devine 533


        //        UserNode aux=head;
        //        System.out.println(aux.getUser());
        //        aux=aux.getNext();
        //        System.out.println(aux.getUser());
        //        aux=aux.getNext();
        //        System.out.println(aux.getUser());


        UserList userList=new UserList();
        userList.addEnd(user);
        userList.addEnd(user1);
        userList.addEnd(user2);

        userList.display();


    }


}