import java.util.Scanner;

public class BasicArithmeticOperators {

    public static void main(String[] args) {

        int addend, adder, sum;
        int subtrahend, minuend, subtraction;
        int multiplicand, multiplier, multiplication;
        int dividend, divisor, division;
        int dividend1, divisor1, modulo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Addend Value: ");
        addend = sc.nextInt();
        System.out.println("Enter Adder Value: ");
        adder = sc.nextInt();

        sum = addend + adder;
        System.out.println("Sum: " +sum);

        System.out.println("Enter Subtrahend Value: ");
        subtrahend = sc.nextInt();
        System.out.println("Enter Minuend Value: ");
        minuend = sc.nextInt();

        subtraction = subtrahend - minuend;
        System.out.println("Subtraction: " +subtraction);

        System.out.println("Enter Multiplicand Value: ");
        multiplicand = sc.nextInt();
        System.out.println("Enter Multiplier Value: ");
        multiplier = sc.nextInt();

        multiplication = multiplicand * multiplier;
        System.out.println("Multiplication: " +multiplication);

        System.out.println("Enter Dividend Value: ");
        dividend = sc.nextInt();
        System.out.println("Enter Divisor Value: ");
        divisor = sc.nextInt();

        division = dividend / divisor;
        System.out.println("Division: " +division);

        System.out.println("Enter Dividend Value: ");
        dividend1 = sc.nextInt();
        System.out.println("Enter Divisor Value: ");
        divisor1 = sc.nextInt();

        modulo = dividend1 % divisor1;
        System.out.println("Modulo: " +modulo);

        sc.close();

        System.out.println("The Result for Addition is: " +sum);
        System.out.println("The Result for Subtraction is: " +subtraction);
        System.out.println("The Result for Multiplication is: " +multiplication);
        System.out.println("The Result for Division is: " +division);
        System.out.println("The Result for Modulo is: " +modulo);
    }
    
}
