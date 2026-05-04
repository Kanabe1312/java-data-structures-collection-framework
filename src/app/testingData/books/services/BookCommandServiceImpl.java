package app.testingData.books.services;

import app.testingData.books.model.Book;
import app.testingData.books.repository.BookRepoSingleton;
import app.testingData.books.repository.BookRepository;

public class BookCommandServiceImpl implements BookCommandService {

    private final BookRepository bookRepository;

    public BookCommandServiceImpl() {
        this.bookRepository = new BookRepoSingleton().getInstance();
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.saveBook(book);
    }

    @Override
    public Book removeBook(Book book) {
        return bookRepository.deleteBook(book);
    }



    @Override
    public Book findBookById(int id) {
        return bookRepository.findBookById(id);
    }
}