package app.books.services;

import app.books.model.Book;
import java.util.List;

public interface BookQueryService {

    List<Book> getAllBooks();

}