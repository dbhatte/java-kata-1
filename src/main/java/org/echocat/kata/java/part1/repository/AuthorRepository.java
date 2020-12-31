package org.echocat.kata.java.part1.repository;

import org.echocat.kata.java.part1.model.Author;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class AuthorRepository {

    private final List<Author> authors = new ArrayList<>();

    public void save(Author author) {
        authors.add(author);
    }

    public List<Author> findAll(){
        return Collections.unmodifiableList(authors);
    }

    public Map<String, Author> getEmailAuthorMap() {
        return findAll().stream().collect(Collectors.toMap(Author::getEmail, author -> author));
    }
}
