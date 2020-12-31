package org.echocat.kata.java.part1.repository;

import org.echocat.kata.java.part1.model.Author;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AuthorRepository {

    private List<Author> authors = new ArrayList<>();

    public void save(Author author) {
        authors.add(author);
    }
}
