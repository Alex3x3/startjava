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

    public void setPublishYear(String publishYear) {
        int tmp;
        try {
            tmp = Integer.parseInt(publishYear);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Ввод должен быть целым цислом.");
        }
        if (tmp > 0 && tmp <= 2022) {
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