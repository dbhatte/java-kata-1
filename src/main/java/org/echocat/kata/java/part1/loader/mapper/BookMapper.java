package org.echocat.kata.java.part1.loader.mapper;

import org.apache.commons.csv.CSVRecord;
import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class BookMapper {

    @Autowired
    private AuthorMapper authorMapper;

    public Book csvToRecord(CSVRecord record, Map<String, Author> authorMap) {
        return new Book(
            record.get(0),
            record.get(1),
            authorMapper.emailToAuthor(record.get(2), authorMap),
            record.get(3));
    }
}
