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
        while (player1.hasMoves() || player2.hasMoves()) {
            if (player1.hasMoves()) {
                if (makeMove(player1)) {
                    break;
                }
            }
            if (player2.hasMoves()) {
                if (makeMove(player2)) {
                    break;
                }
            }
        }
        player1.showAnswers();
        player2.showAnswers();
    }

    private boolean makeMove(Player player) {
        System.out.println("\nОчередь игрока: " + player.getName());
        System.out.print("Введите ваш ответ: ");
        Scanner console = new Scanner(System.in);
        player.setNumber(console.nextInt());
        console.nextLine();
        if (player.getNumber() < guessNum) {
            System.out.println("Число = " + player.getNumber() + " меньше того, " +
                    "что загадал компьютер");
        } else if (player.getNumber() > guessNum) {
            System.out.println("Число = " + player.getNumber() + " больше того, " +
                    "что загадал компьютер");
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getNumber() +
                    " с " + (player.getMove() + 1) + " попытки");
            player.setNextMove();
            return true;
        }

        player.setNextMove();
        if (!player.hasMoves()) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        return false;
    }
}