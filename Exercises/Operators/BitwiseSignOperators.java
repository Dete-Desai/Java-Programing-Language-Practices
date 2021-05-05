// package Operators;

import java.util.Scanner;

public class BitwiseSignOperators {

    public static void main(String[] args) {

        int variableOne;
        int variableTwo;
        int result;
        int result1;
        int leftShiftValue;
        int rightShiftValue;

        Scanner sc = new Scanner(System.in);

        //THE BITWISE OPERATOR CALCULATOR
        System.out.println("\nTHE BITWISE OPERATOR CALCULATOR\n");
        System.out.println("\nTHE AND BITWISE OPERATOR\n");

        //Compares corresponding bits of num1 and num2 and 
        //generates 1 if both bits are equal, else it returns 0

        System.out.println("Enter the first value: ");
        variableOne = sc.nextInt();

        System.out.println("Enter the second value: ");
        variableTwo = sc.nextInt();

        System.out.println("Enter the value for result: ");
        result = sc.nextInt();

        result = variableOne & variableTwo;

        System.out.println("First value: " +(variableOne));
        System.out.println("First value: " +(variableTwo));
        System.out.println("The result '&' bitwise sign operator is: " +(result));

        //BITWISE OPERATOR CALCULATOR
        System.out.println("\nBITWISE OPERATOR CALCULATOR\n");

        // Compares corresponding bits of num1 and num2 and 
        //generates 1 if either bit is 1, else it returns 0.

        System.out.println("Enter the first value: ");
        variableOne = sc.nextInt();

        System.out.println("Enter the second value: ");
        variableTwo = sc.nextInt();

        System.out.println("Enter the value for result: ");
        result = sc.nextInt();

        result = variableOne | variableTwo;

        System.out.println("First value: " +(variableOne));
        System.out.println("First value: " +(variableTwo));
        System.out.println("The result '|' bitwise sign operator is: " +(result));

        //THE EQUAL BITWISE OPERATOR
        System.out.println("\nTHE EQUAL BITWISE OPERATOR\n");

        // Compares corresponding bits of num1 and num2 and 
        //generates 1 if they are not equal, else it returns 0.

        System.out.println("Enter the first value: ");
        variableOne = sc.nextInt();

        System.out.println("Enter the second value: ");
        variableTwo = sc.nextInt();

        System.out.println("Enter the value for result: ");
        result = sc.nextInt();

        result = variableOne ^ variableTwo;

        System.out.println("First value: " +(variableOne));
        System.out.println("First value: " +(variableTwo));
        System.out.println("The result '^' bitwise sign operator is: " +(result));

        //THE COMPLIMENTARY BITWISE OPERATOR
        System.out.println("\nTHE COMPLIMENTARY BITWISE OPERATOR\n");

        // complement operator that just changes the bit from 0 to 1 and 1 to 0.

        System.out.println("Enter the first value: ");
        variableOne = sc.nextInt();

        System.out.println("Enter the second value: ");
        variableTwo = sc.nextInt();

        System.out.println("Enter the value for result: ");
        result = sc.nextInt();

        System.out.println("First value: " +(variableOne));
        System.out.println("First value: " +(variableTwo));

        result = ~ variableOne;
        System.out.println("The result of '~' bitwise sign operator for the first value is: " +(result));

        result1 = ~ variableOne;
        System.out.println("The result of '~' bitwise sign operator for the second value is: " +(result1));

        //THE LEFT SHIFT BITWISE OPERATOR
        System.out.println("\nTHE LEFT SHIFT BITWISE OPERATOR\n");

        //moves the bits to the left, discards the far left bit, and 
        //assigns the rightmost bit a value of 0.

        System.out.println("Enter the first value: ");
        variableOne = sc.nextInt();

        System.out.println("Enter the second value: ");
        variableTwo = sc.nextInt();

        System.out.println("Enter the value for result: ");
        result = sc.nextInt();

        System.out.println("Enter the value to be shifted to the left: ");
        leftShiftValue = sc.nextInt();

        System.out.println("First value: " +(variableOne));
        System.out.println("First value: " +(variableTwo));
        System.out.println("Left Shift value: " +(leftShiftValue));

        result = variableOne << leftShiftValue;
        System.out.println("The result of '<<' bitwise sign operator for the first value is: " +(result));

        result1 = variableTwo << leftShiftValue;
        System.out.println("The result of '<<' bitwise sign operator for the second value is: " +(result1));

        //THE LEFT SHIFT BITWISE OPERATOR
        System.out.println("\nTHE LEFT SHIFT BITWISE OPERATOR\n");

        //moves the bits to the left, discards the far left bit, and 
        //assigns the rightmost bit a value of 0.

        System.out.println("Enter the first value: ");
        variableOne = sc.nextInt();

        System.out.println("Enter the second value: ");
        variableTwo = sc.nextInt();

        System.out.println("Enter the value for result: ");
        result = sc.nextInt();

        System.out.println("Enter the value to be shifted to the right: ");
        rightShiftValue = sc.nextInt();

        System.out.println("First value: " +(variableOne));
        System.out.println("First value: " +(variableTwo));
        System.out.println("Right Shift value: " +(rightShiftValue));

        result = variableOne >> rightShiftValue;
        System.out.println("The result of '<<' bitwise sign operator for the first value is: " +(result));

        result1 = variableTwo >> rightShiftValue;
        System.out.println("The result of '<<' bitwise sign operator for the second value is: " +(result1));

        sc.close();
    }
    
}
