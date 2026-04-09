package app.liste;

import app.books.model.Book;

public class BookNode {
    private Book book;
    private BookNode next;

    public BookNode(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public BookNode getNext() {
        return next;
    }

    public void setNext(BookNode next) {
        this.next = next;
    }
}
