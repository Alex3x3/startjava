package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private int num1;
    private int num2;
    private char sign;

    public Calculator(String exp) {
        String[] expParts = exp.split(" ");
        num1 = Integer.parseInt(expParts[0]);
        sign = expParts[1].charAt(0);
        num2 = Integer.parseInt(expParts[2]);
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public char getSign() {
        return sign;
    }

    public int calculate() {
        switch (sign) {
            case '+':
                return Math.addExact(num1, num2);
            case '-':
                return Math.subtractExact(num1, num2);
            case '*':
                return Math.multiplyExact(num1, num2);
            case '/':
                return num1 / num2;
            case '%':
                return num1 % num2;
            case '^':
                return (int) Math.pow(num1, num2);
        }
        return 0;
    }
}