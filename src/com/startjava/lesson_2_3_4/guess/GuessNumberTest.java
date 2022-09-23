package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("\n###Guess Number Game v3.0###\n");
        System.out.println("У каждого игрока по 10 попыток\n");
        Scanner console = new Scanner(System.in);
        GuessNumber game = new GuessNumber(setPlayers(console));

        String option = "yes";
        while (option.equals("yes")) {
            game.startGame();
            do {
                System.out.print("\nХотите продолжить игру? [yes/no]: ");
                option = console.nextLine();
            } while (!option.equals("yes") && !option.equals("no"));
        }
    }

    private static Player[] setPlayers(Scanner console) {
        Player[] players = new Player[3];
        for (int i = 0; i < players.length; i++) {
            System.out.print("Введите имя игрока " + (i + 1) + ": ");
            players[i] = new Player(console.nextLine());
        }
        return players;
    }
}