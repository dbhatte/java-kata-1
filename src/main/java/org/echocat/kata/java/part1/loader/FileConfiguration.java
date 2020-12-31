package org.echocat.kata.java.part1.loader;

public class FileConfiguration {

    String getAuthorFilename() {
        return "classpath:org/echocat/kata/java/part1/data/authors.csv";
    }

    String getBookFilename() {
        return "classpath:org/echocat/kata/java/part1/data/books.csv";
    }

    String getMagazineFilename() {
        return "classpath:org/echocat/kata/java/part1/data/magazines.csv";
    }
}
