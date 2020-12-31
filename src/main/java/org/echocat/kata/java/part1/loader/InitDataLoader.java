package org.echocat.kata.java.part1.loader;

import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.repository.AuthorRepository;
import org.echocat.kata.java.part1.repository.PublicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import java.util.Map;
import java.util.stream.Collectors;

public class InitDataLoader implements CommandLineRunner {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AuthorMapper authorMapper;

    @Autowired
    private FileConfiguration fileConfiguration;

    @Autowired
    private CSVReader csvReader;

    @Autowired
    private PublicationRepository publicationRepository;

    @Autowired
    private BookMapper bookMapper;

    @Autowired
    private MagazineMapper magazineMapper;

    @Override
    public void run(String... args) throws Exception {
        csvReader.getParser(fileConfiguration.getAuthorFilename()).forEach(
            record -> authorRepository.save(authorMapper.csvToRecord(record))
        );

        Map<String, Author> authorMap = authorRepository.findAll().stream().collect(Collectors.toMap(Author::getEmail, author -> author));

        csvReader.getParser(fileConfiguration.getBookFilename()).forEach(
            record -> publicationRepository.save(bookMapper.csvToRecord(record, authorMap))
        );

        csvReader.getParser(fileConfiguration.getMagazineFilename()).forEach(
            record -> publicationRepository.save(magazineMapper.csvToRecord(record, authorMap))
        );
    }
}
