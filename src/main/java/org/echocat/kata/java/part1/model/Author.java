package org.echocat.kata.java.part1.model;

public class Author {
    private final String email;

    private final String firstname;

    private final String lastname;

    public Author(String email, String firstname, String lastname) {
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }
}
