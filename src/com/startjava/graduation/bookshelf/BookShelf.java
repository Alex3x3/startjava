package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.InputMismatchException;

public class BookShelf {

    private int booksNum = 0;
    private final Book[] books = new Book[10];

    public int getBooksNum() {
        return booksNum;
    }

    public Book[] getBooks() {
        return books;
    }

    public int getFreeSpace() {
        return books.length - booksNum;
    }

    public void add(String author, String title, String publishYear) throws InputMismatchException,
            IllegalArgumentException {
        books[booksNum] = new Book();
        books[booksNum].setAuthor(author);
        books[booksNum].setTitle(title);
        books[booksNum].setPublishYear(publishYear);
        booksNum++;
    }

    public int delete(String title) {
        int bookPos = find(title);

        if (bookPos != -1) {
            if (bookPos < books.length) {
                System.arraycopy(books, bookPos + 1, books, bookPos, booksNum - bookPos - 1);
            }
            books[booksNum - 1] = null;
            booksNum--;
            return 1;
        } else {
            return -1;
        }
    }

    public int find(String title) {
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