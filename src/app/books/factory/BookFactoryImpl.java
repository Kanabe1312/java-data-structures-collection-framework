package app.books.factory;

import app.books.model.Book;

public class BookFactoryImpl implements BookFactory {


    @Override
    public Book createFromText(String text) {
        return new Book(text);
    }
}