package app.testingData.books.factory;

import app.testingData.books.model.Book;

public interface BookFactory {
     public Book createFromText(String text);
}
