public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\nЗадание 1. Подсчет суммы четных и нечетных чисел\n");
        int num = -10;
        int sumOdd = 0;
        int sumEven = 0;
        do {
            if (num % 2 == 0) {
                sumEven += num++;
            } else {
                sumOdd += num++;
            }
        } while (num <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven +
                ", а нечетных = " + sumOdd);

        System.out.println("\nЗадание 2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        num = 10;
        int num2 = 5;
        int num3 = -1;
        int maxNum = 0;
        int minNum = 0;
        if (num > num2) {
            maxNum = num;
        } else {
            maxNum = num2;
        }

        if (maxNum < num3) {
            maxNum = num3;
        }

        if (num < num2) {
            minNum = num;
        } else {
            minNum = num2;
        }

        if (minNum > num3) {
            minNum = num3;
        }

        for (int i = maxNum - 1; i > minNum; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nЗадание 3. Вывод реверсивного числа и суммы его цифр\n");
        num = 1234;
        int tmp = num;
        int sumDigits = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (num > 0) {
            tmp = num % 10;
            num /= 10;
            sumDigits += tmp;
            System.out.print(tmp);
        }
        System.out.println("\nСумма цифр числа: " + sumDigits);

        System.out.println("\nЗадание 4. Вывод чисел на консоль в несколько строк\n");
        int count = 0;
        for (int i = 1; i < 24; i += 2) {
            if (count < 5) {
                System.out.printf("%3d", i);
                count++;
            } else {
                count = 1;
                System.out.println();
                System.out.printf("%3d", i);
            }
        }

        while (count < 5) {
            System.out.printf("%3d", 0);
            count++;
        }

        System.out.println("\n\nЗадание 5. Проверка количества единиц на четность\n");
        num = 3_141_591;
        int divider = 1_000_000;
        tmp = num;
        int sumOnes = 0;
        while (divider > 0) {
            if (num / divider % 10 == 1) {
                sumOnes++;
            }
            divider /= 10;
        }

        if (sumOnes != 0) {
            if (sumOnes % 2 == 0) {
                System.out.println("Число " + num + " содержит " + sumOnes +
                         " (четное) количество единиц");
            } else {
                System.out.println("Число " + num + " содержит " + sumOnes +
                         " (нечетное) количество единиц");
            }
        } else {
            System.out.println("Число " + num + " не содержит единиц");
        }

        System.out.println("\nЗадание 6. Отображение фигур в консоли\n");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        int lines = 5;
        int symbolsInLine = lines;
        while (symbolsInLine > 0) {
            System.out.print("#");
            symbolsInLine--;
            if (symbolsInLine == 0 && lines > 0) {
            symbolsInLine = --lines;
            System.out.println();
            }
        }

        System.out.println();
        int currentLine = 1;
        symbolsInLine = 1;
        count = 0;
        do {
            System.out.print("$");
            count++;
            if (count == symbolsInLine && currentLine < 3) {
                symbolsInLine++;
                currentLine++;
                count = 0;
                System.out.println();
            } else if (count == symbolsInLine && currentLine >= 3) {
                symbolsInLine--;
                currentLine++;
                count = 0;
                System.out.println();
            }
        } while (currentLine <= 5);

        System.out.println("\nЗадание 7. Отображение ASCII-символов\n");
        char codeChar = 'a';
        System.out.printf("%3s%5s%n", "DEC", "Char");
        for (int i = 0; i < 48; i++) {
            if (i > 0 && !(i % 2 == 0)) {
                System.out.printf("%3d%5c%n", i, i);
            }
        }

        for (int i = 97; i < 123; i++) {
            if (i % 2 == 0) {
                System.out.printf("%3d%5c%n", i, i);
            }
        }

        System.out.println("\nЗадание 8. Проверка, является ли число палиндромом\n");
        num = 123_4_321;
        int digitsNum = 0;
        tmp = num;
        while (tmp > 0) {
            tmp /= 10;
            digitsNum++;
        }

        int digitLeft = 0;
        int digitRight = 0;
        divider = 1_000_000;
        tmp = num;
        boolean isPalindrome = true;
        for (int i = 0; i < digitsNum / 2; i++) {
            digitRight = tmp % 10;
            tmp /= 10;
            digitLeft = num / divider % 10;
            divider /= 10;
            if (digitLeft != digitRight ) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Число " + num + " является палиндромом");
        } else {
            System.out.println("Число " + num + " не является палиндромом");
        }

        System.out.println("\nЗадание 9. Определение, является ли число счастливым\n");
        num = 127_235;
        divider = 100_000;
        int digit;
        sumDigits = 0;
        tmp = 0;
        System.out.print("Сумма цифр ");
        for (int i = 0; i < 6; i++) {
            digit = num / divider % 10;
            System.out.print(digit);
            divider /= 10;
            sumDigits += digit;

            if (i == 2) {
                System.out.print(" = " + sumDigits);
                System.out.print("\nСумма цифр ");
                tmp = sumDigits;
                sumDigits = 0;
            }

            if (i == 5) {
                System.out.println(" = " + sumDigits);
            }
        }

        if (sumDigits == tmp) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число не является счастливым");
        }

        System.out.println("\nЗадание 10. Вывод таблицы умножения Пифагора\n");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (i == 0 && j == 0) {
                    System.out.printf("%3s", "|");
                } else if (i == 0) {
                    System.out.printf("%3d", j+1);
                } else if (i == 1) {
                    System.out.print("---");
                } else if (j == 0) {
                    System.out.printf("%2d|", i); 
                } else {
                    System.out.printf("%3d", (j + 1) * i);
                }
            }
            System.out.println();
        }
    }
}