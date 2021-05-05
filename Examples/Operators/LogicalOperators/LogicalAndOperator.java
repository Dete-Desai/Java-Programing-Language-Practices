package Operators.LogicalOperators;

public class LogicalAndOperator {

    public static void main(String[] args) {

        boolean variableOne;
        boolean variableTwo;

        variableOne = true;
        variableTwo = true;

        System.out.println("The result for 'variableOne && variableTwo' is: " +(variableOne&&variableTwo));

        variableOne = false;
        variableTwo = false;
        
        System.out.println("The result for 'variableOne && variableTwo' is: " +(variableOne&&variableTwo));

        variableOne = true;
        variableTwo = false;
        
        System.out.println("The result for 'variableOne && variableTwo' is: " +(variableOne&&variableTwo));
    }
    
}
