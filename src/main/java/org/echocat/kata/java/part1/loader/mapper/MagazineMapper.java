package org.echocat.kata.java.part1.loader.mapper;

import org.apache.commons.csv.CSVRecord;
import org.echocat.kata.java.part1.model.Author;
import org.echocat.kata.java.part1.model.Magazine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@Component
public class MagazineMapper {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("d.MM.yyyy");

    @Autowired
    private AuthorMapper authorMapper;

    public Magazine csvToRecord(CSVRecord record, Map<String, Author> authorMap) {

        return new Magazine(
            record.get(0),
            record.get(1),
            authorMapper.emailToAuthor(record.get(2), authorMap),
            LocalDate.parse(record.get(3), dateTimeFormatter)
        );
    }
}
