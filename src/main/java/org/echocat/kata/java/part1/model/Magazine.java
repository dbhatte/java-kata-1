package org.echocat.kata.java.part1.model;

import java.time.LocalDate;
import java.util.List;

public class Magazine extends Publication {
    private LocalDate publishedAt;

    public Magazine(String title, String isbn, List<Author> authors, LocalDate publishedAt) {
        super(title, isbn, authors);
        this.publishedAt = publishedAt;
    }

    public Magazine() {

    }

    public LocalDate getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(LocalDate publishedAt) {
        this.publishedAt = publishedAt;
    }

    @Override
    public String toString() {
        return "Magazine{" +
            "publishedAt=" + publishedAt +
            '}';
    }
}
