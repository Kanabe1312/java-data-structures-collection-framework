package app.liste;

import app.books.model.Book;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "BookNode{" +
                "book=" + book +
                ", next=" + next +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BookNode bookNode = (BookNode) o;
        return Objects.equals(book, bookNode.book) && Objects.equals(next, bookNode.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, next);
    }
}
