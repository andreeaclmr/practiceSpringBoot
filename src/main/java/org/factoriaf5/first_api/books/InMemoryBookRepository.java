package org.factoriaf5.first_api.books;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class InMemoryBookRepository implements BookRepository {
    private final static List<Book> bookDB = new ArrayList<>();

    public InMemoryBookRepository() {
        bookDB.add(new Book("A123", "titulo del libro 1", "author del libro 1"));
        bookDB.add(new Book("A124", "titulo del libro 2", "author del libro 2"));
    }

    @Override
    public List<Book> findAll() {
        return Collections.unmodifiableList(bookDB);
    }

   @Override
   public Book findByIsbn(String isbn) {
        for (Book book : bookDB) {
          if (book.getIsbn().equals(isbn)) return book;
        }
        return null;
   }
}
