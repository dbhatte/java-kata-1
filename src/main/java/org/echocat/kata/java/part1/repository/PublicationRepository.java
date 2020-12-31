package org.echocat.kata.java.part1.repository;

import org.echocat.kata.java.part1.model.Publication;

import java.util.ArrayList;
import java.util.List;

public class PublicationRepository {

    private List<Publication> publications = new ArrayList<>();

    public void save(Publication publication) {
        publications.add(publication);
    }
}
