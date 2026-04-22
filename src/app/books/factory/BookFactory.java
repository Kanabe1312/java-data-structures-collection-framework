package app.books.factory;

import app.books.model.Book;

public interface BookFactory {
     public Book createFromText(String text);
}
