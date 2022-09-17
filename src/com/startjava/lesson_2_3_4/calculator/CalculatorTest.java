package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("\n###Программа Калькулятор v2.0###");
        String userAnswer = "yes";
        Scanner input = new Scanner(System.in);
        while (userAnswer.equals("yes")) {
            System.out.print("\nВведите математическое выражение: ");
            Calculator calculator = new Calculator(input.nextLine());
            System.out.print(calculator.getNum1() + " " + calculator.getSign() + " "
                    + calculator.getNum2() + " = " + calculator.calculate());
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                userAnswer = input.nextLine();
            } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
        }
    }
}