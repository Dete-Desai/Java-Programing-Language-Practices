import java.util.Scanner;

public class SwitchCaseStatement {

    public static void main(String[] args) {

        double number1;
        double number2;

        Scanner calculator = new Scanner(System.in);

        System.out.println("\n JAVA CALCULATOR\n");
        System.out.println("Enter the first number: ");
        number1 = calculator.nextDouble();

        System.out.println("Enter operator: ");
        char operator = calculator.next().charAt(0);

        System.out.println("Enter the second number: ");
        number2 = calculator.nextDouble();

        calculator.close();

        double outPut;

        switch (operator) {

        case '+':
            outPut = number1 + number2;
            break;
        case '-':
            outPut = number1 - number2;
            break;
        case '*':
            outPut = number1 * number2;
            break;
        case '/':
            outPut = number1 / number2;
            break;
        case '%':
            outPut = number1 % number2;
            break;
        default:
            outPut = number1;
            break;
        }

        System.out.println(number1 + " " + operator + " " + number2 + " = " + outPut);

    }

}
