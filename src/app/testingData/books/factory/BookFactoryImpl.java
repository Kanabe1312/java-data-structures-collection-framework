package app.testingData.books.factory;

import app.testingData.books.model.Book;

public class BookFactoryImpl implements BookFactory {


    @Override
    public Book createFromText(String text) {
        return new Book(text);
    }
}