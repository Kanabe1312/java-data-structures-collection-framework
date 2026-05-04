package app.collectionsJava;

import app.testingData.books.model.Book;
import app.testingData.users.comparators.BookCreatedAtComparator;
import app.testingData.users.comparators.BookNameLenghtComparator;

import java.sql.Array;
import java.util.*;

public class ListExamples  {



    public static void exemple1(){

        List<Book> books = new ArrayList<>();
        books.add(new Book("8350,10,Java Basics,2026-03-21"));
        books.add(new Book("924,10,Data Structures in Java,2026-03-21"));
        books.add(new Book("1123,15,Algorithms Explained,2026-03-22"));
        books.add(new Book("4567,8,Introduction to Databases,2026-03-23"));
        books.add(new Book("7890,12,Operating Systems Concepts,2026-03-24"));
        books.add(new Book("2345,9,Computer Networks Basics,2026-03-25"));
        books.add(new Book("6789,11,Software Engineering Principles,2026-03-26"));
        books.add(new Book("3456,7,Discrete Mathematics,2026-03-27"));
        books.add(new Book("9012,14,Object-Oriented Programming,2026-03-28"));

        Iterator<Book> it= books.iterator();



        inserAt(books,2,new Book("2199,15,Artificial Intelligence Intro,2026-03-24"));

        System.out.println(books);


    }

    public static void removeAT(List<Book>books,int poz){
        books.remove(poz);
    }
    public static void inserAt(List<Book>books,int poz,Book b){
           ListIterator<Book> it = books.listIterator();
           for(int i = 0;i < poz;i++){
               it.next();
           }
           it.add(b);


       }

    public static void ex2Collections(){

        List<Book> books = new ArrayList<>();
        books.add(new Book("8350,10,Advanced Java Programming,2026-03-21"));
        books.add(new Book("924,10,Efficient Data Structures,2026-03-21"));
        books.add(new Book("1123,15,Algorithm Design Techniques,2026-03-22"));
        books.add(new Book("4567,8,Database Management Systems,2026-03-23"));
        books.add(new Book("7890,12,Modern Operating Systems,2026-03-24"));
        books.add(new Book("2345,9,Networking Fundamentals,2026-03-25"));
        books.add(new Book("6789,11,Clean Code Practices,2026-03-26"));
        books.add(new Book("3456,7,Foundations of Discrete Math,2026-03-27"));
        books.add(new Book("9012,14,Object-Oriented Design Patterns,2026-03-28"));
        books.add(new Book("99,5,Computer Networks,2026-03-22"));


        Book maxBook =Collections.max(books);
        System.out.println("ID ul cel mai mare: "+maxBook);


        Collections.sort(books,new BookCreatedAtComparator());//-----------sort
        System.out.println("\nSortare dupa data: " + books);

        Collections.sort(books,new BookNameLenghtComparator());
        System.out.println("\nSortare dupa lungime nume: "+books );

        Collections.reverse(books);//-----------------reverse
        System.out.println("\nInversate: "+books);

        Collections.shuffle(books);//---------------shuffle
        System.out.println("\nDupa amestecare: " + books);


        Book minBook = Collections.min(books);
        Collections.min(books,new BookNameLenghtComparator());//-------------minimul
        System.out.println("\nCartea cu cel mai scurt nume este: " +minBook);


        Book cautat = books.get(0);
        int frecventa = Collections.frequency(books,cautat);
        System.out.println("Apare de : "+frecventa+" ori");//----------frecventa





    }

    public static void ex3Numere(){
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        nums.add(11);
        System.out.println("Initial :" + nums);
        Collections.replaceAll(nums,5,9);
        System.out.println("Dupa replaceAll :" + nums);

        System.out.println("\nInitial: "+ nums);
        Collections.swap(nums,0,10);
        System.out.println("\n Dupa swap : " + nums);

    }

    public static void ex4Binary(){
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        Collections.sort(nums);
        System.out.println("Lista sortata: "+nums);

        int index =  Collections.binarySearch(nums,5);
        System.out.println("Elementul cautate este pe pozitia : "+ index);



    }
    public static void empty(){
        List<Integer> aaa= new ArrayList<>();
        System.out.println("Lista ");
        Collections.emptyList();//sterge tot


        //todo: tema remove for si pui collections
    }













}
