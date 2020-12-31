package org.echocat.kata.java.part1.loader.mapper;

import org.apache.commons.csv.CSVRecord;
import org.echocat.kata.java.part1.model.Author;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class AuthorMapper {

    public Author csvToRecord(CSVRecord record) {
        return new Author(record.get(0), record.get(1), record.get(2));
    }

    List<Author> emailToAuthor(String emails, Map<String, Author> authorMap) {
        return Arrays.stream(emails.split(",")).map(authorMap::get).collect(Collectors.toList());
    }
}
