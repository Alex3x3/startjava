package com.startjava.graduation.bookshelf;

import java.util.InputMismatchException;

public class Book {

    private String author;
    private String title;
    private int publishYear;

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPublishYear(int publishYear) {
        if (publishYear > 0 && publishYear <= 2022) {
            this.publishYear = publishYear;
        } else {
            throw new InputMismatchException();
        }
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + publishYear;
    }
}