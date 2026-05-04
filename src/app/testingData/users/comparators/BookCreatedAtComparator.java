package app.testingData.users.comparators;

import app.testingData.books.model.Book;

import java.util.Comparator;

public class BookCreatedAtComparator implements Comparator<Book> {
    @Override
    public int compare(Book o1, Book o2) {
        return o1.getCreatedAt().compareTo(o2.getCreatedAt());
    }
}
