package app.testingData.books.services;

import app.testingData.books.model.Book;

public interface BookCommandService {

    Book addBook(Book book);

    Book removeBook(Book book);

    Book findBookById(int id);
}