import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("\n###Программа Калькулятор v0.99 beta###");
        Calculator calculator = new Calculator();
        boolean repeatCalculation = true;
        while (repeatCalculation) {
            Scanner input = new Scanner(System.in);
            System.out.print("\nВведите первое число: ");
            calculator.num1 = input.nextInt();
            System.out.print("Введите знак математической операции: ");
            calculator.sign = input.next().charAt(0);
            System.out.print("Введите второе число: ");
            calculator.num2 = input.nextInt();
            calculator.calculate();
            System.out.print(calculator.num1 + " " + calculator.sign + " " + calculator.num2 +
                    " = " + calculator.result);
            input.nextLine();

            while (true) {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                String userAnswer = input.nextLine();
                if (userAnswer.equals("no")) {
                    repeatCalculation = false;
                    break;
                } else if (userAnswer.equals("yes")) {
                    break;
                }
            }
        }
    }
}