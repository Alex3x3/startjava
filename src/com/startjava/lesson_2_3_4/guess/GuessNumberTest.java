package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("\n###Guess Number Game v2.0###\n");
        System.out.println("У каждого игрока по 10 попыток\n");
        System.out.print("Введите имя первого игрока: ");
        Scanner console = new Scanner(System.in);
        Player player1 = new Player(console.nextLine());
        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(console.nextLine());
        System.out.print("Введите имя третьего игрока: ");
        Player player3 = new Player(console.nextLine());
        GuessNumber game = new GuessNumber(player1, player2, player3);

        String option = "yes";
        while (option.equals("yes")) {
            game.startGame();
            do {
                System.out.print("\nХотите продолжить игру? [yes/no]: ");
                option = console.nextLine();
            } while (!option.equals("yes") && !option.equals("no"));
        }
    }
}