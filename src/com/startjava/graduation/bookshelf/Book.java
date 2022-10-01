package com.startjava.graduation.bookshelf;

import java.util.InputMismatchException;

public class Book {

    private final String author;
    private final String title;
    private int publishYear;

    public Book(String author, String title, String publishYear) {
        this.author = author;
        this.title = title;
        setPublishYear(publishYear);
    }

    public String getTitle() {
        return title;
    }

    private void setPublishYear(String publishYear) {
        int tmp;
        try {
            tmp = Integer.parseInt(publishYear);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Ввод должен быть целым числом.");
        }
        if (tmp >= 1455 && tmp <= 2022) {
            this.publishYear = tmp;
        } else {
            throw new InputMismatchException("Неверно указан год издания.");
        }
    }

    @Override
    public String toString() {
        return author + ", " + title + ", " + publishYear;
    }
}