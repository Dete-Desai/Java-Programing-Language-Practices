package Operators.AssignmentOperators;

public class ModuloAssignmentOperator {
    
    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 21;
    
        num1 %= num2;
    
        System.out.println("The value for number one is: " +num1);
        System.out.println("The value for number two is: " +num2);

        num2 %= num1;
    
        System.out.println("The value for number one is: " +num1);
        System.out.println("The value for number two is: " +num2);
    }
}