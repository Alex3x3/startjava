package com.startjava.lesson_2_3.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int guessNum;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        guessNum = (int) (Math.random() * 100 + 1);
        while (true) {
            if (makeMove(player1)) {
                break;
            }

            if (makeMove(player2)) {
                break;
            }
        }
    }

    private boolean makeMove(Player player) {
        Scanner console = new Scanner(System.in);
        System.out.println("\nОчередь игрока: " + player.getName());
        System.out.print("Введите ваш ответ: ");
        player.setNumber(console.nextInt());
        console.nextLine();
        if (player.getNumber() < guessNum) {
            System.out.println("Число = " + player.getNumber() + " меньше того, " +
                    "что загадал компьютер");
        } else if (player.getNumber() > guessNum) {
            System.out.println("Число = " + player.getNumber() + " больше того, " +
                    "что загадал компьютер");
        } else {
            System.out.println(player.getName() + " победил");
            return true;
        }
        return false;
    }
}