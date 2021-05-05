package Operators.AssignmentOperators;

public class DivisionAssignmentOperator {
    
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 10;

        num1 /= num2;

        System.out.println("The value for number one is: " +num1);
        System.out.println("The value for number two is: " +num2);

        num2 /= num1;

        System.out.println("The value for number one is: " +num1);
        System.out.println("The value for number two is: " +num2);
    }
}