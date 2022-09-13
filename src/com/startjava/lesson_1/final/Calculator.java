package com.startjava.lesson_1.final;

public class Calculator {

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 3;
        char sign = '^';
        int result = 0;
        if (sign == '+') {
            result = num1 + num2;
        } else if (sign == '-') {
            result = num1 - num2;
        } else if (sign == '*') {
            result = num1 * num2;
        } else if (sign == '/') {
            result = num1 / num2;
        } else if (sign == '^') {
            result = num1;
            for (int i = 0; i < num2 - 1; i++) {
                result *= num1;
            }
        } else if (sign == '%') {
            result = num1 % num2;
        }
        System.out.println(num1 + " " + sign + " " + num2 + " = " + result);
    }
}