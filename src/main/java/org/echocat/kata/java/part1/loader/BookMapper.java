package org.echocat.kata.java.part1.loader;

import org.apache.commons.csv.CSVRecord;
import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.model.Book;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class BookMapper {

    @Autowired
    private AuthorMapper authorMapper;

    Book csvToRecord(CSVRecord record, Map<String, Author> authorMap) {
        return new Book(
            record.get(0),
            record.get(1),
            authorMapper.emailToAuthor(record.get(2), authorMap),
            record.get(3));
    }
}
