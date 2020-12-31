package org.echocat.kata.java.part1.exception;

public class PublicationNotFoundException extends RuntimeException{

    public PublicationNotFoundException(String message) {
        super(message);
    }
}
