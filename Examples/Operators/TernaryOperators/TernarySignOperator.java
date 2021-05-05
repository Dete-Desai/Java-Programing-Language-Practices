package Operators.TernaryOperators;

public class TernarySignOperator {
    
    public static void main(String[] args) {
        
        int variableOne = 100;
        int variableTwo;

        variableTwo = (variableOne == 10) ? 200 : 400;
        System.out.println("The result for the second value is: " +(variableTwo));

        variableTwo = (variableOne == 100)? 500 : 1000;
        System.out.println("The result for the second value is: " +(variableTwo));


    }
    
}
