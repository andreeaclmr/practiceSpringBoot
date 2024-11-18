package org.factoriaf5.first_api.books;

import java.util.List;

public interface BookRepository {

    List<Book> findAll();

    Optional<Book> findByIsbn(String isbn);
}
