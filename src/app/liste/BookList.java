package app.liste;

import app.books.model.Book;

public class BookList {

    private BookNode head;

    public void addStart(Book book) {
        if (head == null) {
            head = new BookNode(book);
            return;
        }

        BookNode newNode = new BookNode(book);
        newNode.setNext(head);
        head = newNode;
    }

    public void addEnd(Book book) {
        if (head == null) {
            head = new BookNode(book);
            return;
        }
        BookNode aux = head;

        while (aux.getNext() != null) {
            aux = aux.getNext();
        }

        aux.setNext(new BookNode(book));
    }

    public void display() {
        BookNode aux = head;
        while (aux != null) {
            System.out.println(aux.getBook());
            aux = aux.getNext();
        }
    }

    public Book removeStart() {
        if(head == null) {
            return null;
        }
        Book removedBook = head.getBook();
        head = head.getNext();
        return removedBook;
    }

    public Book removeEnd() {
        if(head == null) {//lista este goala
            return null;
        }
        if(head.getNext() == null) {//are un element
            Book removedBook = head.getBook();
            head = null;
            return removedBook;
        }
        BookNode aux = head;
        while (aux.getNext().getNext() != null) {//lista are elemente si intra in ele
            aux = aux.getNext();
        }
        Book removedBook = aux.getNext().getBook();
        aux.setNext(null);
        return removedBook;

    }

    public Book removeFromSpecificPosition(int position) {
        if(head == null) {//lista goala
            return null;
        }
        if(position < 0){//int gresit
            return null;
        }
        if(position == 0){//prima pozitie
         return removeStart();
        }
        BookNode aux = head;
        int pos = 0;
        while (aux!= null && pos < position - 1) {
            aux = aux.getNext();
            pos++;
        }
        if(aux == null || aux.getNext() == null){//verifica daca exista pozitia
            return null;
        }
        Book removedBook = aux.getNext().getBook();
        aux.setNext(aux.getNext().getNext());
        return removedBook;
    }

    public Book addToSpecificPosition(int position, Book book) {
        if(position < 0){
          return null;
        }
        if(position == 0){
            addStart(book);
            return book;
        }

        BookNode aux = head;
        int pos = 0;
        while (aux != null && pos < position-1) {
            aux = aux.getNext();
            pos++;
        }
        if(aux == null){
            return book;
        }
        BookNode node = new BookNode(book);
        node.setNext(aux.getNext());
        aux.setNext(node);

        return book;


    }







    //todo:STACK

    public void push(Book book) {
        BookNode newNode = new BookNode(book);

        newNode.setNext(head);
        head = newNode;
    } //adauga la inceput unu peste altu e conceptul de baza

    public Book pop() {
        if (head == null) {
            return null;
        }

        Book removedBook = head.getBook();
        head = head.getNext();

        return removedBook;
    } //pop scoate din fata(de sus)

    //conceptul
    //head -> A -> B -> C
    //-> pop()
    //removed = A
    //head = B
    //rezultat : B -> C



    //Todo Queue

    public void enqueue(Book book) {
        BookNode newNode = new BookNode(book);

        if (head == null) {
            head = newNode;
            return;
        }
        BookNode aux = head;
        while (aux.getNext() != null) {
            aux = aux.getNext();
        }
        aux.setNext(newNode);
    }
    public Book dequeue(){
        if (head == null) {
            return null;
        }
        Book removedBook = head.getBook();
        head = head.getNext();
        return removedBook;
    }


}
