package com.startjava.lesson_2_3_4.guess;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {

    private final Player[] players;
    private int guessNum;

    public GuessNumber(Player... players) {
        this.players = players;
    }

    public void startGame() {
        drawLots();
        for (int i = 0; i < 3; i++) {
            startRound();
            if (i < 2) {
                System.out.println("\nСледующий раунд...");
            }
        }
        showWinners();
    }

    private void drawLots() {
        for (int i = players.length - 1; i >= 0; i--) {
            players[i].setWinToZero();
            int randomNum = (int) (Math.random() * (i + 1));
            Player tmp = players[i];
            players[i] = players[randomNum];
            players[randomNum] = tmp;
        }
    }

    private void startRound() {
        for (Player player : players) {
            player.resetRound();
        }
        guessNum = (int) (Math.random() * 100 + 1);

        boolean stop = false;
        while (!stop) {
            for (Player player : players) {
                if (!stop && player.hasMoves()) {
                    if (makeMove(player)) {
                        player.incrementWin();
                        stop = true;
                    }
                }
            }
        }
        for (Player player : players) {
            showAnswers(player);
        }
        System.out.println();
    }

    private boolean makeMove(Player player) {
        System.out.println("\nОчередь игрока: " + player.getName());
        System.out.print("Введите ваш ответ: ");
        Scanner console = new Scanner(System.in);
        try {
            player.addNumber(console.nextInt());
        } catch (InputMismatchException e) {
            System.out.println("Игрок " + player.getName() + " ввел некорректное число");
            return false;
        }
        console.nextLine();

        int answer = player.getNumber();
        if (answer == guessNum) {
            System.out.println("Игрок " + player.getName() + " угадал число " + answer +
                    " с " + (player.getMove()) + " попытки");
            return true;
        }

        System.out.print("Число = " + answer);
        System.out.print(answer < guessNum ? " меньше того" :
                " больше того");
        System.out.println(", что загадал компьютер");

        if (!player.hasMoves()) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }

        return false;
    }

    private void showAnswers(Player player) {
        System.out.print("\nОтветы игрока " + player.getName() + ": ");
        for (int i : player.getAnswers()) {
            System.out.print(i + " ");
        }
    }

    private void showWinners() {
        int maxWin = 0;
        for (Player player : players) {
            if (player.getWin() > maxWin)
                maxWin = player.getWin();
        }

        System.out.println();
        for (Player player : players) {
            if (player.getWin() == maxWin) {
                System.out.println("Игрок " + player.getName() +
                        " победил, количество побед в игре: " + maxWin);
            }
        }
    }
}