import java.util.Scanner;

public class AssignmentSignOperators{

    public static void main(String[] args) {

        int addend, adder;
        int subtrahend, minuend;
        int multiplicand, multiplier;
        int dividend, divisor;
        int dividend1, divisor1;

        Scanner sc = new Scanner(System.in);

        //Addition
        System.out.println("Enter the first number: ");
        addend = sc.nextInt();
        System.out.println("Enter the second number: ");
        adder = sc.nextInt();

        addend += adder;
        System.out.println("Addend :" +addend);
        System.out.println("Adder :" +adder);

        adder += addend;
        System.out.println("Addend :" +addend);
        System.out.println("Adder :" +adder);

        //Subtraction
        System.out.println("Enter the first number: ");
        subtrahend = sc.nextInt();
        System.out.println("Enter the second number: ");
        minuend = sc.nextInt();

        subtrahend -= minuend;
        System.out.println("subtrahend :" +subtrahend);
        System.out.println("minuend :" +minuend);

        minuend -= subtrahend;
        System.out.println("subtrahend :" +subtrahend);
        System.out.println("minuend :" +minuend);

        //Multiplication
        System.out.println("Enter the first number: ");
        multiplicand = sc.nextInt();
        System.out.println("Enter the second number: ");
        multiplier = sc.nextInt();

        multiplicand *= multiplier;
        System.out.println("multiplicand :" +multiplicand);
        System.out.println("multiplier :" +multiplier);

        multiplier *= multiplicand;
        System.out.println("multiplicand :" +multiplicand);
        System.out.println("multiplier :" +multiplier);

        //Division
        System.out.println("Enter the first number: ");
        dividend = sc.nextInt();
        System.out.println("Enter the second number: ");
        divisor = sc.nextInt();

        dividend /= divisor;
        System.out.println("Dividend :" +dividend);
        System.out.println("Divisor :" +divisor);

        divisor /= dividend;
        System.out.println("Dividend :" +dividend);
        System.out.println("Divisor :" +divisor);

        //Modulo
        System.out.println("Enter the first number: ");
        dividend1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        divisor1 = sc.nextInt();

        dividend1 %= divisor1;
        System.out.println("Dividend1 :" +dividend1);
        System.out.println("Divisor1 :" +divisor1);

        divisor1 %= dividend1;
        System.out.println("Dividend1 :" +dividend1);
        System.out.println("Divisor1 :" +divisor1);

        sc.close();

        System.out.println("The final value for Addend is: " +addend);
        System.out.println("The final value for Adder is: " +adder);
        System.out.println("The final value for Subtrahend is: " +subtrahend);
        System.out.println("The final value for Minuend is: " +minuend);
        System.out.println("The final value for Multiplicand is: " +multiplicand);
        System.out.println("The final value for Multiplier is: " +multiplier);
        System.out.println("The final value for Dividend is: " +dividend);
        System.out.println("The final value for Divisor is: " +divisor);
        System.out.println("The final value for Dividend1 is: " +dividend1);
        System.out.println("The final value for Divisor1 is: " +divisor1);
    }
}