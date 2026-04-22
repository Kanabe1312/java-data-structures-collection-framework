package app.books.repository;

import app.books.factory.BookFactory;
import app.books.factory.BookFactoryImpl;
import app.books.model.Book;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class BookRepositoryImpl implements BookRepository {

    private final List<Book> books;
    private final BookFactory bookFactory;

    public BookRepositoryImpl() {
        this.books = new ArrayList<>();
        this.bookFactory = new BookFactoryImpl();
        this.loadBooks();
    }

    private void loadBooks() {
        try {
            File file = new File("src/app/books/data/books.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                Book book = bookFactory.createFromText(scanner.nextLine());
                books.add(book);
            }

            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < books.size() - 1; i++) {
            sb.append(books.get(i).toString()).append("\n");
        }

        if (!books.isEmpty()) {
            sb.append(books.get(books.size() - 1).toString());
        }

        return sb.toString();
    }

    private void saveBooks() {
        try {
            FileWriter fileWriter = new FileWriter("src/app/books/data/books.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);

            printWriter.println(this);

            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private int randomInt() {
        Random random = new Random();
        return random.nextInt(10000);
    }

    private int generateId() {
        int id = randomInt();

        while (findBookById(id) != null) {
            id = randomInt();
        }

        return id;
    }

    @Override
    public Book saveBook(Book book) {
        book.setId(generateId());
        books.add(book);
        saveBooks();
        return book;
    }

    @Override
    public Book deleteBook(Book book) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == book.getId()) {
                Book removed = books.remove(i);
                saveBooks();
                return removed;
            }
        }
        return null;
    }

    @Override
    public List<Book> getBooks() {
        return books;
    }

    @Override
    public Book findBookById(int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        return null;
    }

}