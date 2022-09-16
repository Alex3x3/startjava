package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1. Реверс значений массива\n");
        int[] intArr = {2, 3, 7, 1, 5, 4, 6};
        System.out.println("Массив до реверсирования:");
        ArrayTheme arrayTheme = new ArrayTheme();
        arrayTheme.printIntArr(intArr);
        System.out.println();

        int len = intArr.length;
        for (int i = 0, j = len - 1; i < len / 2; i++, j--) {
            int tmp = intArr[i];
            intArr[i] = intArr[j];
            intArr[j] = tmp;
        }
        System.out.println("\nМассив после реверсирования:");
        arrayTheme.printIntArr(intArr);

        System.out.println("\n\nЗадание 2. Вывод произведения элементов массива\n");
        intArr = new int[10];
        for (int i = 0; i < 10; i++) {
            intArr[i] = i;
        }

        int result = 1;
        len = intArr.length;
        for (int i = 1; i < len - 1; i++) {
            result *= intArr[i];
            System.out.print(intArr[i] + ((intArr[i] != 8) ? (" * ") : (" = " + result)));
        }
        System.out.println("\n\nИндекс " + intArr[0] + " = " + intArr[0] +
                ", индекс " + intArr[9] + " = " + intArr[9]);

        System.out.println("\nЗадание 3. Удаление элементов массива\n");
        double[] doubleArr = new double[15];
        len = doubleArr.length;
        for (int i = 0; i < len; i++) {
            doubleArr[i] = Math.random();
        }
        System.out.println("Исходный массив:\n");
        arrayTheme.printDoubleArr(doubleArr);

        double middleCellValue = doubleArr[(len - 1) / 2];
        int zeroedCellCount = 0;
        for (int i = 0; i < len; i++) {
            if (doubleArr[i] > middleCellValue) {
                doubleArr[i] = 0;
                zeroedCellCount++;
            }
        }
        System.out.println("\nИзмененный массив:\n");
        arrayTheme.printDoubleArr(doubleArr);
        System.out.println("\nколичество обнуленных ячеек: " + zeroedCellCount);

        System.out.println("\nЗадание 4. Вывод элементов массива лесенкой в обратном порядке\n");
        char[] abc = new char['Z' - 'A' + 1];
        len = abc.length;
        for (int i = 0; i < len; i++) {
            abc[i] = (char) ('A' + i);
        }

        for (int i = 0; i < len; i++) {
            for (int j = len - 1; j >= len - 1 - i; j--) {
                System.out.print(abc[j]);
            }
            System.out.println();
        }

        System.out.println("\nЗадание 5. Генерация уникальных чисел\n");
        intArr = new int[30];
        len = intArr.length;
        for (int i = 0; i < len; i++) {
            boolean uniqueNum;
            do {
                intArr[i] = (int) (Math.random() * 40 + 60);
                uniqueNum = true;
                for (int j = 0; j < i; j++) {
                    if (intArr[i] == intArr[j]) {
                        uniqueNum = false;
                        break;
                    }
                }
            } while (!uniqueNum);
        }

        Arrays.sort(intArr);
        for (int i = 0, j = 1; i < len; i++, j++) {
            System.out.printf("%3d", intArr[i]);
            if (j == 10) {
                j = 0;
                System.out.println();
            }
        }

        System.out.println("\nЗадание 6. Сдвиг элементов массива\n");
        String[] srcStringArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        System.out.print("Исходный массив: ");
        arrayTheme.printStringArr(srcStringArr);
        System.out.println();

        int count = 0;
        for (String s : srcStringArr) {
            if (!s.isBlank()) {
                count++;
            }
        }

        String[] destStringArr = new String[count];
        int srcPos = 0;
        int destPos = 0;
        int length = 0;
        for (int i = 0; i < srcStringArr.length; i++) {
            if (!srcStringArr[i].isBlank()) {
                length++;
            } else {
                System.arraycopy(srcStringArr, srcPos, destStringArr, destPos, length);
                destPos += length;
                length = 0;
                srcPos = i + 1;
            }
        }
        System.out.print("Преобразованный массив: ");
        arrayTheme.printStringArr(destStringArr);
        System.out.println();
    }

    private void printIntArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private void printDoubleArr(double[] arr) {
        int numPosition = 0;
        for (double d : arr) {
            System.out.printf("%6.3f", d);
            if (numPosition % 7 == 0 && numPosition != 0) {
                System.out.println();
            }
            numPosition++;
        }
    }

    private void printStringArr(String[] arr) {
        for (String s : arr) {
            System.out.print(s);
        }
    }
}