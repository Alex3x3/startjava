package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("\n###Программа Калькулятор v3.0###");
        String userAnswer = "yes";
        Scanner input = new Scanner(System.in);
        while (userAnswer.equals("yes")) {
            System.out.print("\nВведите математическое выражение: ");
            while (true) {
                try {
                    String expression = input.nextLine();
                    System.out.print(expression + " = " + Calculator.calculate(expression));
                    break;
                } catch (RuntimeException e) {
                    System.out.print("\nОшибка ввода (" + e + "). Повторите ввод: ");
                }
            }
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                userAnswer = input.nextLine();
            } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
        }
    }
}