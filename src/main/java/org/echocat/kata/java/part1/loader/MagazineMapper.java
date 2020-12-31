package org.echocat.kata.java.part1.loader;

import org.apache.commons.csv.CSVRecord;
import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.model.Magazine;
import org.echocat.kata.java.part1.model.Publication;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

public class MagazineMapper {

    private static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d.MM.yyyy");

    @Autowired
    private AuthorMapper authorMapper;

    public Publication csvToRecord(CSVRecord record, Map<String, Author> authorMap) {

        return new Magazine(
            record.get(0),
            record.get(1),
            authorMapper.emailToAuthor(record.get(2), authorMap),
            LocalDate.parse(record.get(3), dateTimeFormatter)
        );
    }
}
