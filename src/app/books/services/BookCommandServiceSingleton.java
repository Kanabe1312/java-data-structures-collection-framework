package app.books.services;

public class BookCommandServiceSingleton {

    private static BookCommandService instance;

    public static BookCommandService getInstance() {

        if (instance == null) {
            instance = new BookCommandServiceImpl();
        }

        return instance;
    }
}
