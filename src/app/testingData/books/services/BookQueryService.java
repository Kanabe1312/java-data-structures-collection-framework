package app.testingData.books.services;

import app.testingData.books.model.Book;
import java.util.List;

public interface BookQueryService {

    List<Book> getAllBooks();

}