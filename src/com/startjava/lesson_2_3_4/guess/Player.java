package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Player {

    private final String name;
    private final int[] numbers = new int[10];

    private int move;

    private int win;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return numbers[move - 1];
    }

    public void addNumber(int number) {

        if (number > 0 && number <= 100) {
            numbers[move++] = number;
        } else {
            throw new InputMismatchException();
        }
    }

    public int getMove() {
        return move;
    }

    public boolean hasMoves() {
        return move < 10;
    }

    public void setWinToZero() {
        win = 0;
    }

    public void incrementWin() {
        win++;
    }

    public int getWin() {
        return win;
    }


    public int[] getAnswers() {
        return Arrays.copyOf(numbers, move);
    }

    public void resetRound() {
        Arrays.fill(numbers, 0, move, 0);
        move = 0;
    }
}