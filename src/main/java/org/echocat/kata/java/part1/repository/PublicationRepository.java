package org.echocat.kata.java.part1.repository;

import org.echocat.kata.java.part1.model.Publication;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class PublicationRepository {

    private final List<Publication> publications = new ArrayList<>();

    public void save(Publication publication) {
        publications.add(publication);
    }

    public List<Publication> findAll(){
        return Collections.unmodifiableList(publications);
    }

    public Optional<Publication> findByISBN(String isbn) {
        return publications.stream().filter(publication -> isbn.equalsIgnoreCase(publication.getIsbn())).findFirst();
    }

    public List<Publication> findByAuthorsEmail(String email) {
        return publications.stream().filter(publication -> matches(publication, email)).collect(Collectors.toList());

    }

    private boolean matches(Publication publication, String email) {
        return publication.getAuthors().stream().anyMatch(author -> email.equalsIgnoreCase(author.getEmail()));
    }
}
