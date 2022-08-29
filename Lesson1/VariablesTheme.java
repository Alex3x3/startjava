public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("Задание 1: Создание переменных и вывод их значений на консоль\n");
        byte coresNum = 4;
        System.out.println("Количество ядер: " + coresNum);
        short cpuFrequency = 3800;
        System.out.println("Частота ядра: " + cpuFrequency + " MHz");
        char cpuStepping = 'D';
        System.out.println("Степпинг ЦП: " + cpuStepping);
        int l1DataCashValue = 32000;
        System.out.println("Кэш L1 данных на ядро: " + l1DataCashValue + " KB");
        long l2CashValue = 256000L;
        System.out.println("Кэш L2: " + l2CashValue + " KB");
        float cpuCaseLength = 37.5F;
        System.out.println("Длина CPU " + cpuCaseLength + " мм");
        double cpuCaseWidth = 40.15;
        System.out.println("Ширина CPU " + cpuCaseWidth + " мм");
        boolean isManufacturedByIntel = true;
        System.out.println("Произведено в Intel: " + isManufacturedByIntel);

        System.out.println("\nЗадание 2: Расчет стоимости товара со скидкой\n");
        int penPrice = 100;
        int bookPrice = 200;
        int discountPercentage = 11;
        int fullPrice = penPrice + bookPrice;
        int discountSum = fullPrice * discountPercentage/100;
        int discountPrice = fullPrice - discountSum;
        System.out.println("Сумма скидки: " + discountSum);
        System.out.println("Общая стоимость товаров со скидкой: " + discountPrice);

        System.out.println("\nЗадание 3: Вывод на консоль слова JAVA\n");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\nЗадание 4: Отображение min и max значений числовых типов данных\n");
        byte byteNum = 127;
        System.out.println("Byte type number: " + byteNum + ", " + (++byteNum) + ", " +
                (--byteNum));
        short shortNum = 32_767;
        System.out.println("Short type number: " + shortNum + ", " + (++shortNum) + ", " +
                (--shortNum));
        char charNum = 65_535;
        System.out.println("Char type number: " + (int) charNum + ", " + (int) (++charNum) + ", " +
                (int) (--charNum));
        int intNum = 2_147_483_647;
        System.out.println("Int type number: " + intNum + ", " + (++intNum) + ", " +
                (--intNum));
        long longNum = 9_223_372_036_854_775_807L;
        System.out.println("Long type number: " + (longNum) + ", " + (++longNum) + ", " +
                (--longNum));

        System.out.println("\nЗадание 5: Перестановка значений переменных\n");
        System.out.println("Перестановка с помощью третьей переменной");
        int num1 = 2;
        int num2 = 5;
        System.out.println("До перестановки: Число1 = " + num1 + ", Число2 = " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("После перестановки: Число1 = " + num1 + ", Число2 = " + num2
                + "\n");

        System.out.println("Перестановка с помощью арифметических операций");
        System.out.println("До перестановки: Число1 = " + num1 + ", Число2 = " + num2);
        int diff = num1 - num2;
        num1 -= diff;
        num2 += diff;
        System.out.println("После перестановки: Число1 = " + num1 + ", Число2 = " + num2
                + "\n");

        System.out.println("Перестановка с помощью побитовой операции ^");
        System.out.println("До перестановки: Число1 = " + num1 + ", Число2 = " + num2);
        diff = num1 ^ num2;
        num1 = num1 ^ diff;
        num2 = num2 ^ diff;
        System.out.println("После перестановки: Число1 = " + num1 + ", Число2 = " + num2);

        System.out.println("\nЗадание 6: Вывод символов и их кодов\n");
        char code1 = 35;
        System.out.println((int) code1 + " " + code1);
        char code2 = 38;
        System.out.println((int) code2 + " " + code2);
        char code3 = 64;
        System.out.println((int) code3 + " " + code3);
        char code4 = 94;
        System.out.println((int) code4 + " " + code4);
        char code5 = 95;
        System.out.println((int) code5 + " " + code5);

        System.out.println("\nЗадание 7: Отображение количества сотен, десятков и единиц числа\n");
        int srcNum = 123;
        System.out.println("Число " + srcNum + " содержит:");
        int hundreds = srcNum / 100;
        System.out.println(hundreds + " сотен");
        int dozens = srcNum % 100 / 10;
        System.out.println(dozens + " десятков");
        int ones = srcNum % 100 % 10;
        System.out.println(ones + " единиц");

        System.out.println("\nЗадание 8: Вывод на консоль ASCII-арт Дюка\n");
        char slash = '/';
        char backslash = '\\';
        char point = ' ';
        char underline = '_';
        char leftBracket = '(';
        char rightBracket = ')';
        System.out.println("" + point + point + point + point + slash +
                backslash);
        System.out.println("" + point + point + point + slash + point +
                point + backslash);
        System.out.println("" + point + point + slash + underline + leftBracket +
                point + rightBracket + backslash);
        System.out.println("" + point + slash + point + point + point +
                point + point + point + backslash);
        System.out.println("" + slash + underline + underline + underline + underline +
                slash + backslash + underline + underline + backslash);

        System.out.println("\nЗадание 9: Произведение и сумма цифр числа\n");
        srcNum = 345;
        hundreds = srcNum / 100;
        dozens = srcNum % 100 / 10;
        ones = srcNum % 100 % 10;
        int prodDigits = hundreds * dozens * ones;
        int sumDigits = hundreds + dozens + ones;
        System.out.println("Сумма цифр числа "  + srcNum + " равна: " + sumDigits
);
        System.out.println("Произведение цифр числа "  + srcNum + " равна: " + prodDigits);

        System.out.println("\nЗадание 10: Преобразование секунд\n");
        int totalSec = 86399;
        int hours = totalSec / 3600;
        int minutes = totalSec % 3600 / 60;
        totalSec = totalSec % 3600 % 60;
        System.out.println(hours + ":" + minutes + ":" + totalSec);
    }
}