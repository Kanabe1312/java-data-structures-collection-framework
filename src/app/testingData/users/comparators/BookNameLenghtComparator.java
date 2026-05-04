package app.testingData.users.comparators;

import app.testingData.books.model.Book;

import java.util.Comparator;

public class BookNameLenghtComparator implements Comparator<Book> {


    @Override
    public int compare(Book o1, Book o2) {
        return Integer.compare(o1.getBookName().length(),o2.getBookName().length());
    }
}
