package org.echocat.kata.java.part1.loader;

import org.echocat.kata.java.part1.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class InitDataLoader implements CommandLineRunner {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AuthorMapper authorMapper;

    @Autowired
    private FileConfiguration fileConfiguration;

    @Autowired
    private CSVReader csvReader;

    @Override
    public void run(String... args) throws Exception {
        csvReader.getParser(fileConfiguration.getAuthorFilename()).forEach(
            record -> authorRepository.save(authorMapper.csvToRecord(record))
        );

    }
}
