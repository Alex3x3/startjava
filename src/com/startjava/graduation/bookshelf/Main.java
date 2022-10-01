package com.startjava.graduation.bookshelf;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("\nПрограмма \"Книжная полка\" v 1.0");
        BookShelf shelf = new BookShelf();
        String menu = """
                \n1. Показать кол-во книг на полке
                2. Показать кол-во свободного места
                3. Добавить книгу <автор> <название> <год издания>
                4. Удалить книгу <название>
                5. Найти книгу <название>
                6. Очистить полку
                7. Завершить
                                
                Введите действие:\s""";

        Scanner console = new Scanner(System.in);
        int menuItem = 0;
        do {
            System.out.println();
            show(shelf);
            System.out.print(menu);
            try {
                menuItem = Integer.parseInt(console.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("\nНеверный формат ввода (допускается только целое число), повторите ввод");
                continue;
            }
            System.out.println();
            switchMenu(menuItem, shelf);
        } while (menuItem != 7);
    }

    private static void switchMenu(int menuItem, BookShelf shelf) {
        Scanner console = new Scanner(System.in);
        switch (menuItem) {
            case 1 -> System.out.println("Кол-во книг на полке: " + shelf.getBooksNum());
            case 2 -> System.out.println("Свободного места достаточно для: " + shelf.getFreeSpace() + " книг");
            case 3 -> {
                if (shelf.getFreeSpace() > 0) {
                    System.out.print("Введите автора книги: ");
                    String author = console.nextLine();
                    System.out.print("Введите название книги: ");
                    String title = console.nextLine();
                    System.out.print("Введите года издания: ");
                    while (true) {
                        try {
                            shelf.add(new Book(author, title, console.nextLine()));
                            break;
                        } catch (InputMismatchException | IllegalArgumentException e) {
                            System.out.print(e.getMessage() + " Повторите ввод года издания: ");
                        }
                    }
                } else {
                    System.out.println("\nПолка уже полностью заполнена.");
                }
            }
            case 4 -> {
                System.out.print("Укажите название книги для удаления: ");
                String title = console.nextLine();
                System.out.print("\nКнига \"");
                String book = findBook(shelf, title);
                System.out.println(shelf.delete(title)
                        ? book + "\" удалена с полки"
                        : title + "\" не обнаружена");
            }
            case 5 -> {
                System.out.print("Укажите название книги для поиска: ");
                String title = console.nextLine();
                System.out.print("\nКнига \"");
                String book = findBook(shelf, title);
                System.out.println(book.length() > 0
                        ? book + "\" находится на полке"
                        : title + "\" не обнаружена");
            }
            case 6 -> {
                shelf.clear();
                System.out.println("Полка очищена");

            }
            case 7 -> System.out.println("Программа закончила работу");
            default -> System.out.println("Указанная опция отсутствует в меню, повторите ввод");
        }
    }

    private static void show(BookShelf shelf) {
        int titleMaxLength = shelf.getTitleMaxLength();
        Book[] books = shelf.getBooks();
        int booksNum = shelf.getBooksNum();
        for (int i = booksNum - 1; i >= 0; i--) {
            System.out.println("|" + "-".repeat(titleMaxLength) + "|");
            int bookLength = books[i].toString().length();
            int titleFreeSpace = titleMaxLength - bookLength;
            System.out.print("|" + " ".repeat(titleFreeSpace / 2) + books[i] +
                             " ".repeat(titleFreeSpace / 2));
            System.out.println(titleFreeSpace % 2 == 0 ? "|" : " |");
            if (i == 0) {
                System.out.println("|" + "-".repeat(titleMaxLength) + "|");
                System.out.println("|" + " ".repeat(titleMaxLength) + "|");
            }
        }
        if (booksNum == 0) {
            System.out.println("|" + " ".repeat(10) + "|");
        }
    }

    private static String findBook(BookShelf shelf, String title) {
        Book[] books = shelf.getBooks();

        for (int i = books.length - 1; i >= 0; i--) {
            if (books[i].getTitle().equals(title)) {
                return String.valueOf(books[i]);
            }
        }
        return "";
    }
}