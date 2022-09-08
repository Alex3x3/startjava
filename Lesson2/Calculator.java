public class Calculator {

    int num1;
    int num2;
    char sign;
    int result;

    public void calculate() {
        switch (sign) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '%':
                result = num1 % num2;
                break;
            case '^':
                result = num1;
                for (int i = 0; i < num2 - 1; i++) {
                    result *= num1;
                }
                break;
        }
    }
}