package com.startjava.graduation.bookshelf;

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
        int option = 0;

        while (option != 7) {
            System.out.println();
            shelf.show();
            System.out.print(menu);
            try {
                option = Integer.parseInt(console.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("\nНеверный формат ввода (допускается только целое число), повторите ввод");
                continue;
            }
            System.out.println();
            switch (option) {
                case 1 -> System.out.println("Кол-во книг на полке: " + shelf.getBookNum());
                case 2 -> System.out.println("Свободного места достаточно для: " + shelf.getFreeSpace() + " книг");
                case 3 -> shelf.add();
                case 4 -> {
                    System.out.print("Укажите название книги для удаления: ");
                    String title = console.nextLine();
                    System.out.print("\nКнига \"" + title);
                    System.out.println(shelf.delete(title) == 1 ? "\" удалена с полки" : "\" не обнаружена");
                }
                case 5 -> {
                    System.out.print("Укажите название книги для поиска: ");
                    String title = console.nextLine();
                    System.out.print("\nКнига \"" + title);
                    System.out.print(shelf.find(title) >= 0 ? "\" находится на полке" : "\" не находится полке");
                    System.out.println();
                }
                case 6 -> {
                    shelf.clear();
                    System.out.println("Полка очищена");
                }
                case 7 -> System.out.println("Программа закончила работу");
                default -> {
                    System.out.println("Указанная опция отсутствует в меню, повторите ввод");
                    option = 0;
                }
            }
        }
    }
}