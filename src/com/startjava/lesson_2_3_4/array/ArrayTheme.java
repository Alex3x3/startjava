package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArrayTheme {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1. Реверс значений массива\n");
        int[] intArr = {2, 3, 7, 1, 5, 4, 6};
        System.out.println("Массив до реверсирования:");
        ArrayTheme output = new ArrayTheme();
        output.showIntArr(intArr);
        System.out.println();

        int[] intArrRev = new int[intArr.length];
        for (int i = intArrRev.length - 1, j = 0; i >= 0; i--, j++) {
            intArrRev[i] = intArr[j];
        }
        System.out.println("\nМассив после реверсирования:");
        output.showIntArr(intArrRev);

        System.out.println("\n\nЗадание 2. Вывод произведения элементов массива\n");
        intArr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String expression = "";
        String unusedElements = "";
        int result = 1;
        for (int i = 0; i < intArr.length; i++) {
            expression += (intArr[i] != 0 && intArr[i] != 8 && intArr[i] != 9) ? (intArr[i] + " * ")
                    : intArr[i] == 8 ? (intArr[i] + " = ")
                    : ("");
            result *= (intArr[i] != 0 && intArr[i] != 9) ? intArr[i] : 1;
            unusedElements += (intArr[i] == 0 || intArr[i] == 9) ?
                    ("Индекс " + intArr[i] + " = "  + i + "\n")
                    : "";
        }
        System.out.println(expression + result);
        System.out.println(unusedElements);

        System.out.println("Задание 3. Удаление элементов массива\n");
        double[] doubleArr = new double[15];
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = Math.random();
        }
        System.out.println("Исходный массив:\n");
        output.showDoubleArr(doubleArr);

        int middleCellIndex = (doubleArr.length - 1) / 2;
        double middleCellValue = doubleArr[middleCellIndex];
        int zeroedCellCount = 0;
        for (int i = 0; i < doubleArr.length; i++) {
            if (doubleArr[i] > middleCellValue) {
                doubleArr[i] = 0;
                zeroedCellCount++;
            }
        }
        System.out.println("\nИзмененный массив:\n");
        output.showDoubleArr(doubleArr);
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
            for (int i = chArray.length - 1; i >= 0 ; i--) {
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
        output.showStringArr(srcStringArr);
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
        output.showStringArr(destStringArr);
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