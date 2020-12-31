package org.echocat.kata.java.part1.configuration;

import org.springframework.stereotype.Component;

@Component
public class FileConfiguration {

    public static final String CLASSPATH_ORG_ECHOCAT_KATA_JAVA_PART_1_DATA_AUTHORS_CSV =
        "classpath:org/echocat/kata/java/part1/data/authors.csv";
    public static final String CLASSPATH_ORG_ECHOCAT_KATA_JAVA_PART_1_DATA_BOOKS_CSV =
        "classpath:org/echocat/kata/java/part1/data/books.csv";
    public static final String CLASSPATH_ORG_ECHOCAT_KATA_JAVA_PART_1_DATA_MAGAZINES_CSV =
        "classpath:org/echocat/kata/java/part1/data/magazines.csv";

    public String getAuthorFilename() {
        return CLASSPATH_ORG_ECHOCAT_KATA_JAVA_PART_1_DATA_AUTHORS_CSV;
    }

    public String getBookFilename() {
        return CLASSPATH_ORG_ECHOCAT_KATA_JAVA_PART_1_DATA_BOOKS_CSV;
    }

    public String getMagazineFilename() {
        return CLASSPATH_ORG_ECHOCAT_KATA_JAVA_PART_1_DATA_MAGAZINES_CSV;
    }
}
