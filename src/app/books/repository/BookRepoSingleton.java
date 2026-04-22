package app.books.repository;

public class BookRepoSingleton {

    private static final BookRepository instance = new BookRepositoryImpl();

    public static BookRepository getInstance() {
        return instance;
    }
}