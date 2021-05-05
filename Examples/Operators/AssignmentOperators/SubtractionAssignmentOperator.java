package Operators.AssignmentOperators;

public class SubtractionAssignmentOperator {
    
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 50;

        num1 -= num2;

        System.out.println("The value for numberOne is: " +num1);
        System.out.println("The value for numberTwo is: " +num2);

        num2 -= num1;

        System.out.println("The value for numberOne is: " +num1);
        System.out.println("The value for numberTwo is: " +num2);
    }
}