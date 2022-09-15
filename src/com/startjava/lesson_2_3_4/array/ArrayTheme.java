package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1. Реверс значений массива\n");
        int[] intArr = {2, 3, 7, 1, 5, 4, 6};
        System.out.println("Массив до реверсирования:");
        ArrayTheme arrayTheme = new ArrayTheme();
        arrayTheme.showIntArr(intArr);
        System.out.println();

        for (int i = 0, j = intArr.length - 1; i < intArr.length / 2; i++, j--) {
            int tmp = intArr[i];
            intArr[i] = intArr[j];
            intArr[j] = tmp;
        }
        System.out.println("\nМассив после реверсирования:");
        arrayTheme.showIntArr(intArr);

        System.out.println("\n\nЗадание 2. Вывод произведения элементов массива\n");
        intArr = new int[10];
        for (int i = 0; i < 10; i++) {
            intArr[i] = i;
        }

        int result = 1;
        for (int i = 1; i < intArr.length - 1; i++) {
            result *= intArr[i];
            System.out.print(intArr[i] != 8 ? (intArr[i] + " * ")
                    : intArr[i] == 8 ? (intArr[i] + " = " + result)
                    : (""));
        }
        System.out.println("\n\n" + intArr[0] + " " + intArr[9]);

        System.out.println("\nЗадание 3. Удаление элементов массива\n");
        double[] doubleArr = new double[15];
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = Math.random();
        }
        System.out.println("Исходный массив:\n");
        arrayTheme.showDoubleArr(doubleArr);

        double middleCellValue = doubleArr[(doubleArr.length - 1) / 2];
        int zeroedCellCount = 0;
        for (int i = 0; i < doubleArr.length; i++) {
            if (doubleArr[i] > middleCellValue) {
                doubleArr[i] = 0;
                zeroedCellCount++;
            }
        }
        System.out.println("\nИзмененный массив:\n");
        arrayTheme.showDoubleArr(doubleArr);
        System.out.println("\nколичество обнуленных ячеек: " + zeroedCellCount);

        System.out.println("\nЗадание 4. Вывод элементов массива лесенкой в обратном порядке\n");
        char[] chArray = new char['Z' - 'A' + 1];
        char currentSymbol = 'A';
        for (int i = 0; i < chArray.length; i++) {
            chArray[i] = currentSymbol++;
        }
        int elementsInRow = 1;
        int currentPos = 0;
        while (elementsInRow <= chArray.length) {
            for (int i = chArray.length - 1; i >= 0; i--) {
                System.out.print(chArray[i]);
                currentPos++;

                if (elementsInRow == currentPos) {
                    System.out.println();
                    currentPos = 0;
                    elementsInRow++;
                    break;
                }
            }
        }

        System.out.println("\nЗадание 5. Генерация уникальных чисел\n");
        intArr = new int[30];
        for (int i = 0; i < intArr.length; i++) {
            boolean repeat;
            do {
                intArr[i] = (int) (Math.random() * 40 + 60);
                repeat = false;
                for (int j = 0; j < i; j++) {
                    if (intArr[i] == intArr[j]) {
                        repeat = true;
                        break;
                    }
                }
            } while (repeat);
        }

        Arrays.sort(intArr);
        for (int i = 0, j = 1; i < intArr.length; i++, j++) {
            System.out.printf("%3d", intArr[i]);
            if (j == 10) {
                j = 0;
                System.out.println();
            }
        }

        System.out.println("\nЗадание 6. Сдвиг элементов массива\n");
        String[] srcStringArr = {"    ", "AA", "", "BBB", "CC", "D", "    ", "E", "FF", "G", ""};
        System.out.print("Исходный массив: ");
        arrayTheme.showStringArr(srcStringArr);
        System.out.println();

        int count = 0;
        for (String s : srcStringArr) {
            if (!s.contains(" ") && s.length() > 0) {
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
        arrayTheme.showStringArr(destStringArr);
        System.out.println();
    }

    private void showIntArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private void showDoubleArr(double[] arr) {
        int numPosition = 0;
        for (double d : arr) {
            System.out.printf("%6.3f", d);
            if (numPosition % 7 == 0 && numPosition != 0) {
                System.out.println();
            }
            numPosition++;
        }
    }

    private void showStringArr(String[] arr) {
        for (String s : arr) {
            System.out.print(s);
        }
    }
}