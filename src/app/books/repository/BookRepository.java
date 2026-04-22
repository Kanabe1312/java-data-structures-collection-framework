package app.books.repository;

import app.books.model.Book;

import java.util.List;

public interface BookRepository {

    Book saveBook(Book book);
    List<Book> getBooks();
    Book deleteBook(Book book);
    Book findBookById(int id);


}
