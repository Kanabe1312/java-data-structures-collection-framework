package app.testingData.books.services;

import app.testingData.books.model.Book;
import app.testingData.books.repository.BookRepoSingleton;
import app.testingData.books.repository.BookRepository;

import java.util.List;

public class BookQueryServiceImpl implements BookQueryService {

    private final BookRepository bookRepository;

    public BookQueryServiceImpl() {
        this.bookRepository = BookRepoSingleton.getInstance();
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.getBooks();
    }


}