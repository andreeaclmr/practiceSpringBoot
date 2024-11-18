package org.factoriaf5.first_api.books;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private final static List<Book> booksDB = new ArrayList<>();

    public BookController() {
        booksDB.add(new Book("A123", "titulo del libro 1", "author del libro 1"));
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return booksDB;

    }
}
