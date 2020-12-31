package org.echocat.kata.java.part1.controller;

import org.echocat.kata.java.part1.model.Publication;
import org.echocat.kata.java.part1.repository.PublicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {

    @Autowired
    private PublicationRepository publicationRepository;

    @GetMapping("/{email}/publication")
    public ResponseEntity<List<Publication>> getPublications(@PathVariable String email){
        return new ResponseEntity<>(publicationRepository.findByAuthorsEmail(email), HttpStatus.OK);
    }

}
