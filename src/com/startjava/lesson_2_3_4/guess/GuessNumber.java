package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private final Player player1;
    private final Player player2;
    private int guessNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        player1.reset();
        player2.reset();
        guessNum = (int) (Math.random() * 100 + 1);
        while (true) {
            if (player1.hasMoves()) {
                if (makeMove(player1)) {
                    break;
                }
            }
            if (player2.hasMoves()) {
                if (makeMove(player2)) {
                    break;
                }
            } else {
                break;
            }
        }
        showAnswers(player1, player1.getAnswers());
        showAnswers(player2, player2.getAnswers());
    }

    private boolean makeMove(Player player) {
        System.out.println("\nОчередь игрока: " + player.getName());
        System.out.print("Введите ваш ответ: ");
        Scanner console = new Scanner(System.in);
        player.addNumber(console.nextInt());
        console.nextLine();

        int answer = player.getNumber();
        if (answer == guessNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " + answer +
                    " с " + (player.getMove()) + " попытки");
            return true;
        } else if (answer < guessNum) {
            System.out.println("Число = " + answer + " меньше того, " +
                    "что загадал компьютер");
        } else {
            System.out.println("Число = " + answer + " больше того, " +
                    "что загадал компьютер");
        }

        if (!player.hasMoves()) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }

        return false;
    }

    private void showAnswers(Player player, int[] answers) {
        System.out.print("\nОтветы игрока " + player.getName() + ": ");
        for (int i : answers) {
            System.out.print(i + " ");
        }
    }
}