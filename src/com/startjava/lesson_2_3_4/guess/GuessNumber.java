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
        Player[] queue = toss(players);
        for (int i = 0; i < 3; i++) {
            startRound(queue);
            if (i < 2) {
                System.out.println("\nСледующий раунд...");
            }
        }
        showWinners(queue);
    }

    private void startRound(Player[] queue) {
        for (Player player : players) {
            player.resetRound();
        }
        guessNum = (int) (Math.random() * 100 + 1);

        boolean stop = false;
        round:
        while (!stop) {
            stop = true;
            for (Player player : queue) {
                if (player.hasMoves()) {
                    stop = false;
                    if (makeMove(player)) {
                        player.incrementWin();
                        break round;
                    }
                }
            }
        }
        for (Player player : queue) {
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
        System.out.println(answer < guessNum ? " меньше того, что загадал компьютер" :
                " больше того, что загадал компьютер");

        if (!player.hasMoves()) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }

        return false;
    }

    private Player[] toss(Player... players) {
        Player[] queue = new Player[players.length];
        for (int i = players.length - 1; i >= 0; i--) {
            players[i].setWinToZero();
            int randomNum = (int) (Math.random() * (i + 1));
            queue[i] = players[randomNum];

            Player tmp = players[i];
            players[i] = players[randomNum];
            players[randomNum] = tmp;
        }
        return queue;
    }

    private void showAnswers(Player player) {
        System.out.print("\nОтветы игрока " + player.getName() + ": ");
        for (int i : player.getAnswers()) {
            System.out.print(i + " ");
        }
    }

    private void showWinners(Player[] queue) {
        int maxWin = 0;
        for (Player player : queue) {
            if (player.getWin() > maxWin)
                maxWin = player.getWin();
        }

        System.out.println();
        for (Player player : queue) {
            if (player.getWin() == maxWin) {
                System.out.println("Игрок " + player.getName() + " победил, количество побед в игре: " + maxWin);
            }
        }
    }
}