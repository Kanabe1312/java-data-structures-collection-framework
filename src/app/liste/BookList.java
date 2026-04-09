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
}
