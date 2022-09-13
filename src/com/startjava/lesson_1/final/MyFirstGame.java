package com.startjava.lesson_1.final;

public class MyFirstGame {

    public static void main(String[] args) {
        int guessNum = 36;
        int startRange = 1;
        int endRange = 100;
        int answer = 0;

        while (answer != guessNum) {
            answer = (startRange + endRange) / 2;
            if (answer < guessNum) {
                startRange = answer + 1;
                System.out.println("Число = " + answer + " меньше того," +
                        "что загадал компьютер");
            } else if (answer > guessNum) {
                endRange = answer - 1;
                System.out.println("Число = " + answer + " больше того," +
                        "что загадал компьютер");
            }
        }
        System.out.println("Вы победили! Загаданное число = " + answer);
    }
}