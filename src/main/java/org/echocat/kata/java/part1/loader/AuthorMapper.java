package org.echocat.kata.java.part1.loader;

import org.apache.commons.csv.CSVRecord;
import org.echocat.kata.java.part1.model.Author;

public class AuthorMapper {

    Author csvToRecord(CSVRecord record) {
        return new Author(record.get(0), record.get(1), record.get(2));
    }
}
