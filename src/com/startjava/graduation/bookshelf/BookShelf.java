package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class BookShelf {

    private int booksNum;
    private final Book[] books = new Book[10];

    private int titleMaxLength;

    public int getBooksNum() {
        return booksNum;
    }

    public Book[] getBooks() {
        return Arrays.copyOfRange(books, 0, booksNum);
    }

    public int getTitleMaxLength() {
        return titleMaxLength;
    }

    public int getFreeSpace() {
        return books.length - booksNum;
    }

    public void add(Book book) {
        books[booksNum] = book;
        booksNum++;
        int titleLength = book.toString().length();
        if (titleLength > titleMaxLength) {
            titleMaxLength = titleLength;
        }
    }

    public boolean delete(String title) {
        int bookIndex = findIndex(title);
        if (bookIndex != -1) {
            int titleLength = books[bookIndex].toString().length();
            System.arraycopy(books, bookIndex + 1, books, bookIndex, booksNum - bookIndex - 1);
            books[booksNum - 1] = null;
            booksNum--;
            if (titleLength == titleMaxLength) {
                calcMaxTitleLength();
            }
            return true;
        }
        return false;
    }

    private int findIndex(String title) {
        for (int i = booksNum - 1; i >= 0; i--) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        Arrays.fill(books, 0, booksNum, null);
        booksNum = 0;
    }

    private void calcMaxTitleLength() {
        titleMaxLength = 0;
        for (Book book : books) {
            if (book == null) {
                break;
            }
            int titleLength = book.toString().length();
            if (titleLength > titleMaxLength) {
                titleMaxLength = titleLength;
            }
        }
    }
}