public class VariablesTheme {

    public static void main(String[] args) {
        System.out.println("Задание 1: Создание переменных и вывод их значений на консоль\n");
        byte coresNum = 4;
        System.out.println("Количество ядер: " + coresNum);
        short cpuFrequency = 3800 ;
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
        boolean manufacturedByIntel = true;
        System.out.println("Произведено в Intel: " + manufacturedByIntel);

        System.out.println("\nЗадание 2: Расчет стоимости товара со скидкой\n");
        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;
        int fullPrice = penPrice + bookPrice;
        int discountSum = fullPrice*discount/100;
        int priceWithDiscount = fullPrice - discountSum;
        System.out.println("Сумма скидки: " + discountSum);
        System.out.println("Общая стоимость товаров со скидкой: " + priceWithDiscount);

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
        float floatNum = 3.4028235E38F;
        System.out.println("Float type number: " + (floatNum) + ", " + (++floatNum+1) + ", " +
                (--floatNum));
        double doubleNum = 1.7976931348623157E308;
        System.out.println("Double type number: " + (doubleNum) + ", " + (++doubleNum) + ", " +
                (--doubleNum));

        System.out.println("\nЗадание 5: Перестановка значений переменных\n");
        System.out.println("Перестановка с помощью третьей переменной");
        int intNum1 = 2;
        int intNum2 = 5;
        System.out.println("До перестановки: Число1 = " + intNum1 + ", Число2 = " + intNum2);
        int intTempNum = intNum1;
        intNum1 = intNum2;
        intNum2 = intTempNum;
        System.out.println("После перестановки: Число1 = " + intNum1 + ", Число2 = " + intNum2);
        System.out.println("Перестановка с помощью арифметических операций");
        System.out.println("До перестановки: Число1 = " + intNum1 + ", Число2 = " + intNum2);
        intNum1 -= 3;
        intNum2 += 3;
        System.out.println("После перестановки: Число1 = " + intNum1 + ", Число2 = " + intNum2);
        System.out.println("Перестановка с помощью побитовой операции ^");
        System.out.println("До перестановки: Число1 = " + intNum1 + ", Число2 = " + intNum2);
        intNum1 = intNum1 ^ 7;
        intNum2 = intNum2 ^ 7;
        System.out.println("После перестановки: Число1 = " + intNum1 + ", Число2 = " + intNum2);

        System.out.println("\nЗадание 6: Вывод символов и их кодов\n");
        char charValue1 = 35;
        System.out.println((int) charValue1 + " " + charValue1);
        char charValue2 = 38;
        System.out.println((int) charValue2 + " " + charValue2);
        char charValue3 = 64;
        System.out.println((int) charValue3 + " " + charValue3);
        char charValue4 = 94;
        System.out.println((int) charValue4 + " " + charValue4);
        char charValue5 = 95;
        System.out.println((int) charValue5 + " " + charValue5);


        System.out.println("\nЗадание 7: Отображение количества сотен, десятков и единиц числа\n");
        int srcNum = 123;
        System.out.println("Число " + srcNum + " содержит:");
        int hundreds = srcNum/100;
        System.out.println(hundreds + " сотен");
        int dozens = (srcNum - hundreds*100)/10;
        System.out.println(dozens + " десятков");
        int units = srcNum % 10;
        System.out.println(units + " единиц");

        System.out.println("\nЗадание 8: Вывод на консоль ASCII-арт Дюка\n");
        charValue1 = '/';
        charValue2 = '\\';
        charValue3 = ' ';
        charValue4 = '_';
        charValue5 = '(';
        char charValue6 = ')';
        System.out.println("" + charValue3 + charValue3 + charValue3 + charValue3 + charValue1 +
                charValue2);
        System.out.println("" + charValue3 + charValue3 + charValue3 + charValue1 + charValue3 +
                charValue3 + charValue2);
        System.out.println("" + charValue3 + charValue3 + charValue1 + charValue4 + charValue5 +
                charValue3 + charValue6 + charValue2);
        System.out.println("" + charValue3 + charValue1 + charValue3 + charValue3 + charValue3 +
                charValue3 + charValue3 + charValue3 + charValue2);
        System.out.println("" + charValue1 + charValue4 + charValue4 + charValue4 + charValue4 +
                charValue1 + charValue2 + charValue4 + charValue4 + charValue2);

        System.out.println("\nЗадание 9: Произведение и сумма цифр числа\n");
        srcNum = 345;
        hundreds = srcNum/100;
        dozens = (srcNum - hundreds*100)/10;
        units = srcNum % 10;
        int productOfNums = hundreds * dozens * units;
        int sumOfNums = hundreds + dozens + units;
        System.out.println("Сумма цифр числа "  + srcNum + " равна: " + sumOfNums);
        System.out.println("Произведение цифр числа "  + srcNum + " равна: " + productOfNums);


        System.out.println("\nЗадание 10: Преобразование секунд\n");
        int sec = 86399;
        int hours = sec / 3600 ;
        int minutes = (86399 - hours * 3600) / 60;
        sec %= 60;
        System.out.println(hours + ":" + minutes + ":" + sec);
    }
}