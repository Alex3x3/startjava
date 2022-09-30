package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class BookShelf {

    private int booksNum;
    private final Book[] books = new Book[10];

    public int getBooksNum() {
        return booksNum;
    }

    public Book[] getBooks() {
        return Arrays.copyOfRange(books, 0, booksNum);
    }

    public int getFreeSpace() {
        return books.length - booksNum;
    }

    public void add(Book book) {
        books[booksNum] = book;
        booksNum++;
    }

    public void delete(int bookIndex) {

        if (bookIndex != -1) {
            System.arraycopy(books, bookIndex + 1, books, bookIndex, booksNum - bookIndex - 1);
            books[booksNum - 1] = null;
            booksNum--;
        }
    }

    public int findIndex(String title) {
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
}