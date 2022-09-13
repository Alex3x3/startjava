package com.startjava.lesson_1.base;

public class IfElseStatementTheme {

    public static void main(String[] args) {
        System.out.println("Задание 1. Перевод псевдокода на язык Java\n");
        int age = 21;
        if (age > 20) {
            System.out.println("Тебе больше 20! Ты можешь водить межзвездный корабль!");
        } else {
            System.out.println("Тебе пока меньше 20! Тебе пока рано водить межзвездный корабль...");
        }

        char sex = 'M';
        if (sex != 'M') {
            System.out.println("К сожалению женщина не может работать шахтером...");
        } else {
            System.out.println("Ура! Мужчина может работать шахтером!");
        }

        float height = 1.86F;
        if (height < 1.80) {
            System.out.println("Твой рост меньше 1,8 м. Из тебя получится хороший танкист!");
        } else {
            System.out.println("Боюсь с ростом " + height + " м о карьере танкиста " +
                    "ты можешь забыть...");
        }

        char nameFirstLetter = "Igor".charAt(0);
        if (nameFirstLetter == 'M') {
            System.out.println("Возможно тебя зовут Марина");
        } else if (nameFirstLetter == 'I') {
            System.out.println("Допускаю, что тебя зовут Игорь");
        } else {
            System.out.println("Да не знаю я, как тебя зовут!");
        }

        System.out.println("\nЗадание 2. Поиск max и min числа\n");
        int num1 = 535;
        int num2 = 7463;
        if (num1 > num2) {
            System.out.println("Число max: " + num1 + ", число min: " + num2);
        } else if (num1 < num2) {
            System.out.println("Число max: " + num2 + ", число min: " + num1);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\nЗадание 3. Работа с числом\n");
        num1 = 1179;
        if (num1 != 0) {
            System.out.println("Имеется число: " + num1);
            if (num1 % 2 == 0) {
                System.out.println("Число четное");
            } else {
                System.out.println("Число нечетное");
            }
            
            if (num1 > 0) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");
            }
        } else {
            System.out.println("Число является нулем");
        }

        System.out.println("\nЗадание 4. Поиск одинаковых цифр в числах\n");
        num1 = 746;
        num2 = 548;
        System.out.println("Число 1: " + num1 + ", число 2: " + num2);
        if (num1 / 100 == num2 / 100) {
            System.out.println("Разряд 3 (сотен) чисел равен. Число сотен: " + num1 / 100);
        }

        if ((num1 % 100 / 10) == (num2 % 100 / 10)) {
            System.out.println("Разряд 2 (десятков) чисел равен. Число десятков: " +
                    num1 % 100 / 10);
        }

        if (num1 % 10 == num2 % 10) {
            System.out.println("Разряд 1 (единиц) чисел равен. Число единиц: " + num1 % 10);
        }

        System.out.println("\nЗадание 5. Определение буквы, числа или символа по их коду\n");
        char codeChar = 'W';
        System.out.print("Код \'" + codeChar + "\' - ");
        if (codeChar > 30 && codeChar < 39) {
            System.out.print("число\n");
        } else if (codeChar  >= 65 && codeChar <= 90) {
            System.out.println("большая буква");
        } else if (codeChar >= 97 && codeChar <= 122) {
            System.out.println("маленькая буква");
        } else {
            System.out.println("не буква и не число");
        }

        System.out.println("\nЗадание 6. Определение суммы вклада и начисленных банком %\n");
        int depositSum = 300_000;
        int percentage = 0; 
        System.out.println("Сумма вклада: "+ depositSum);
        if (depositSum < 100_000) {
            percentage = 5;
        } else if (depositSum >= 100_000 && depositSum < 300_000) {
            percentage = 7;
        } else {
            percentage = 10;
        }
        System.out.println("Процент начислений за год: " + percentage + "%");
        System.out.println("Сумма вклада с начисленными за год процентами: " + (depositSum + 
                (depositSum * percentage) / 100));

        System.out.println("\nЗадание 7. Определение оценки по предметам\n");
        int historyPercents = 59;
        int historyMark = 0;
        int programmingPercents = 91;
        int programmingMark = 0;
        if (historyPercents <= 60) {
            historyMark = 2;
        } else if (historyPercents > 60 && historyPercents <= 73) {
            historyMark = 3;
        } else if (historyPercents > 73 && historyPercents <= 91) {
            historyMark = 4;
        } else {
            historyMark = 5;
        }
        System.out.println(historyMark + " - балл по истории");

        if (programmingPercents <= 60) {
            programmingMark = 2;
        } else if (programmingPercents > 60 && programmingPercents <= 73) {
            programmingMark = 3;
        } else if (programmingPercents > 73 && programmingPercents <= 91) {
            programmingMark = 4;
        } else {
            programmingMark = 5;
        }
        System.out.println(programmingMark + " - балл по программированию");
        System.out.println((historyMark + programmingMark) / 2 + " - средний балл по предметам");
        System.out.println((historyPercents + programmingPercents) / 2 + " %" +
                " - средний процент по предметам");

        System.out.println("\nЗадание 8. Расчет прибыли\n");
        int rentalMonthPrice = 5_000;
        int goodsMonthSale = 13_000;
        int goodsMonthCost = 9_000;
        int annualProfit = (goodsMonthSale - goodsMonthCost - rentalMonthPrice) * 12;
        if (annualProfit > 0) {
            System.out.println("Прибыль за год: +" + annualProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + annualProfit + " руб.");
        }

        System.out.println("\nЗадание 9. Подсчет количества банкнот\n");
        int moneySum = 567;
        int hundredDollars = moneySum / 100;
        int tenDollars = moneySum % 100 / 10;
        int oneDollar = moneySum % 10;
        if (tenDollars > 5) {
            oneDollar += (tenDollars - 5) * 10;
            tenDollars = 5;
        }
        System.out.println("100-долларовых банкнот - " + hundredDollars);
        System.out.println("10-долларовых банкнот - " + tenDollars);
        System.out.println("Банкнот в один доллар - " + oneDollar);

        int moneySumCheck = hundredDollars * 100 + tenDollars * 10 + oneDollar;
        System.out.println("Исходная сумма = " + moneySumCheck + " USD");
    }
}