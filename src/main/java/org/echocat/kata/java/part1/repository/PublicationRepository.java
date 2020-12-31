package org.echocat.kata.java.part1.repository;

import org.echocat.kata.java.part1.model.Publication;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

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
}
