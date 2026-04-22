package app.books.services;

public class BookQueryServiceSingleton {
    private final static BookQueryService instance = new BookQueryServiceImpl();
    public static BookQueryService getInstance() {

        return instance;
    }
}
