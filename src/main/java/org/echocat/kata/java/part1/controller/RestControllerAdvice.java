package org.echocat.kata.java.part1.controller;

import org.echocat.kata.java.part1.exception.PublicationNotFoundException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
public class RestControllerAdvice {

    private static final Logger LOG = LoggerFactory.getLogger(RestControllerAdvice.class);

    @ResponseBody
    @ExceptionHandler({PublicationNotFoundException.class})
    @ResponseStatus(NOT_FOUND)
    public String handleNotFoundExceptions(final RuntimeException exception) {
        LOG.error(exception.getMessage(), exception);
        return exception.getMessage();
    }
}
