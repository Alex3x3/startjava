package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    static private int num1;
    static private int num2;
    static private char sign;

    public static int calculate(String exp) throws Exception {
        splitExp(exp);
        return switch (sign) {
            case '+' -> Math.addExact(num1, num2);
            case '-' -> Math.subtractExact(num1, num2);
            case '*' -> Math.multiplyExact(num1, num2);
            case '/' -> num1 / num2;
            case '%' -> num1 % num2;
            case '^' -> (int) Math.pow(num1, num2);
            default -> throw new Exception("знак выражения");
        };
    }

    private static void splitExp(String exp) throws Exception {
        String[] expArr = exp.split(" ");
        if (expArr.length != 3) {
            throw new Exception("количество элементов выражения");
        }

        try {
            num1 = Integer.parseInt(expArr[0]);
        } catch (Exception e) {
            throw new Exception("1-ое число");
        }

        if (num1 < 0) {
            throw new Exception("1-ое число меньше нуля");
        }

        try {
            sign = expArr[1].charAt(0);
        } catch (Exception e) {
            throw new Exception("знак выражения");
        }

        try {
            num2 = Integer.parseInt(expArr[2]);
        } catch (Exception e) {
            throw new Exception("2-ое число");
        }

        if (num2 < 0) {
            throw new Exception("2-ое число меньше нуля");
        }
    }
}