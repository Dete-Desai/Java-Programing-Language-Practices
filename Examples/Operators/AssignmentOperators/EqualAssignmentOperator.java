package Operators.AssignmentOperators;

public class EqualAssignmentOperator {
    
    public static void main(String[] args) {

        int numberOne = 100;
        int numberTwo = 50;

        numberOne = numberTwo;

        System.out.println("The value for numberOne is: " +numberOne);
        System.out.println("The value for numberTwo is: " +numberTwo);

        numberTwo = numberOne;

        System.out.println("The value for numberOne is: " +numberOne);
        System.out.println("The value for numberTwo is: " +numberTwo);
    }
}
