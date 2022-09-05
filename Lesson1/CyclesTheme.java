public class CyclesTheme {

    public static void main(String[] args) {
        System.out.println("\nЗадание 1. Подсчет суммы четных и нечетных чисел\n");
        int counter = -10;
        int sumOdd = 0;
        int sumEven = 0;
        do {
            if (counter % 2 == 0) {
                sumEven += counter;
            } else {
                sumOdd += counter;
            }
        } while (++counter <= 21);
        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEven +
                ", а нечетных = " + sumOdd);

        System.out.println("\nЗадание 2. Вывод чисел в интервале (min и max) в порядке убывания\n");
        int minNum = 10;
        int middleNum = 5;
        int maxNum = -1;

        if (minNum > maxNum) {
            int tmp = maxNum;
            maxNum = minNum;
            minNum = tmp;
        }

        if (middleNum > maxNum) {
            maxNum = middleNum;
        }

        if (middleNum < minNum) {
            minNum = middleNum;
        }

        for (int i = maxNum - 1; i > minNum; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nЗадание 3. Вывод реверсивного числа и суммы его цифр\n");
        int num = 1234;
        int sumDigits = 0;
        System.out.print("Исходное число в обратном порядке: ");
        while (num > 0) {
            int digit = num % 10;
            num /= 10;
            sumDigits += digit;
            System.out.print(digit);
        }
        System.out.println("\nСумма цифр числа: " + sumDigits);

        System.out.println("\nЗадание 4. Вывод чисел на консоль в несколько строк\n");
        int count = 1;
        for (int i = 1; i < 24; i += 2) {
            if (count == 6) {
                System.out.println();
                count = 1;
            }
            System.out.printf("%3d", i);
            count++;
        }

        while (count % 6 > 0) {
            System.out.printf("%3d", 0);
            count++;
        }

        System.out.println("\n\nЗадание 5. Проверка количества единиц на четность\n");
        num = 3_141_591;
        int copyNum = num;
        int countOnes = 0;
        while (copyNum > 0) {
            if (copyNum % 10 == 1) {
                countOnes++;
            }
            copyNum /= 10;
        }

        if (countOnes != 0) {
            if (countOnes % 2 == 0) {
                System.out.println("Число " + num + " содержит " + countOnes +
                         " (четное) количество единиц");
            } else {
                System.out.println("Число " + num + " содержит " + countOnes +
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
            if (count == symbolsInLine) {
                if (currentLine < 3) {
                    symbolsInLine++;
                } else {
                    symbolsInLine--;
                }
                count = 0;
                currentLine++;
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
        copyNum = num;
        int reversNum;
        for (reversNum = 0; copyNum > 0; copyNum /= 10) {
            reversNum = (reversNum * 10) + copyNum % 10;
        }
        
        if (reversNum == num) {
            System.out.println("Число " + num + " является палиндромом");
        } else {
            System.out.println("Число " + num + " не является палиндромом");
        }

        System.out.println("\nЗадание 9. Определение, является ли число счастливым\n");
        num = 127_235;
        int numLeftPart = num / 1000;
        System.out.print("Сумма цифр " + numLeftPart + " = ");
        int numRightPart = num - numLeftPart * 1000;
        int tmp = numRightPart;
        int sumLeftPart = 0;
        int sumRightPart = 0;

        for (int i = 0; i < 3; i++) {
            sumLeftPart += numLeftPart % 10;
            numLeftPart /= 10;

            sumRightPart += numRightPart % 10;
            numRightPart /= 10;
        }

        System.out.print(sumLeftPart);
        System.out.print("\nСумма цифр " + tmp + " = " + sumRightPart);

        if (sumLeftPart == sumRightPart) {
            System.out.println("\nЧисло является счастливым");
        } else {
            System.out.println("\nЧисло не является счастливым");
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