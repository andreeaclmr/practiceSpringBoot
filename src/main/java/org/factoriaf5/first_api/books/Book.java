package org.factoriaf5.first_api.books;

public class Book {

    private String isbn;
    private String title;
    private String author;

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;


    }
}