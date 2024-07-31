package by.itclass._05_library;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.StringJoiner;

public class Library {
    private String address;
    private List<Book> books;

    public Library(String address) {
        this.address = address;
    }

    @Autowired
    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Library.class.getSimpleName() + "[", "]")
                .add("address='" + address + "'")
                .add("books=" + books)
                .toString();
    }
}
