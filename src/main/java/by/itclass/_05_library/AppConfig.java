package by.itclass._05_library;

import org.springframework.context.annotation.Bean;

import java.util.List;

public class AppConfig {
    @Bean
    public List<Book> books() {
        return List.of(new Book("Title 1"), new Book("Title 2"));
    }

    @Bean
    public Library library() {
        return new Library("Lenina 14");
    }
}
