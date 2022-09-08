import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        System.out.println("\n###Программа Калькулятор v1.0###");
        Calculator calculator = new Calculator();
        String userAnswer = "yes";
        while (userAnswer.equals("yes")) {
            Scanner input = new Scanner(System.in);
            System.out.print("\nВведите первое число: ");
            calculator.setNum1(input.nextInt());
            System.out.print("Введите знак математической операции: ");
            calculator.setSign(input.next().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setNum2(input.nextInt());
            calculator.calculate();
            System.out.print(calculator.getNum1() + " " + calculator.getSign() + " " +
                    calculator.getNum2() + " = " + calculator.getResult());
            input.nextLine();
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                userAnswer = input.nextLine();
            } while (!userAnswer.equals("yes") && !userAnswer.equals("no"));
        }
    }
}