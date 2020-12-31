package org.echocat.kata.java.part1.controller;

import org.echocat.kata.java.part1.exception.PublicationNotFoundException;
import org.echocat.kata.java.part1.model.Publication;
import org.echocat.kata.java.part1.repository.PublicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/publication")
public class PublicationController {

    @Autowired
    private PublicationRepository publicationRepository;

    @GetMapping
    public ResponseEntity<List<Publication>> get(@RequestParam(required = false) String isbn){
        if (isbn != null) {
            return new ResponseEntity<>(Collections.singletonList(publicationRepository.findByISBN(isbn).orElseThrow(
                () -> new PublicationNotFoundException(String.format("Publication not found %s", isbn)))), HttpStatus.OK);
        }

        return new ResponseEntity<>(publicationRepository.findAll(), HttpStatus.OK);
    }

}
