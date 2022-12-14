package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    static private int num1;
    static private int num2;
    static private char sign;

    public static int calculate(String expression) {
        splitExp(expression);
        return switch (sign) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> num1 / num2;
            case '%' -> num1 % num2;
            case '^' -> (int) Math.pow(num1, num2);
            default -> throw new IllegalArgumentException("знак выражения");
        };
    }

    private static void splitExp(String expression) {
        String[] expArr = expression.split(" ");
        if (expArr.length != 3) {
            throw new IllegalArgumentException("количество элементов выражения");
        }

        try {
            num1 = Integer.parseInt(expArr[0]);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("1-ое число");
        }

        if (num1 < 1) {
            throw new IllegalArgumentException("1-ое число меньше или равно нулю");
        }

        if (expArr[1].length() > 1) {
            throw new IllegalArgumentException("знак выражения");
        }
        sign = expArr[1].charAt(0);

        try {
            num2 = Integer.parseInt(expArr[2]);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("2-ое число");
        }

        if (num2 < 1) {
            throw new IllegalArgumentException("2-ое число меньше или равно нулю");
        }
    }
}