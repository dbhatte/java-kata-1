package org.echocat.kata.java.part1.model;

import java.util.List;

public class Publication {

    private String title;

    private String isbn;

    private List<Author> authors;

    public Publication(String title, String isbn, List<Author> authors) {
        this.title = title;
        this.isbn = isbn;
        this.authors = authors;
    }

    public Publication(){}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    @Override
    public String toString() {
        return "Publication{" +
            ", title='" + title + '\'' +
            ", isbn='" + isbn + '\'' +
            ", authors='" + authors + '\'' +
            '}';
    }
}
