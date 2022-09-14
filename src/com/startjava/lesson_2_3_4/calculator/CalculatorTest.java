package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("\n###Программа Калькулятор v1.0###");
        Calculator calculator = new Calculator();
        String userAnswer = "yes";
        Scanner input = new Scanner(System.in);
        while (userAnswer.equals("yes")) {
            System.out.print("\nВведите первое число: ");
            int num1 = input.nextInt();
            calculator.setNum1(num1);
            System.out.print("Введите знак математической операции: ");
            char sign = input.next().charAt(0);
            calculator.setSign(sign);
            System.out.print("Введите второе число: ");
            int num2 = input.nextInt();
            calculator.setNum2(num2);
            System.out.print(num1 + " " + sign + " " + num2 + " = " + calculator.calculate());
            input.nextLine();
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                userAnswer = input.nextLine();
            } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
        }
    }
}