package org.echocat.kata.java.part1.loader;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.FileReader;
import java.io.IOException;

@Component
public class CSVReader {

    @Autowired
    private ResourceLoader resourceLoader;

    public CSVParser getParser(String filename) throws IOException {
        return CSVFormat.newFormat(';')
            .withFirstRecordAsHeader()
            .parse(new FileReader(resourceLoader.getResource(filename)
                .getFile()));
    }
}
