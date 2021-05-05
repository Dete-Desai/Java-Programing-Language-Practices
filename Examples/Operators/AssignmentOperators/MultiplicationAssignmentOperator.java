package Operators.AssignmentOperators;

public class MultiplicationAssignmentOperator {
    
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 20;

        num1 *= num2;

        System.out.println("The value for numberOne is: " +num1);
        System.out.println("The value for numberTwo is: " +num2);

        num2 *= num1;

        System.out.println("The value for numberOne is: " +num1);
        System.out.println("The value for numberTwo is: " +num2);
    }
}