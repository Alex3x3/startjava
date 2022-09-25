package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class BookShelf {

    private int bookNum = 0;
    private final Book[] books = new Book[10];

    public int getBookNum() {
        return bookNum;
    }

    public int getFreeSpace() {
        return books.length - bookNum;
    }

    public void add() {
        if (bookNum < books.length) {
            Scanner console = new Scanner(System.in);
            books[bookNum] = new Book();
            System.out.print("Введите автора книги: ");
            books[bookNum].setAuthor(console.nextLine());
            System.out.print("Введите название книги: ");
            books[bookNum].setTitle(console.nextLine());
            System.out.print("Введите года издания: ");
            while (true) {
                try {
                    books[bookNum].setPublishYear(console.nextInt());
                    bookNum++;
                    return;
                } catch (InputMismatchException | IllegalArgumentException e) {
                    System.out.print("Ошибка ввода года издания, поторите ввод: ");
                    console.nextLine();
                }
            }
        }
        System.out.println("Полка уже полностью заполнена");
    }

    public int delete(String title) {
        int bookPos = find(title);

        if (bookPos != -1) {
            if (bookPos < books.length) {
                System.arraycopy(books, bookPos + 1, books, bookPos, bookNum - bookPos - 1);
            }
            books[bookNum - 1] = null;
            bookNum--;
            return 1;
        } else {
            return -1;
        }
    }

    public int find(String title) {
        for (int i = bookNum - 1; i >= 0; i--) {
            if (books[i].getTitle().equals(title)) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        Arrays.fill(books, 0, bookNum, null);
        bookNum = 0;
    }

    public void show() {
        int titleMaxLength = getTitleMaxLength();
        for (int i = bookNum - 1; i >= 0; i--) {
            System.out.println("|" + "-".repeat(titleMaxLength) + "|");
            int bookLength = books[i].toString().length();
            int titleFreeSpace = titleMaxLength - bookLength;
            System.out.print("|" + " ".repeat(titleFreeSpace / 2) + books[i] +
                             " ".repeat(titleFreeSpace / 2));
            System.out.println(titleFreeSpace % 2 != 0 ? " |" : "|");
            if (i == 0) {
                System.out.println("|" + "-".repeat(titleMaxLength) + "|");
                System.out.println("|" + " ".repeat(titleMaxLength) + "|");
            }
        }
        if (bookNum == 0) {
            System.out.println("|" + " ".repeat(48) + "|");
        }
    }

    private int getTitleMaxLength() {
        int titleMaxLength = 0;
        for (Book book : books) {
            if (book == null) {
                return titleMaxLength;
            }
            int titleLength = book.toString().length();
            if (titleLength > titleMaxLength) {
                titleMaxLength = titleLength;
            }
        }
        return titleMaxLength;
    }
}