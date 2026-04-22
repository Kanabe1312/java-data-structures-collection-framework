package app.books.services;

import app.books.model.Book;
import app.books.repository.BookRepoSingleton;
import app.books.repository.BookRepository;

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